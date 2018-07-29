package ie.ardri.spaceinvaders.components;

import com.artemis.Component;
import com.artemis.annotations.Transient;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import ie.ardri.spaceinvaders.managers.Assets;
import ie.ardri.spaceinvaders.managers.Assets.TextureFile;

@Transient
public class SpriteComponent extends Component {
  public Sprite sprite;

  public SpriteComponent() {}

  public SpriteComponent(TextureFile textureFile, float x, float y) {
    Texture texture = Assets.get(textureFile);
    sprite = new Sprite(texture);
    sprite.setPosition(x, y);
  }
}
