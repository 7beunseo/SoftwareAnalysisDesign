package practice.mediator;

import java.awt.*;

public class ColleagueButton extends Button implements Colleague{
    private Mediator mediator;
    public ColleagueButton(String msg) {
        super(msg);
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
