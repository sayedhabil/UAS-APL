package Adapter;

public class PilihJoox implements ThePlayer{

   //Untuk meng-override method pada ThePlayer
   @Override
   public void mainkanJoox(String namaLagu) {
      System.out.println( namaLagu + "diputar dengan Joox");		
   }

   //Override akan memproses method yang ada pada class ThePlayer
   @Override
   public void mainkanSpotify(String namaLagu) {
   }
}
