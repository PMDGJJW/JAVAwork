package demo7;

public class Demo7 {

    public static void main(String[] args) {

        Object O = new Object();

        new Thread(){
            @Override
            public void run() {
               synchronized (O){
                   for (int i = 0; i <10 ; i++) {
                       System.out.println(" i : " + i);
                       try {
                           O.wait();
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                   }
               }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {

                    while (true){
                        synchronized (O){
                        O.notify();
                    }
                }
            }
        }.start();
    }

}
