public class TestTV {
	public static void main(String[] args){
		TV tv1 = new TV();
		tv1.turnOn();
		tv1.setChannel(25);
		tv1.setVolume(3); 

		System.out.println("TV1's Channel: " + tv1.channel 
		+ ", volume level: " + tv1.volumeLevel);
	}

}

class TV {
	int channel;
	int volumeLevel;
	boolean on = false;

	public TV(){}
	public void turnOn(){
		on = true;
	}
	public void setChannel(int newChannel){
		channel = newChannel;
	}
	public void setVolume(int newVolumeLevel){
		volumeLevel = newVolumeLevel; 
	}
}