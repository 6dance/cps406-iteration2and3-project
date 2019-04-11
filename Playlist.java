import java.util.LinkedList;

public class Playlist{
    LinkedList<Song> playlist = new LinkedList<Song>();
    String playlistName;
    int playlistTime;
    
    Playlist(String name)
    {
        setName( name );
        playlistTime = 0;
        playlist.add(new Song("beepis", 69));
    }
    
    //Returns playlist
    public LinkedList<Song> getPlaylist() {
        return this.playlist;
    }
        
    //Returns playlist name
	public String getName() {
		return this.playlistName;
	}
	
	//Sets Username of user
	public void setName(String username) {
		this.playlistName = username;
	}
        
    //Adds new song to playlist
    public void addToPlaylist(Song song){
        playlist.add(song);
        playlistTime = playlistTime + song.getLength();
    }
        
    public void removeFromPlaylist (Song song){
        playlist.remove(song);
        playlistTime = playlistTime - song.getLength();
    }
}
