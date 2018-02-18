
//Getters And Setters
class poo {

    private int balance = 10000;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if(balance>20000){
            
        }else{
            this.balance = balance;
        }
        //this.balance = balance;
    }

}

public class GettersandSetters {

    public static void main(String[] args) {
        poo obj = new poo();
        obj.setBalance(200000);
        System.out.println(obj.getBalance());
    }
}
