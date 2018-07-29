package ie.ardri.spaceinvaders.factories;

import com.artemis.Entity;
import com.artemis.World;
import ie.ardri.spaceinvaders.components.PlayerControlled;
import ie.ardri.spaceinvaders.components.Position;
import ie.ardri.spaceinvaders.components.SpriteComponent;
import ie.ardri.spaceinvaders.managers.Assets.TextureFile;

public class LocalPlayerFactory {
  public static Entity createLocalPlayer(World world, float x, float y) {
    return world
        .createEntity()
        .edit()
        .add(new Position(x, y))
        .add(new SpriteComponent(TextureFile.TANK, x, y))
        .add(new PlayerControlled())
        .getEntity();
  }
}