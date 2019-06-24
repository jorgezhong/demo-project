package com.example.command.demo1;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/27 11:22.
 */
public class RemoteLoader {

    public static void main(String[] args) {
        //1、获取Invoker，协调者
        //RemoteControl remoteControl = new RemoteControl();
        //使用带撤销命令的协调者
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        //2、设置Reveiver，实际命令执行者
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Stereo livingRoomStereo = new Stereo("Living Room");

        //设置命令，并绑定实际命令执行者
        LightOffCommand livingRoomLightOff= new LightOffCommand(livingRoomLight);
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);

        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);

        StereoOnWithCDComand stereoOnWithCDComand = new StereoOnWithCDComand(livingRoomStereo);
        StereoOffWithCDComand stereoOffWithCDComand = new StereoOffWithCDComand(livingRoomStereo);

        //3、封装命令到Invoker协调者
        remoteControl.setCommand(0,livingRoomLightOn,livingRoomLightOff);
        remoteControl.setCommand(1,kitchenLightOn,kitchenLightOff);
        remoteControl.setCommand(2,stereoOnWithCDComand,stereoOffWithCDComand);

        System.out.println(remoteControl);

        //4、Invoker,协调者发出执行命令的请求
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        //撤销命令
        System.out.println("撤销命令:");
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);

    }

}
