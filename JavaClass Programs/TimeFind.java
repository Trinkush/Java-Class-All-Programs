
public class TimeFind {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int num = 0;
        for (int i = 0; i < 10000000; i++) {
            num += i;

        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

}
