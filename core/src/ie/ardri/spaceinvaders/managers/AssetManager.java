package ie.ardri.spaceinvaders.managers;

import com.artemis.Manager;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;

public class AssetManager extends Manager {
  private Texture tank, invader, bullet, shelter;
  private Sound coverDamaged, explosion, invaderGun, tankGun;

  public enum TextureFile {
    TANK,
    INVADER,
    SHELTER,
    BULLET
  }

  public enum SoundFile {
    COVER_DAMAGED,
    EXPLOSION,
    INVADER_GUN,
    TANK_GUN
  }

  public AssetManager() {
    importTextures();
    importSounds();
  }

  public Texture get(TextureFile texture) {
    switch (texture) {
      case TANK:    return tank;
      case INVADER: return invader;
      case SHELTER: return shelter;
      case BULLET:  return bullet;
      default:      return null;
    }
  }

  public Sound get(SoundFile sound) {
    switch ( sound) {
      case TANK_GUN:      return tankGun;
      case EXPLOSION:     return explosion;
      case INVADER_GUN:   return invaderGun;
      case COVER_DAMAGED: return coverDamaged;
      default:            return null;
    }
  }

  private void importTextures() {
    tank    = new Texture(Gdx.files.internal("images/tank.png"));
    invader = new Texture(Gdx.files.internal("images/invader.png"));
    bullet  = new Texture(Gdx.files.internal("images/bullet.png"));
    shelter = new Texture(Gdx.files.internal("images/shelter.png"));
  }

  private void importSounds() {
    coverDamaged = Gdx.audio.newSound(Gdx.files.internal("sounds/cover_damaged.wav"));
    explosion    = Gdx.audio.newSound(Gdx.files.internal("sounds/explosion.wav"));
    invaderGun   = Gdx.audio.newSound(Gdx.files.internal("sounds/invader_gun.wav"));
    tankGun      = Gdx.audio.newSound(Gdx.files.internal("sounds/tank_gun.wav"));
  }
}
