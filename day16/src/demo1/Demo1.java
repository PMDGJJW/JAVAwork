package demo1;

public class Demo1 {

    public static void main(String[] args) {
        Object O = new Object();
        count c = new count(1);
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    synchronized (O){
                        while (c.getNum()!=1){
                            try {
                                O.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.print("犯");
                        System.out.print("我");
                        System.out.print("中");
                        System.out.print("华");
                        System.out.print("者");
                        System.out.println(" ");
                        c.setNum(2);
                        O.notify();
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    synchronized (O){
                        while (c.getNum()!=2){
                            try {
                                O.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.print("虽");
                        System.out.print("远");
                        System.out.print("必");
                        System.out.print("诛");

                        System.out.println(" ");
                        c.setNum(1);
                        O.notify();
                    }
                }
            }
        }.start();
    }

}
