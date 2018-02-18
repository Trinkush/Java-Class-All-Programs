
class AA extends Thread {

    @Override
    public void run() {
        System.out.println("This Belongs to AA");
        try {
            Thread.sleep(5000);
            System.out.println("I'm Back");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class BB extends Thread {

    @Override
    public void run() {
        System.out.println("This Belongs to BB");
    }
}

public class ThreadsSleep {

    public static void main(String[] args) {
        AA obj = new AA();
        obj.run();
        BB obj1 = new BB();
        obj1.run();
    }
}
