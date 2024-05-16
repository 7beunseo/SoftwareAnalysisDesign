package study.ch22.drawer;

import study.ch22.command.Command;

import java.awt.*;

public class DrawCommand implements Command {
    protected Drawable drawable; // 그리는 대상
    private Point position; /// 그리는 위치

    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }
    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
