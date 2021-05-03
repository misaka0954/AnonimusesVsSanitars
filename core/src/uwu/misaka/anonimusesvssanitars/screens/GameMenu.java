package uwu.misaka.anonimusesvssanitars.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.ScreenUtils;
import uwu.misaka.anonimusesvssanitars.AnonimusesVsSanitars;
import uwu.misaka.anonimusesvssanitars.service.Bundles;
import uwu.misaka.anonimusesvssanitars.service.Sprites;
import uwu.misaka.anonimusesvssanitars.service.Vars;
import uwu.misaka.anonimusesvssanitars.ui.StaminaBar;

public class GameMenu implements Screen {
    final AnonimusesVsSanitars game;
    OrthographicCamera camera;

    StaminaBar staminaBar;

    public GameMenu(final AnonimusesVsSanitars game) {
        this.game = game;
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 400);

        staminaBar = new StaminaBar(Vars.staminaMax * 25, 25);
        staminaBar.setPosition(10, 380);
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
        game.batch.draw(Sprites.stamina_icon, 200, 340);
        game.font_green.draw(game.batch, Bundles.bundle_default.get("game_menu_stamina") + ": 10/" + Vars.staminaMax, 10, 365);
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
