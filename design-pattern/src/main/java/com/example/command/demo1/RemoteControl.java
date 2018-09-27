package com.example.command.demo1;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/27 10:17.
 */
public class RemoteControl {


    private Command[] onCommands;
    private Command[] offCommands;


    public RemoteControl() {

        onCommands = new Command[7];
        offCommands = new Command[7];

        //空对象。什么都不干
        NoCommand noCommand = new NoCommand();

        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

    }


    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[")
                    .append("slot ")
                    .append(i)
                    .append("]")
                    .append(onCommands[i].getClass().getName())
                    .append("   ")
                    .append(offCommands[i].getClass().getName())
                    .append("\n");
        }

        return stringBuffer.toString();


    }
}
