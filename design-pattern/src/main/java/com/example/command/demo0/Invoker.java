package com.example.command.demo0;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/26 10:26.
 *
 * 命令模式的Invoker:调用者对象，调用者传递命令
 */
public class Invoker {

    //插槽持有命令
    Command command;

    /**
     * 设置命令
     * @param command
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 将命令封装进按下按钮动作中
     */
    public void buttonWasPressed() {
        command.execute();
    }

}
