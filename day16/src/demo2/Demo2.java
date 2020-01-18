package demo2;

public class Demo2 {

    public static void main(String[] args) {
        count c2 = new count(1);
        Object O = new Object();

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    synchronized (O){
                        while (c2.getNum()!=1){
                            try {
                                O.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        try {
                            Thread.sleep(200);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.print("我");
                        System.out.print("是");
                        System.out.print("中");
                        System.out.print("国");
                        System.out.print("人");
                        System.out.println(" ");
                        c2.setNum(2);
                        O.notifyAll();
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    synchronized (O){
                        while (c2.getNum()!=2){
                            try {
                                O.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        try {
                            Thread.sleep(400);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.print("犯");
                        System.out.print("我");
                        System.out.print("中");
                        System.out.print("华");
                        System.out.print("者");
                        System.out.println(" ");
                        c2.setNum(3);
                        O.notifyAll();
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    synchronized (O){
                        while (c2.getNum()!=3){
                            try {
                                O.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.print("虽");
                        System.out.print("远");
                        System.out.print("必");
                        System.out.print("诛");

                        System.out.println(" ");
                        c2.setNum(1);
                        O.notifyAll();
                    }
                }
            }
        }.start();
    }

    }

