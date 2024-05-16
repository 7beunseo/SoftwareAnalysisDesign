package study.ch22.command;

import java.util.ArrayDeque;
import java.util.Deque;

public class MacroCommand implements Command{
    // 명령의 배열
    private Deque<Command> commands = new ArrayDeque<>();
    @Override
    public void execute() {
        for(Command cmd : commands) {
            cmd.execute();
        }
    }

    // 추가
    public void append(Command cmd) {
        if(cmd == this) {
            throw new IllegalArgumentException("infinite loop caused by append");
        }
        commands.push(cmd);
    }

    public void undo() {
        if(!commands.isEmpty()) {
            commands.pop();
        }
    }

    public void clear() {
        commands.clear();
    }
}
