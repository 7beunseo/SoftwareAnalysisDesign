package practice.mediator;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ColleagueCheckbox extends Checkbox implements Colleague, ItemListener {

    public ColleagueCheckbox(String msg, CheckboxGroup g, boolean b) {
        super(msg, g, b);
    }
    private Mediator mediator;
    @Override
    public void itemStateChanged(ItemEvent e) {
        mediator.colleagueChanged();
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean b) {
        setEnabled(b);
    }
}
