public class thread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            // try {
            //     Thread.sleep(1000);
            // } catch (Exception e) {
            //     System.out.println(e);
            // }
        }
    }

        public static void main(String[] args) {
            thread t = new thread();
            t.start();
        }
    }