package com.example.command.demo0;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/26 10:47.
 * <p>
 * client:命令模式的客户，客户通过Invoker设置命令
 */
public class Client {

    public static void main(String[] args) {

        Invoker invoker = new Invoker();

        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);

        invoker.setCommand(command);
        invoker.buttonWasPressed();

    }

}
