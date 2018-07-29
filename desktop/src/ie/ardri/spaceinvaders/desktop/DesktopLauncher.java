package ie.ardri.spaceinvaders.desktop;

import static ie.ardri.spaceinvaders.MyGdxGame.GAME_HEIGHT;
import static ie.ardri.spaceinvaders.MyGdxGame.GAME_WIDTH;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import ie.ardri.spaceinvaders.MyGdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.height = GAME_WIDTH;
		config.width = GAME_HEIGHT;
		new LwjglApplication(new MyGdxGame(), config);
	}
}
