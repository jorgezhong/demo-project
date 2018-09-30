package com.example.command.demo2;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/27 10:50.
 */
public class StereoOnWithCDComand implements Command {

    private Stereo stereo;

    public StereoOnWithCDComand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
