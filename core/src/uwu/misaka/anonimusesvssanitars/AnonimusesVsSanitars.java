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
	public BitmapFont font_green;
	public BitmapFont font_red;
	public BitmapFont font_orange;
	public BitmapFont font_white;
	public BitmapFont font_black;

	@Override
	public void create() {
		Bundles.init();

		batch = new SpriteBatch();
		font_green = new BitmapFont(Gdx.files.internal("fonts/font.fnt"));
		font_red = new BitmapFont(Gdx.files.internal("fonts/font.fnt"));
		font_orange = new BitmapFont(Gdx.files.internal("fonts/font.fnt"));
		font_black = new BitmapFont(Gdx.files.internal("fonts/font.fnt"));
		font_white = new BitmapFont(Gdx.files.internal("fonts/font.fnt"));

		font_green.setColor(Color.GREEN);
		font_red.setColor(Color.RED);
		font_orange.setColor(Color.ORANGE);
		font_black.setColor(Color.BLACK);
		font_white.setColor(Color.WHITE);

		this.setScreen(new MainMenu(this));
	}

	@Override
	public void render () {
		super.render();
	}

	@Override
	public void dispose () {
		batch.dispose();
		font_green.dispose();
	}
}
