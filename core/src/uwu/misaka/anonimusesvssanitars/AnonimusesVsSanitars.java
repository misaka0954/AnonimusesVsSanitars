package uwu.misaka.anonimusesvssanitars;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import uwu.misaka.anonimusesvssanitars.screens.MainMenu;

public class AnonimusesVsSanitars extends Game {
	public SpriteBatch batch;
	public BitmapFont font;

	@Override
	public void create() {
		Consts.init();

		batch = new SpriteBatch();
		font = new BitmapFont();
		this.setScreen(new MainMenu(this));
	}

	@Override
	public void render () {
		super.render();
	}

	@Override
	public void dispose () {
		batch.dispose();
	}
}
