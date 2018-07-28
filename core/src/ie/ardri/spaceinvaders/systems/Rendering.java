package ie.ardri.spaceinvaders.systems;

import com.artemis.Aspect;
import com.artemis.ComponentMapper;
import com.artemis.Entity;
import com.artemis.annotations.Wire;
import com.artemis.systems.EntityProcessingSystem;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import ie.ardri.spaceinvaders.components.Position;
import ie.ardri.spaceinvaders.components.Texture;
import ie.ardri.spaceinvaders.managers.Assets;

@Wire
public class Rendering extends EntityProcessingSystem {

  protected ComponentMapper<Texture> textureReferenceMapper;
  protected ComponentMapper<Position>  positionMapper;

  private SpriteBatch batch;
  private Texture texture;
  private Position position;

  public Rendering() {
    super(Aspect.all(Texture.class, Position.class));

    batch = new SpriteBatch();
  }

  @Override
  protected void begin() {
    Gdx.gl.glClearColor(0, 0, 0.2f, 1);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    batch.begin();
  }

  @Override
  protected void process(Entity e) {
    texture = textureReferenceMapper.get(e);
    position = positionMapper.get(e);
    batch.draw(Assets.get(texture.reference), position.x, position.y);
  }

  @Override
  protected void end() {
    batch.end();
  }

}