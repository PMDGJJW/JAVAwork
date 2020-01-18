public class demo8 {

    public static void main(String[] args) {
//        Runnable myrun = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i <50 ; i++) {
//                    System.out.println("i:" + i);
//                }
//            }
//        };
//        Thread n = new Thread(myrun);
//        n.start();

//        Thread n = new Thread(()->{
//            for (int i = 0; i <50 ; i++) {
//                System.out.println(" i "+ i);
//            }
//        });
//        n.start();
//        Thread n1 = new Thread(()->{
//            for (int i = 0; i <80 ; i++) {
//                System.out.println("n "+ i);
//            }
//        });
//        n1.start();
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <51 ; i++) {
                    System.out.println(" i "+ i);
                }
            }
        }.start();
    }

}
