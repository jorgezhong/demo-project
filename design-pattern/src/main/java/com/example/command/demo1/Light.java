package com.example.command.demo1;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/27 10:44.
 */
public class Light {

    private String description;

    public Light(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }


}
