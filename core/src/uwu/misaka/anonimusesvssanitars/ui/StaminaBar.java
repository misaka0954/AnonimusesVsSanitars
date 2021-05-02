package uwu.misaka.anonimusesvssanitars.ui;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.ui.ProgressBar;
import uwu.misaka.anonimusesvssanitars.service.DrawableUtils;
import uwu.misaka.anonimusesvssanitars.service.Vars;

public class StaminaBar extends ProgressBar {
    public StaminaBar(int width, int height) {
        super(0f, Vars.staminaMax * 1f, 1f, false, new ProgressBarStyle());
        getStyle().background = DrawableUtils.getColoredRectangle(width, height, Color.RED);
        getStyle().knob = DrawableUtils.getColoredRectangle(width, height, Color.GREEN);
        getStyle().knobBefore = DrawableUtils.getColoredRectangle(width, height, Color.GREEN);
        setAnimateDuration(0.1F);
        setValue(Vars.staminaMax * 1f - 1);
    }
}
