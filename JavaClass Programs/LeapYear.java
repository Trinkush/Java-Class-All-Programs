
public class LeapYear {
    public static void main(String[] args) {
        int year=1900,x,y;
        for(int i=1900; i<=2020; i++)
        {
          x=  year%100;
          y=x%4;
          if(y==0 && year%4==0){
              System.out.println("Leap year: " + year);
          }
          else{
              System.out.println("Not a Leap Year: " + year);
          }
          if(year==2016)
          {
              break;
          }
          year++;
        }
    }
}
