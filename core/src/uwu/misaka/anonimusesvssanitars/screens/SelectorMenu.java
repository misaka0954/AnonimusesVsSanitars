package uwu.misaka.anonimusesvssanitars.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.ScreenUtils;
import uwu.misaka.anonimusesvssanitars.AnonimusesVsSanitars;
import uwu.misaka.anonimusesvssanitars.Vars;

import java.util.Date;

public class SelectorMenu implements Screen {
    final AnonimusesVsSanitars game;
    OrthographicCamera camera;

    public SelectorMenu(AnonimusesVsSanitars game) {
        this.game = game;
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 400);
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
        game.font.draw(game.batch, "Choose your side of WAR", 325, 200);
        game.font.draw(game.batch, "Sanitars", 50, 200);
        game.font.draw(game.batch, "Anonimuses", 680, 200);
        game.batch.end();
        if (Gdx.input.isTouched()) {
            if (new Date().getTime() - Vars.lastTouchTime > 1000) {
                Vars.lastTouchTime = new Date().getTime();
                Vars.touchPos = new Vector3(Gdx.input.getX(), Gdx.input.getY(), 0);
                if (Vars.touchPos.x < 350) {
                    // TODO: 30.04.2021 select sanitars
                    System.out.println("Selected sanitars");
                    game.setScreen(new GameMenu(game));
                    dispose();
                } else {
                    // TODO: 30.04.2021 Select anons
                    System.out.println("Selected anonimuses");
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
