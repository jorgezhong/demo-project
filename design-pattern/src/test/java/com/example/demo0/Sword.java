package com.example.demo0;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/20 18:05.
 */
public class Sword extends Weapon {

    public Sword() {
        discription = "剑";
    }

    @Override
    public int calAttack() {
        return 10;
    }
}
