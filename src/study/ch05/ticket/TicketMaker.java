package study.ch05.ticket;

import java.util.Map;

public class TicketMaker {
    private static TicketMaker ticketMaker = new TicketMaker();
    private int ticket = 1000;
    private TicketMaker() {}
    public static TicketMaker getInstance() { // getInstance 생성
        return ticketMaker;
    }

    public synchronized int getTicketNum() {
        return ticket++;
    }

}
