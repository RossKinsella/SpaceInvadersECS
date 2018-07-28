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
  private World world;

	@Override
	public void create () {
	  Assets.initialise();
    WorldConfiguration configuration = new WorldConfigurationBuilder()
        .with(new Rendering())
        .build();
    world = new World(configuration);
    LocalPlayerFactory.createLocalPlayer(world, 5, 20);
	}

  @Override
  public void render () {
    world.setDelta(Gdx.graphics.getDeltaTime());
    world.process();
  }
}
