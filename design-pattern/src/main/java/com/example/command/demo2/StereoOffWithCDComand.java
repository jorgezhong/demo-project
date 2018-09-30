package com.example.command.demo2;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/27 10:50.
 */
public class StereoOffWithCDComand implements Command {

    private Stereo stereo;

    public StereoOffWithCDComand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
