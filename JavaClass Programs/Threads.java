
class multi implements Runnable {

    @Override
    public void run() {
        System.out.println("Independent thread is running");
    }
}

public class Threads {

    public static void main(String[] args) {
        multi obj = new multi();
        obj.run();
    }
}
