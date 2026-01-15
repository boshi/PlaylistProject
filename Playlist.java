import java.util.*;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    private ArrayList<Song> songs;

     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
    public Playlist() {
        songs = new ArrayList<Song>();
    }

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */
    public void add(Song song) {
        songs.add(song);
    }
    public void like(String title) {
        for (Song song : songs) {
            if (song.getName().equals(title)) {
                song.like();
                return;
            }
        }
    }
    public void remove(String name) {
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getName().equals(name)) {
                songs.remove(i);
                break;
            }
        }
    }

    public String dispAll() {
        StringBuilder result = new StringBuilder();
        for (Song song : songs) {
            result.append(song.toString()).append("\n");
        }
        return result.toString();
    }

    public String dispLiked() {
        StringBuilder result = new StringBuilder();
        for (Song song : songs) {
            if (song.isLiked()) {
                result.append(song.toString()).append("\n");
            }
        }
        return result.toString();
    }

    public String getDur() {
        int min = 0;
        int sec = 0;

        for (Song song : songs) {
            String length = song.getLength();
            String[] minsec = length.split(":");
            min += Integer.parseInt(minsec[0]);
            sec += Integer.parseInt(minsec[1]);
        }

        min += sec / 60;
        sec = sec % 60;

        return min + ":" + String.format("%02d", sec);
    }

    public void remUnliked() {
        for (int i = songs.size() - 1; i >= 0; i--) {
            if (!songs.get(i).isLiked()) {
                songs.remove(i);
            }
        }
    }
}
