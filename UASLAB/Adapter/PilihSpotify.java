package Adapter;

public class PilihSpotify implements ThePlayer{

   //Method yang akan mengoverride method yang ada pada class AdvancedMediaPlayer
   @Override
   public void mainkanJoox(String namaLagu) {
   }

   //Method yang akan mengoverride method yang ada pada class AdvancedMediaPlayer
   @Override
   public void mainkanSpotify(String namaLagu) {
      System.out.println( namaLagu + "Diputar dengan Spotify");		
   }
}