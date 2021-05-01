package uwu.misaka.anonimusesvssanitars.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.ScreenUtils;
import uwu.misaka.anonimusesvssanitars.AnonimusesVsSanitars;

public class GameMenu implements Screen {
    final AnonimusesVsSanitars game;
    OrthographicCamera camera;

    public GameMenu(final AnonimusesVsSanitars game) {
        this.game = game;
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 400);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0, 255, 0, 0);
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
