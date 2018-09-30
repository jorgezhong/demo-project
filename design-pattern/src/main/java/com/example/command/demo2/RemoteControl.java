package com.example.command.demo2;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/27 10:17.
 */
public class RemoteControl {

    /**
     * 记录命令
     */
    private Command[] onCommands;
    private Command[] offCommands;


    public RemoteControl() {

        //设置7个命令插槽
        onCommands = new Command[7];
        offCommands = new Command[7];

        NoCommand noCommand = new NoCommand();

        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

    }

    /**
     * 提供设置插槽命令的方法
     * @param slot
     * @param onCommand
     * @param offCommand
     */
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    /**
     * 封装出来的具体命令动作
     * @param slot
     */
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    /**
     * 封装出来的具体命令动作
     * @param slot
     */
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
