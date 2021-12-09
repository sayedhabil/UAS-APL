package Adapter;

public class PilihJoox implements ThePlayer{

   //Method yang akan mengoverride method yang ada pada class AdvancedMediaPlayer
   @Override
   public void mainkanJoox(String namaLagu) {
      System.out.println( namaLagu + "diputar dengan Joox");		
   }

   //Method yang akan mengoverride method yang ada pada class AdvancedMediaPlayer
   @Override
   public void mainkanSpotify(String namaLagu) {
   }
}