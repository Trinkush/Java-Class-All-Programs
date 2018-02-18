// prime factor of 13195 are 5,7,13 and 29
// what is the prime factor of number 600851475143

public class Main {

    public static void main(String[] args) {
        int number = 3;
        int primefactor=0;
        for (int i = 1; i <= number; i++) {
            if(number % i == 0){
                System.out.println(" Hello " + i + " is a factor");
                for (int j = 2; j <=i; j++) {
                    
                    if(i%j == 0){
                        break;
                    }
                    else
                        primefactor = i;
                    System.out.println("primefactor "+primefactor);
                }
            }
        }
        System.out.println("final greatest prime factor: "+ primefactor);
    }
}
