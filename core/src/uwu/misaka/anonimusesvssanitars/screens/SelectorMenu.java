package uwu.misaka.anonimusesvssanitars.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.utils.ScreenUtils;
import uwu.misaka.anonimusesvssanitars.AnonimusesVsSanitars;
import uwu.misaka.anonimusesvssanitars.GameData;
import uwu.misaka.anonimusesvssanitars.service.Bundles;
import uwu.misaka.anonimusesvssanitars.service.DrawableUtils;
import uwu.misaka.anonimusesvssanitars.service.Sprites;
import uwu.misaka.anonimusesvssanitars.service.Vars;

import java.util.Date;

public class SelectorMenu implements Screen {
    final AnonimusesVsSanitars game;
    OrthographicCamera camera;

    Drawable place;

    public SelectorMenu(AnonimusesVsSanitars game) {
        this.game = game;
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 400);
        place = DrawableUtils.getColoredRectangle(150, 25, Color.GRAY);
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
        game.batch.draw(Sprites.selektor_fon, 0, 0);
        game.font_orange.draw(game.batch, Bundles.bundle_default.get("selector_center"), 225, 375);
        place.draw(game.batch, 600, 115, 200, 40);
        place.draw(game.batch, 0, 115, 200, 40);
        game.font_red.draw(game.batch, Bundles.bundle_default.get("selector_sanitars"), 60, 150);
        game.font_green.draw(game.batch, Bundles.bundle_default.get("selector_anonimuses"), 650, 150);
        game.batch.end();
        if (Gdx.input.isTouched()) {
            if (new Date().getTime() - Vars.lastTouchTime > 1000) {
                Vars.lastTouchTime = new Date().getTime();
                Vars.touchPos = new Vector3(Gdx.input.getX(), Gdx.input.getY(), 0);
                if (Vars.touchPos.x < 350) {
                    // TODO: 03.05.2021 sanitars sound
                    GameData.fraction = "sanitar";
                    game.setScreen(new GameMenu(game));
                    dispose();
                } else {
                    // TODO: 03.05.2021 anons sound
                    GameData.fraction = "anonimus";
                    game.setScreen(new GameMenu(game));
                    dispose();
                }
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
