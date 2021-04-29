package uwu.misaka.anonimusesvssanitars.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import uwu.misaka.anonimusesvssanitars.AnonimusesVsSanitars;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new AnonimusesVsSanitars(), config);
	}
}
