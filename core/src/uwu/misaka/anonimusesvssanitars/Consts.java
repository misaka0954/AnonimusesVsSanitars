package uwu.misaka.anonimusesvssanitars;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.I18NBundle;

public class Consts{

    public static I18NBundle bundle;
    public static I18NBundle bundle_default;
    public static AssetManager assets;

    public static void init() {
        FileHandle hf = Gdx.files.internal("bundles/bundle");
        bundle_default = I18NBundle.createBundle(hf);
    }
}
