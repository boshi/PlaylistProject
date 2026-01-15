public class Song {
   private String name;
   private String artist;
   private String length;
   private boolean liked;

   public Song(String var1, String var2, String var3) {
      this.name = var1;
      this.artist = var2;
      this.length = var3;
      this.liked = false;
   }

   public String getName() {
      return this.name;
   }

   public String getArtist() {
      return this.artist;
   }

   public String getLength() {
      return this.length;
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
      return this.liked ? "\"" + this.name + "\" by " + this.artist + " (" + this.length + ") -- liked" : "\"" + this.name + "\" by " + this.artist + " (" + this.length + ")";
   }
}
