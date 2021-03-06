package com.example.command.demo2;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/27 10:43.
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }

}
