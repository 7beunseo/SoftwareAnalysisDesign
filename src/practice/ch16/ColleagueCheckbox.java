package practice.ch16;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ColleagueCheckbox extends Checkbox implements Colleague, ItemListener {
    private Mediator mediator;
    public ColleagueCheckbox(String string, CheckboxGroup g, boolean checked) {
        super(string, g, checked);
    }
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
