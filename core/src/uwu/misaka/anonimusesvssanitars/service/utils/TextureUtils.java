package uwu.misaka.anonimusesvssanitars.service.utils;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;

public class TextureUtils {
    public static Texture noTexture() {
        Pixmap pixmap = new Pixmap(50, 75, Pixmap.Format.RGBA8888);
        pixmap.setColor(Color.PURPLE);
        pixmap.fill();
        return new Texture(pixmap);
    }
}
