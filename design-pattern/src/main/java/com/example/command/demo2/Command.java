package com.example.command.demo2;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/9/26 10:22.
 * <p>
 * 命令模式的Command：抽象命令对象
 */
public interface Command {

    void execute();

    void undo();
}
