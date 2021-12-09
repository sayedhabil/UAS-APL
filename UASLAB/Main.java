import java.util.Scanner;
import Adapter.*;
import Strategy.*;

public class Main {
   public static void main(String[] args) {
      //interface atau halaman yang akan ditampilkan
      System.out.println("Selamat datang di Edd's Music");
      System.out.println("_______________________");
      System.out.println("Silahkan memilih player");
      System.out.println("- Spotify");
      System.out.println("- Joox");
      Scanner in = new Scanner(System.in);
      System.out.print("Masukkan player : ");
      String media = in.next();
      System.out.println("Player yang digunakan : " + media);

      ChoosePlayer audioPlayer = new ChoosePlayer();
      Player p = null;
      p = new Player();
      //pemilihan spotify
      if( "Spotify".equalsIgnoreCase(media)){
         p.setPlayMethod(new MainkanSpotify());
         p.mainkanMusik();
         audioPlayer.play("spotify", "Sway ");
      //pemilihan joox
      }else if("Joox".equalsIgnoreCase(media)){
         p.setPlayMethod(new MainkanJoox());
         p.mainkanMusik();
         audioPlayer.play("Joox", "Sway ");
      }
   }
}
