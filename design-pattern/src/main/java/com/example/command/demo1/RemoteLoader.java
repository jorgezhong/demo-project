package com.example.command.demo1;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/27 11:22.
 */
public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");


        LightOffCommand livingRoomLightOff= new LightOffCommand(livingRoomLight);
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);

        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);


        remoteControl.setCommand(0,livingRoomLightOn,livingRoomLightOff);
        remoteControl.setCommand(1,kitchenLightOn,kitchenLightOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);


    }

}
