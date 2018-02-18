
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playerMp3;
//import sql.Database;
//import add.Addition;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
//import java.util.Date;
import javazoom.jlme.util.Player;

class Songs{

    public void songplay(String songname) {

        try {
            FileInputStream fs = new FileInputStream(songname);
            BufferedInputStream bs = new BufferedInputStream(fs);
            Player play = new Player(bs);
            play.play();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class PlayerMp3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Songs obj = new Songs();
        obj.songplay("F:/So High.mp3");
           //Sql obj1 = new Sql();
           //sql obj1 = new sql();
           //System.out.println(obj1.login("jdbc:mysql://localhost:3306/bank","root","pb11ay4108"));
            //System.out.println(obj1.add(33 , 33));
            //System.out.println(new Date().getTime());

    }

}