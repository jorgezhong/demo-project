package com.example.command.demo0;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/26 10:24.
 *
 * 命令模式的Command：具体命令对象
 */
public class ConcreteCommand implements Command{

    //接收命令对象
    Receiver receiver;

    public ConcreteCommand(Receiver light) {
        this.receiver = light;
    }

    @Override
    public void execute() {
        this.receiver.action();
    }
}
