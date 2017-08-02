
public class Musics implements Classification{
	private int musicTime;
	private String musicInstrument;
	
	//to set initial values
	public Musics(){
		musicTime = 0;
		musicInstrument = "Not Defined";
	}
	
	/*
	//overloading example
	public Musics(int time , String instrument){
		setMusicTime(time);
		setMusicInstrument(instrument);
	}
	*/
	
	//setting the music's time
	public void setMusicTime(int time){
		this.musicTime = time;
	}
	
	//getting the music's time
	public int getMusicTime(){
		return this.musicTime;
	}
	
	//setting the music instrument
	public void setMusicInstrument(String instrument){
		this.musicInstrument = instrument;
	}
	
	//getting the music's instrument
	public String getMusicInstrument(){
		return this.musicInstrument;
	}
	
	//overriding methods that came from Classification interface 
	@Override
	public int asConsumming() {
		// TODO Auto-generated method stub
		return this.getMusicTime();
	}
	@Override
	public String asType() {
		// TODO Auto-generated method stub
		String musicType = "";
		if(this.getMusicInstrument() == "Guitar"){
			musicType = "Rock";
		}else if(this.getMusicInstrument() == "Piano"){
			musicType = "Classic";
		}else{
			musicType = "Cannot Defined!";
		}
		return musicType;
	}

}
