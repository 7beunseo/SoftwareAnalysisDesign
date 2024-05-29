package practice.mediator;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ColleagueTextField extends TextField implements Colleague, TextListener {
    public ColleagueTextField(String msg, int col) {
        super(msg, col);
    }
    private Mediator mediator;
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean b) {
        setEnabled(b);
        setBackground(b ? Color.WHITE : Color.LIGHT_GRAY);
    }

    @Override
    public void textValueChanged(TextEvent e) {
        mediator.colleagueChanged();
    }
}
