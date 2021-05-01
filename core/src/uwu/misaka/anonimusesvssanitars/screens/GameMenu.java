package uwu.misaka.anonimusesvssanitars.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.ScreenUtils;
import uwu.misaka.anonimusesvssanitars.AnonimusesVsSanitars;
import uwu.misaka.anonimusesvssanitars.Vars;
import uwu.misaka.anonimusesvssanitars.ui.StaminaBar;

public class GameMenu implements Screen {
    final AnonimusesVsSanitars game;
    OrthographicCamera camera;

    StaminaBar staminaBar;

    public GameMenu(final AnonimusesVsSanitars game) {
        this.game = game;
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 400);

        staminaBar = new StaminaBar(25, Vars.staminaMax * 25);
        staminaBar.setPosition(10, 750);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0, 0, 0, 0);
        camera.update();
        game.batch.setProjectionMatrix(camera.combined);
        game.batch.begin();
        staminaBar.draw(game.batch, 75f);
        game.batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
