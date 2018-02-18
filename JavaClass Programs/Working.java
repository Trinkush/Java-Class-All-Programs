
import javax.swing.JOptionPane;

public class Working {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run(){
                JOptionPane.showMessageDialog(null, "thread one");
            }
        }.start();
        new Thread(){
            @Override
            public void run(){
                JOptionPane.showMessageDialog(null, "thread two");
            }
        }.start();
    }
}
