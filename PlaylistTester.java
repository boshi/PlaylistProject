/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author
 * @version
 */
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        //Make your playlist here
        Playlist myPlaylist = new Playlist();


        System.out.println("Adding songs to the Playlist...\n");
        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */

        myPlaylist.add(new Song("Yellow", "Coldplay", "4:26"));
        myPlaylist.add(new Song("Boba", "Boshi", "3:12"));
        myPlaylist.add(new Song("Rock With You", "Michael Jackson", "3:41"));
        myPlaylist.add(new Song("Tiny Dancer", "Elton John", "6:47"));
        myPlaylist.add(new Song("Ho Hey", "The Lumineers", "2:42"));
        



        System.out.println("Printing the songs...\n");
        
        //Print out all the songs in the playlist to verify it's working correctly
        myPlaylist.dispAll();
        System.out.println(myPlaylist.dispAll());

        System.out.println("\nLiking the songs in position X, Y, Z, etc....\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        myPlaylist.like("Yellow");
        myPlaylist.like("Rock With You");
        myPlaylist.like("Ho Hey");

        System.out.println("Printing the songs...\n");
        myPlaylist.dispAll();
        System.out.println(myPlaylist.dispAll());

        System.out.println("\nRemoving the song in position A, B, C, etc...\n");

        myPlaylist.remove("Boba");
        myPlaylist.remove("Tiny Dancer");


        System.out.println("Printing the songs...\n");
        myPlaylist.dispAll();
        System.out.println(myPlaylist.dispAll());


        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!
        myPlaylist.dispLiked();
        System.out.println(myPlaylist.dispLiked());

        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds
        myPlaylist.getDur();
        System.out.println(myPlaylist.getDur());

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call
        myPlaylist.remUnliked();
        

        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
        myPlaylist.dispAll();
        System.out.println(myPlaylist.dispAll());
    }
}
