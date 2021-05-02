package uwu.misaka.anonimusesvssanitars;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import uwu.misaka.anonimusesvssanitars.screens.MainMenu;
import uwu.misaka.anonimusesvssanitars.service.Bundles;

public class AnonimusesVsSanitars extends Game {
	public SpriteBatch batch;
	public BitmapFont font;

	@Override
	public void create() {
		Bundles.init();

		batch = new SpriteBatch();
		font = new BitmapFont(Gdx.files.internal("fonts/icon.ttf"));
		font.setColor(Color.GREEN);
		this.setScreen(new MainMenu(this));
	}

	@Override
	public void render () {
		super.render();
	}

	@Override
	public void dispose () {
		batch.dispose();
		font.dispose();
	}
}
