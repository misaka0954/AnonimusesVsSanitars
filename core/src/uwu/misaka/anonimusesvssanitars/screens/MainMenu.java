package uwu.misaka.anonimusesvssanitars.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.ScreenUtils;
import uwu.misaka.anonimusesvssanitars.AnonimusesVsSanitars;
import uwu.misaka.anonimusesvssanitars.Vars;

import java.util.Date;

public class MainMenu implements Screen {

    final AnonimusesVsSanitars game;
    OrthographicCamera camera;

    public MainMenu(final AnonimusesVsSanitars game){
        this.game = game;
        camera=new OrthographicCamera();
        camera.setToOrtho(false,800,400);
    }

    @Override
    public void show() {
        System.out.println("MainMenu Loaded");
    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0,0,0,0);
        camera.update();
        game.batch.setProjectionMatrix(camera.combined);
        game.batch.begin();
        game.font.draw(game.batch,"Ohayo onee-chan",100,200);
        game.font.draw(game.batch,"Tap in durka to start",100,100);
        game.batch.end();
        if(Gdx.input.isTouched()) {
            if (new Date().getTime() - Vars.lastTouchTime > 1000) {
                Vars.lastTouchTime = new Date().getTime();
                // TODO: 30.04.2021 check config
                game.setScreen(new SelectorMenu(game));
                dispose();
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
