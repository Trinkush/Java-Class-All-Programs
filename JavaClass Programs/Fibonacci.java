
public class Fibonacci {

    public static void main(String[] args) {

        int n = 4000000, t1 = 0, t2 = 1, result=0;
      

        for (int i = 1; i <= n; ++i)
        {
            result=result+t1;
           //System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        System.out.println("result: "+ result);
    }
}
