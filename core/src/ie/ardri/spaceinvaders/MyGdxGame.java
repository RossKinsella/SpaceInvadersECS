package ie.ardri.spaceinvaders;

import com.artemis.World;
import com.artemis.WorldConfiguration;
import com.artemis.WorldConfigurationBuilder;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import ie.ardri.spaceinvaders.factories.LocalPlayerFactory;
import ie.ardri.spaceinvaders.managers.Assets;
import ie.ardri.spaceinvaders.systems.Rendering;

public class MyGdxGame extends ApplicationAdapter {
  public static final int GAME_WIDTH = 500;
  public static final int GAME_HEIGHT = 500;
  private World world;

	@Override
	public void create () {
	  Assets.initialise();
    WorldConfiguration configuration = new WorldConfigurationBuilder()
        .with(new Rendering())
        .build();
    world = new World(configuration);
    LocalPlayerFactory.createLocalPlayer(world, GAME_WIDTH / 2 - 32 / 2, 20);
	}

  @Override
  public void render () {
    world.setDelta(Gdx.graphics.getDeltaTime());
    world.process();
  }
}
