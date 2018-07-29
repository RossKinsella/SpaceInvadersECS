package ie.ardri.spaceinvaders.systems;

import com.artemis.Aspect;
import com.artemis.ComponentMapper;
import com.artemis.Entity;
import com.artemis.annotations.Wire;
import com.artemis.systems.EntityProcessingSystem;
import com.badlogic.gdx.graphics.g2d.Sprite;
import ie.ardri.spaceinvaders.components.Position;
import ie.ardri.spaceinvaders.components.SpriteComponent;

@Wire
public class SpritePositionSyncingSystem extends EntityProcessingSystem {
  private ComponentMapper<Position> positionMapper;
  private ComponentMapper<SpriteComponent> spriteComponentMapper;

  public SpritePositionSyncingSystem() {
    super(Aspect.all(Position.class, SpriteComponent.class));
  }

  @Override
  protected void process(Entity e) {
    Position position = positionMapper.get(e);
    Sprite sprite = spriteComponentMapper.get(e).sprite;
    sprite.setPosition(position.x, position.y);
  }
}