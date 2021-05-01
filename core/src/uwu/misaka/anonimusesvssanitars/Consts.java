package uwu.misaka.anonimusesvssanitars;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.utils.I18NBundle;

public class Consts{

    public static I18NBundle bundle;
    public static AssetManager assets;

    public static void init(){

        assets = new AssetManager();

        assets.load("bundles/bundle.properties", I18NBundle.class);

        assets.finishLoading();

        bundle = assets.get("bundles/bundle.properties", I18NBundle.class);

        Gdx.app.getApplicationLogger().log("constns", bundle.get("message"));
    }
}
