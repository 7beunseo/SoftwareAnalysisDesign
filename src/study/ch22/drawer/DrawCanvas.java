package study.ch22.drawer;

import study.ch22.command.MacroCommand;

import java.awt.*;

public class DrawCanvas extends Canvas implements Drawable{
    private Color color; // 그리는 색
    private int radius = 6; // 그리는 점의 반지름
    private MacroCommand history; // 이력

    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
    }

    // 이력 전체 다시 그리기
    @Override
    public void paint(Graphics g) {
        history.execute();
    }

    // 그리기
    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
