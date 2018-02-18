
import java.util.ArrayList;

public class PrimeFactors {

    static void primeFactors(long num) {
        ArrayList<Long> list = new ArrayList<Long>();
        for (long i = 2; i <= num; i++) {
            while (num % i == 0) {
                list.add(i);
                num /= i;

            }
        }
        int s = list.size();
        System.out.println(list.get(s - 1));
    }

    public static void main(String[] args) {
        primeFactors(21);
    }
}
