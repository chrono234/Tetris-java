package cr.com.jairo.window;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Music {
	
	public static Clip LoadSound(String direction){
		try{
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Music.class.getResource(direction)));
			return clip;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
}
