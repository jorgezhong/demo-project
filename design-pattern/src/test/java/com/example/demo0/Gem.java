package com.example.demo0;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/20 18:06.
 */
public class Gem extends Decorator {

    public Gem(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public int calAttack() {
        return weapon.calAttack() + 10;
    }
}
