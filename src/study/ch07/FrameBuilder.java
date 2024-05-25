package study.ch07;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FrameBuilder extends Builder{
    private JFrame frame = new JFrame();
    private Box box = new Box(BoxLayout.Y_AXIS);

    @Override
    public void makeTitle(String title) {
        frame.setTitle(title);
    }

    @Override
    public void makeString(String str) {
        JLabel label = new JLabel(str);
        label.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        box.add(label);
    }

    @Override
    public void makeItems(String[] items) {
        Box innerBox = new Box(BoxLayout.Y_AXIS);
        for(String s : items) {
            JButton button = new JButton(s);
            button.addActionListener(e -> {
                System.out.println(e.getActionCommand());
            });
            innerBox.add(button);
        }
        innerBox.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10 ));
        box.add(innerBox);
    }

    @Override
    public void close() {
        frame.getContentPane().add(box);
        frame.pack();
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public JFrame getFrameResult() {
        return frame;
    }
}
