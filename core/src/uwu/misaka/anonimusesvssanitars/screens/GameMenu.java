package uwu.misaka.anonimusesvssanitars.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.ScreenUtils;
import uwu.misaka.anonimusesvssanitars.AnonimusesVsSanitars;
import uwu.misaka.anonimusesvssanitars.GameData;
import uwu.misaka.anonimusesvssanitars.service.Bundles;
import uwu.misaka.anonimusesvssanitars.service.Formation;
import uwu.misaka.anonimusesvssanitars.service.Sprites;
import uwu.misaka.anonimusesvssanitars.service.Vars;
import uwu.misaka.anonimusesvssanitars.ui.StaminaBar;

import java.util.Date;

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
        staminaBar.setValue(GameData.stamina * 1f);
        staminaBar.draw(game.batch, 75f);
        game.batch.draw(Sprites.stamina_icon, 200, 340);
        game.font_green.draw(game.batch, Bundles.bundle_default.get("game_menu_stamina") + ": " + GameData.stamina + "/" + Vars.staminaMax, 10, 365);
        drawFormation(GameData.formation, 35, 35, 120, 100);
        game.batch.end();
        if (Gdx.input.isTouched()) {
            if (new Date().getTime() - Vars.lastTouchTime > 1000) {
                // TODO: 05.05.2021 change to another
                game.setScreen(new Shop(game));
                dispose();
            }
        }
    }

    private void drawFormation(Formation f, int start_x, int start_y, int x_offset, int y_offset) {
        for (Formation.Cell c : f.cells) {
            game.batch.draw(Sprites.unit_base, start_x + c.x * x_offset, start_y + c.y * y_offset);
            if (c.isFull()) {
                game.batch.draw(c.unit.texture, start_x + c.x * x_offset + 25, start_y + c.y * y_offset + 24);
            }
        }
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
