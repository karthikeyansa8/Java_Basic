class evenrun implements Runnable{
    public void run(){
        for (int i=2; i<=10; i+=2){
            // try {
            //     Thread.sleep(2000);
            // } catch (Exception e) {
            //     System.out.println(e);
            // }
            System.out.println(i);
        }
    }
}

class oddrun implements Runnable{
    public void run(){
        for (int j=1; j<=10; j+=2){
            // try {
            //     Thread.sleep(1000);  
            // } catch (Exception e) {
            //     System.out.println(e);
            // }
            System.out.println(j);
        }
    }
}

public class runnable{
    public static void main(String[] args) {
        Thread t1 = new Thread(new evenrun());
        Thread t2 = new Thread(new oddrun());

        t1.start();
        t2.start();
    }
}
