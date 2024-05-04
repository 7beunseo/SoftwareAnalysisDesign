package practice.ch16;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements Mediator, ActionListener {
    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancel;

    public LoginFrame(String string) {
        super(string);

        // 배경색 설정
        setBackground(Color.LIGHT_GRAY);

        // 레이아웃 설정
        setLayout(new GridLayout(4,2));

        // colleague 생성
        createColleagues();

        // 배치
        add(checkGuest);
        add(checkLogin);
        add(new Label("Username:"));
        add(textUser);
        add(new Label("Password:"));
        add(textPass);
        add(buttonOk);
        add(buttonCancel);

        // 활성 비활성 설정
        colleagueChanged();

        // 화면에 보임
        pack();
        setVisible(true);
    }

    @Override
    public void createColleagues() {
        CheckboxGroup g = new CheckboxGroup();
        checkGuest = new ColleagueCheckbox("Guest", g, true);
        checkLogin = new ColleagueCheckbox("Login", g, false);

        textUser = new ColleagueTextField("", 10);
        textPass = new ColleagueTextField("", 10);

        buttonOk = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("Cancel");

        // mediator 설정
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);

        // listener 설정
        checkGuest.addItemListener(checkGuest); // checkBox는 addItemListener
        checkLogin.addItemListener(checkLogin);
        textUser.addTextListener(textUser); // textField는 addTextListener
        textPass.addTextListener(textPass);
        buttonOk.addActionListener(this); // button은 addActionListener
        buttonCancel.addActionListener(this);
    }

    @Override
    public void colleagueChanged() {
        if(checkGuest.getState()) { // getState로 체크되었는지 확인
            textUser.setColleagueEnabled(false);
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(true); // ok 버튼만 활성화

        }
        else {
            textUser.setColleagueEnabled(true);
            userPassChanged();
        }
    }

    private void userPassChanged() {
        if(textUser.getText().length() > 0) {
            textPass.setColleagueEnabled(true);
            if(textPass.getText().length() > 0) {
                buttonOk.setColleagueEnabled(true);
            } else {
                buttonOk.setColleagueEnabled(false);
            }
        } else {
            textPass.setColleagueEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString()); // 메세지를 출력하고 종료
        System.exit(0);
    }
}
