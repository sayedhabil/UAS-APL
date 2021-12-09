package Adapter;

public class Adapter implements MediaSound {

   ThePlayer theSound;

   //Method untuk memastikan antara joox dan spotify
   public Adapter(String soundSystem){
   
      if(soundSystem.equalsIgnoreCase("joox") ){
         theSound = new PilihJoox();			
         
      }else if (soundSystem.equalsIgnoreCase("spotify")){
         theSound = new PilihSpotify();
      }	
   }

   @Override
   public void play(String soundSystem, String namaLagu) {
   
      if(soundSystem.equalsIgnoreCase("joox")){
         theSound.mainkanJoox(namaLagu);
      }
      else if(soundSystem.equalsIgnoreCase("spotify")){
         theSound.mainkanSpotify(namaLagu);
      }
   }
}