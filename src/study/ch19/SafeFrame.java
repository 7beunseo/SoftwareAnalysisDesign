package study.ch19;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements Context {
    private State state = DayFrame.getInstance();
    private TextField textField = new TextField(60);
    private TextArea textArea = new TextArea(10, 60);
    private Button buttonUse = new Button("금고 사용");	// 금고 사용 버튼
    private Button buttonAlarm = new Button("비상벨");	// 비상벨 버튼
    private Button buttonPhone = new Button("일반 통화");	// 일반 통화 버튼
    private Button buttonExit = new Button("종료");   // 종료 버튼

    public SafeFrame(String string) {
        super(string);

        setBackground(Color.LIGHT_GRAY);
        setLayout(new BorderLayout());

        add(textField, BorderLayout.NORTH);
        textField.setEditable(false);

        add(textArea, BorderLayout.CENTER);
        textArea.setEnabled(false);

        Panel f = new Panel();
        f.add(buttonUse);
        f.add(buttonAlarm);
        f.add(buttonPhone);
        f.add(buttonExit);

        add(f, BorderLayout.SOUTH);

        pack();
        setVisible(true);

        buttonUse.addActionListener(e -> state.doUse(this));
        buttonAlarm.addActionListener(e -> state.doAlarm(this));
        buttonPhone.addActionListener(e -> state.doPhone(this));
        buttonExit.addActionListener(e -> System.exit(0));
    }

    /*
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buttonUse) {
            state.doUse(this);
        } else if(e.getSource() == buttonAlarm) {
            state.doAlarm(this);
        } else if (e.getSource() == buttonPhone) {
            state.doPhone(this);
        } else if (e.getSource() == buttonExit) {
            System.exit(0);
        } else {
            System.out.println("?");
        }
    }

     */

    @Override
    public void setClock(int hour) {
        String formatString = String.format("현재 시각 %02d:00", hour);
        System.out.println(formatString);
        textField.setText(formatString);
        state.doClock(this, hour);
    }

    @Override
    public void changeState(State state) {
        System.out.println(this.state + "에서 " + state + "으로 상태가 변화했습니다.");
        this.state = state;
    }

    @Override
    public void callSecurityCenter(String msg) {
        textArea.append("call! " + msg + "\n");
    }

    @Override
    public void recordLog(String msg) {
        textArea.append("record.. " + msg + "\n");
    }
}
