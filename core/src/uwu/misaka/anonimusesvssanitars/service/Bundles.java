package uwu.misaka.anonimusesvssanitars.service;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.I18NBundle;

import java.util.Locale;

public class Bundles {
    public static I18NBundle bundle_default;

    public static void init() {
        FileHandle hf = Gdx.files.internal("bundles/bundle");
        bundle_default = I18NBundle.createBundle(hf, new Locale("ru", "RU"), "utf-8");
    }
}
