
public class Playlist {
    private String song1;
    private String song2;
    private String song3;

    Playlist(String song1, String song2, String song3) {
        this.song1 = song1;
        this.song2 = song2;
        this.song3 = song3;
    }

    void showPlaylist() {
        System.out.println("My Playlist:");
        System.out.println("1. " + song1);
        System.out.println("2. " + song2);
        System.out.println("3. " + song3);
    }

    public static void main(String[] args) {
        Playlist music = new Playlist("Perfect", "Shape of You", "Believer");
        music.showPlaylist();
    }
}