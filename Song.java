public class Song {
   private String title;
   private String artist;
   private String duration;
   private boolean liked;

   public Song(String var1, String var2, String var3) {
      this.title = var1;
      this.artist = var2;
      this.duration = var3;
      this.liked = false;
   }

   public String getTitle() {
      return this.title;
   }

   public String getArtist() {
      return this.artist;
   }

   public String getDuration() {
      return this.duration;
   }

   public boolean isLiked() {
      return this.liked;
   }

   public void like() {
      this.liked = true;
   }

   public void unlike() {
      this.liked = false;
   }

   public String toString() {
      return this.liked ? "\"" + this.title + "\" by " + this.artist + " (" + this.duration + ") -- liked" : "\"" + this.title + "\" by " + this.artist + " (" + this.duration + ")";
   }
}
