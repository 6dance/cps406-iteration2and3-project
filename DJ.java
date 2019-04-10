import java.util.Hashtable;

public class DJ extends User { 
        
        //Hashtable that contains all user playlists
	Hashtable<String, Playlist> userPlaylists = new Hashtable<String, Playlist>();
        
        public DJ () {
           
	}
        
        //Adds new playlist to user playlists table, playlist must have unique name
        public void addPlaylist(Playlist playlist) {
            //if playlist name already taken, return error
            if(userPlaylists.containsKey(playlist.getUsername()+playlist.getName())){
                //return error
            }
            else
                userPlaylists.put(playlist.getUsername()+playlist.getName(), playlist);
        
        }
}
