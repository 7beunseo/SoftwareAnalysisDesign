package practice.mediator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements ActionListener, Mediator {
    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancel;

    @Override
    public void createColleagues() {
        CheckboxGroup g = new CheckboxGroup();
        checkGuest = new ColleagueCheckbox("Guest", g, true);
        checkLogin = new ColleagueCheckbox("Login", g, false);

        textUser = new ColleagueTextField("", 10);
        textPass = new ColleagueTextField("", 10);
        textPass.setEchoChar('*');

        buttonOk = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("CANCEL");

        checkGuest.setMediator(this);
        checkGuest.addItemListener(checkGuest);
        checkLogin.setMediator(this);
        checkLogin.addItemListener(checkLogin);
        textUser.setMediator(this);
        textUser.addTextListener(textUser);
        buttonOk.setMediator(this);
        buttonCancel.addActionListener(this);
        buttonCancel.setMediator(this);
        buttonCancel.addActionListener(this);

    }

    public LoginFrame(String msg) {
        super(msg);
        setBackground(Color.lightGray);
        setLayout(new GridLayout(4,2));

        createColleagues();
        add(checkGuest);
        add(checkLogin);
        add(new Label("username"));
        add(textUser);
        add(new Label("password"));
        add(textPass);
        add(buttonOk);
        add(buttonCancel);

        colleagueChanged();

        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }


    @Override
    public void colleagueChanged() {
        if (checkGuest.getState()) {
            // 게스트 로그인
            textUser.setColleagueEnabled(false);
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(true);
        } else {
            // 사용자 로그인
            textUser.setColleagueEnabled(true);
            userpassChanged();
        }
    }
    private void userpassChanged() {
        if (textUser.getText().length() > 0) {
            textPass.setColleagueEnabled(true);
            if (textPass.getText().length() > 0) {
                buttonOk.setColleagueEnabled(true);
            } else {
                buttonOk.setColleagueEnabled(false);
            }
        } else {
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(false);
        }
    }
}
