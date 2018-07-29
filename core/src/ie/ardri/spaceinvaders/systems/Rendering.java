package ie.ardri.spaceinvaders.systems;

import com.artemis.Aspect;
import com.artemis.ComponentMapper;
import com.artemis.Entity;
import com.artemis.annotations.Wire;
import com.artemis.systems.EntityProcessingSystem;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import ie.ardri.spaceinvaders.components.SpriteComponent;

@Wire
public class Rendering extends EntityProcessingSystem {

  protected ComponentMapper<SpriteComponent> spriteComponentMapper;

  private SpriteBatch batch;
  private SpriteComponent spriteComponent;

  public Rendering() {
    super(Aspect.all(SpriteComponent.class));

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
    spriteComponent = spriteComponentMapper.get(e);
    spriteComponent.sprite.draw(batch);
  }

  @Override
  protected void end() {
    batch.end();
  }

}