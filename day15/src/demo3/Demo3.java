package demo3;

public class Demo3 {

    public static void main(String[] args) throws Exception {
        Mythread M1 = new Mythread(){
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    System.out.println("Boeing 737 "+i);
                }
            }
        };
        Mythread M2 = new Mythread() {
            @Override
            public void run() {

                for (int i = 0; i <100 ; i++) {
                    System.out.println("AS 320 "+i);
                    if (i==50){
                        try {
                            M1.join(1);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                }
            }
        };

    M1.start();
    M2.start();
    }
}
