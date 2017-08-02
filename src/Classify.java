
public class Classify {
	public static void main( String [] args){
		System.out.println("CATEGORIZED BOOKS AND MUSICS\n");
		
		//create a Books object
		Books book = new Books();
		book.setBookSize(150*150);
		book.setBookCategory("Adventure");
		
		//create a Musics object
		Musics music = new Musics();
		music.setMusicTime(8);
		music.setMusicInstrument("Guitar");
		
		System.out.println("The Book:\nConsumming Time: " + book.asConsumming() + " hours\nType: " + book.asType());
		System.out.println("\nThe Music:\nConsumming Time: " + music.asConsumming() + " minutes\nType: " + music.asType() );
	}
}
