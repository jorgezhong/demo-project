package com.example.command.demo1;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/27 10:44.
 */
public class Stereo {

    private String description;

    public Stereo(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + "Stereo on");
    }

    public void off() {
        System.out.println(description + "Stereo off");
    }

    public void setCD(){
        System.out.println(description + "Stereo set CD");
    }

    public void setVolume(int volume){
        System.out.println(description + "Stereo set volume is " + volume);
    }

}
