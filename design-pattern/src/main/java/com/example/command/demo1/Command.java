package com.example.command.demo1;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/9/26 10:22.
 * <p>
 * 命令模式的Command：抽象命令对象
 */
public interface Command {

    void execute();

    void undo();
}
