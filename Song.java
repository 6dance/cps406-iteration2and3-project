import java.util.Date;

//Class outline for songs
public class Song {
	private String name;
	private String artist;
	private String genre;
	private int length;
	
	//Constructor with parameters of name and length
	public Song(String name, int length) {
		this.name = name;
		this.length = length;
		this.artist = "No Artist Set";
		this.genre = "No Genre Set";
	}
	
	//Returns name of Song
	public String getName() {
		return this.name;
	}
	
	//Returns Artist of Song
	public String getArtist() {
		return this.artist;
	}
	
	//Sets Artist of Song
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	//Returns Genre of song
	public String getGenre() {
		return this.genre;
	}
	
	//Sets Genre of Song
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	//Returns length of song
	public int getLength() {
		return this.length;
	}
	
	//toString Method of Song
	public String toString() {
		return this.name;
	}
}
