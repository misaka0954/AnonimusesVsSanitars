package uwu.misaka.anonimusesvssanitars.service;

import com.badlogic.gdx.graphics.Texture;
import uwu.misaka.anonimusesvssanitars.service.utils.TextureUtils;

import java.util.ArrayList;

enum Rare {
    nope,
    rare,
    superRare,
    legendary,
    fractionMaster
}

public class Unit {
    public static ArrayList<Unit> units = new ArrayList<>();
    public static Unit base_anonimus = new Unit("base_anonimus", TextureUtils.noTexture(), 100, 10, 25, 40, Rare.nope, "anonimus");
    public static Unit base_sanitar = new Unit("base_sanitar", TextureUtils.noTexture(), 100, 10, 25, 40, Rare.nope, "sanitar");
    public String name;
    public Texture texture;
    public int maxHp;
    public int hp;
    public int cost;
    public int baseDamage;
    public int ultraDamage;
    public boolean isUnlocked = false;
    public Rare rare;
    public String fraction;

    public Unit(String name, Texture t, int maxHp, int cost, int baseDamage, int ultraDamage, Rare rare, String fraction) {
        this.name = name;
        this.texture = t;
        this.hp = this.maxHp = maxHp;
        this.cost = cost;
        this.baseDamage = baseDamage;
        this.ultraDamage = ultraDamage;
        this.rare = rare;
        this.fraction = fraction;
        units.add(this);
    }

}
