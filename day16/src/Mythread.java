public class Mythread implements Runnable {
    private ticket ticket;

    public Mythread(ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        while (true){
            synchronized (this){
            if (ticket.getNum()<=0){
                System.out.println("票卖完了哦");
                break;
            }

            System.out.println("窗口"+Thread.currentThread().getName()+": 出售"+" :"+ticket.getName()+" , 目前还剩下"+ticket.getNum()+"张票");
            int m = ticket.getNum();
            m--;
            ticket.setNum(m);
        }
        }
    }
}
