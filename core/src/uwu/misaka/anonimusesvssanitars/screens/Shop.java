package uwu.misaka.anonimusesvssanitars.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.ScreenUtils;
import uwu.misaka.anonimusesvssanitars.AnonimusesVsSanitars;
import uwu.misaka.anonimusesvssanitars.service.Sprites;
import uwu.misaka.anonimusesvssanitars.service.Unit;

import java.util.ArrayList;

public class Shop implements Screen {
    final AnonimusesVsSanitars game;
    OrthographicCamera camera;

    public Shop(AnonimusesVsSanitars game) {
        this.game = game;
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 400);
    }

    @Override
    public void show() {
        ShopCell.present.add(new ShopCell(0, 0, Unit.base_sanitar));
        ShopCell.present.add(new ShopCell(0, 1, Unit.base_sanitar));
        ShopCell.present.add(new ShopCell(0, 2, Unit.base_sanitar));
        ShopCell.present.add(new ShopCell(1, 0, Unit.base_sanitar));
        ShopCell.present.add(new ShopCell(1, 1, Unit.base_sanitar));
        ShopCell.present.add(new ShopCell(1, 2, Unit.base_sanitar));
        ShopCell.present.add(new ShopCell(2, 0, Unit.base_sanitar));
        ShopCell.present.add(new ShopCell(2, 1, Unit.base_sanitar));
        ShopCell.present.add(new ShopCell(2, 2, Unit.base_sanitar));
    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0, 0, 0, 0);
        camera.update();
        game.batch.setProjectionMatrix(camera.combined);
        game.batch.begin();
        game.batch.draw(Sprites.shopping_neko, 400, 5, 400, 200);
        for (ShopCell c : ShopCell.present) {
            game.batch.draw(Sprites.shop_base, 25 + c.x * 110, 25 + c.y * 110);
            if (c.sell != null) {
                game.batch.draw(c.sell.texture, 25 + c.x * 110 + 25, 25 + c.y * 110 + 10);
            }
        }
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

    public static class ShopCell {
        public static ArrayList<ShopCell> present = new ArrayList<>();
        public int x;
        public int y;
        public Unit sell;

        public ShopCell(int x, int y, Unit u) {
            this.x = x;
            this.y = y;
            this.sell = u;
        }
    }
}
