package com.example.command.demo1;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/27 10:43.
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
