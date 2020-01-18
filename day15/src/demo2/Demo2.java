package demo2;

public class Demo2 {

    public static void main(String[] args) throws Exception{
//        Myrunable myrunable = new Myrunable();
//        Thread thread = new Thread(myrunable);
//        thread.start();
//        Runnable myrun = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i <50 ; i++) {
//                    System.out.println(i);
//                }
//            }
//        };
     Thread th = new Thread(()->{
         for (int i = 0; i <50 ; i++) {
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             System.out.println(i);
                }
     });
         th.start();
        for (int i = 0; i <100 ; i++) {
            Thread.sleep(500);
            System.out.println("aa");
        }
    }

}
