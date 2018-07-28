package ie.ardri.spaceinvaders.components;

import com.artemis.Component;
import ie.ardri.spaceinvaders.managers.Assets.TextureFile;

public class Texture extends Component {
  public TextureFile reference;

  public Texture() {}

  public Texture(TextureFile reference) {
    this.reference = reference;
  }
}
