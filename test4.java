/*
Create a music player application that allows users to listen to songs, create playlists, and manage favorites.
Users can browse songs by categories such as albums, artists, genres, and playlists.
The library will include basic song information (title, artist, album art) and allow users to play songs.
The player interface will include standard controls for play, pause, skip, repeat, and shuffle.
It will display song information prominently, including title, artist, and album art.
Users can adjust volume and seek within a song using the player interface.
Users can create, edit, and delete playlists.
Playlists will be synced across devices for registered users.
Users can mark songs as favorites and view/manage their favorite songs list.
The favorites list will be synced across devices for registered users.
Add feature: 1.search songs by singers
             2.add new singers
             
sample input output:
 ========== Music Player ==========
1. Play a song
2. Pause
3. Resume
4. Skip
5. Shuffle
6. Repeat
7. Adjust Volume
8. Seek
9. Create Playlist
10. View Playlists
11. View Favorites
12. Search songs by singer
13. Add new singer
14. Exit
12
Enter singer name to search:
nithin
Songs by nithin:
Title: Rang De, Artist: Nithin, Album: Rang De, Singer: Nithin

========== Music Player ==========
1. Play a song
2. Pause
3. Resume
4. Skip
5. Shuffle
6. Repeat
7. Adjust Volume
8. Seek
9. Create Playlist
10. View Playlists
11. View Favorites
12. Search songs by singer
13. Add new singer
14. Exit
 ========== Music Player ==========
1. Play a song
2. Pause
3. Resume
4. Skip
5. Shuffle
6. Repeat
7. Adjust Volume
8. Seek
9. Create Playlist
10. View Playlists
11. View Favorites
12. Search songs by singer
13. Add new singer
14. Exit
12
Enter singer name to search:
dsp
No songs found for this singer.

========== Music Player ==========
1. Play a song
2. Pause
3. Resume
4. Skip
5. Shuffle
6. Repeat
7. Adjust Volume
8. Seek
9. Create Playlist
10. View Playlists
11. View Favorites
12. Search songs by singer
13. Add new singer
14. Exit

13
Enter new singer name:
mani

========== Music Player ==========
1. Play a song
2. Pause
3. Resume
4. Skip
5. Shuffle
6. Repeat
7. Adjust Volume
8. Seek
9. Create Playlist
10. View Playlists
11. View Favorites
12. Search songs by singer
13. Add new singer
14. Exit
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Song class
class Song {
    private String title;
    private String artist;
    private String album;
    private String albumArt;

    public Song(String title, String artist, String album, String albumArt) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.albumArt = albumArt;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public String getAlbumArt() {
        return albumArt;
    }
    public String allDetails(){
        return "Title: " + title + ", Artist: " + artist + ", Album: " + album+", Singer: "+artist;
    }
    @Override
    public String toString() {
        return "Title: " + title + ", Artist: " + artist + ", Album: " + album;
    }
}

// Playlist class
class Playlist {
    private String name;
    private List<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    public List<Song> getSongs() {
        return songs;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Playlist: " + name + ", Songs: " + songs.size();
    }
}

// MusicPlayer class
class MusicPlayer {
    private Song currentSong;
    private boolean isPlaying;
    private boolean isShuffle;
    private boolean isRepeat;

    public void playSong(Song song) {
        currentSong = song;
        isPlaying = true;
        System.out.println("Playing: " + song);
    }

    public void pause() {
        if (isPlaying) {
            isPlaying = false;
            System.out.println("Paused: " + currentSong);
        }
    }

    public void resume() {
        if (!isPlaying && currentSong != null) {
            isPlaying = true;
            System.out.println("Resumed: " + currentSong);
        }
    }

    public void skip() {
        // Implementation for skipping to the next song
    }

    public void repeat() {
        isRepeat = !isRepeat;
        System.out.println("Repeat is now " + (isRepeat ? "ON" : "OFF"));
    }

    public void shuffle() {
        isShuffle = !isShuffle;
        System.out.println("Shuffle is now " + (isShuffle ? "ON" : "OFF"));
    }

    public void adjustVolume(int level) {
        // Implementation for adjusting volume
    }

    public void seek(int position) {
        // Implementation for seeking within a song
    }
}

// User class
class User {
    private String username;
    private List<Playlist> playlists;
    private List<Song> favorites;

    public User(String username) {
        this.username = username;
        this.playlists = new ArrayList<>();
        this.favorites = new ArrayList<>();
    }

    public void createPlaylist(String name) {
        playlists.add(new Playlist(name));
    }

    public void deletePlaylist(Playlist playlist) {
        playlists.remove(playlist);
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public void addFavorite(Song song) {
        favorites.add(song);
    }

    public void removeFavorite(Song song) {
        favorites.remove(song);
    }

    public List<Song> getFavorites() {
        return favorites;
    }

    @Override
    public String toString() {
        return "User: " + username;
    }
}

// MusicLibrary class
class MusicLibrary {
    private List<Song> songs;

    public MusicLibrary() {
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public List<Song> getSongsByCategory(String category, String value) {
        List<Song> result = new ArrayList<>();
        for (Song song : songs) {
            switch (category.toLowerCase()) {
                case "album":
                    if (song.getAlbum().equalsIgnoreCase(value)) {
                      
                        result.add(song);
                    }
                    break;
                case "artist":
                    if (song.getArtist().equalsIgnoreCase(value)) {
                        result.add(song);
                    }
                    break;
                case "title":
                    if (song.getTitle().equalsIgnoreCase(value)) {
                        result.add(song);
                    }
                    break;
            }
        }
        return result;
    }

    public List<Song> getSongs() {
        return songs;
    }
}

// Main class
public class test4 {
    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();
        MusicPlayer player = new MusicPlayer();
        User user = new User("John Doe");
        ArrayList<Song> mylib=new ArrayList<>();
        // Sample songs
        Song song1 = new Song("Rang De", "Nithin", "Rang De", "AlbumArt1");
        Song song2 = new Song("Ala Vaikunthapurramuloo", "Allu Arjun", "Ala Vaikunthapurramuloo", "AlbumArt2");
        Song song3 = new Song("Bharat Ane Nenu", "Mahesh Babu", "Bharat Ane Nenu", "AlbumArt3");
        Song song4 = new Song("Sarileru Neekevvaru", "Mahesh Babu", "Sarileru Neekevvaru", "AlbumArt4");

        // Adding songs to library
        library.addSong(song1);
        library.addSong(song2);
        library.addSong(song3);
        library.addSong(song4);
        mylib.add(song1);
        mylib.add(song2);
        mylib.add(song3);
        mylib.add(song4);

        // Adding sample playlist
        user.createPlaylist("My Playlist");
        user.getPlaylists().get(0).addSong(song1);
        user.getPlaylists().get(0).addSong(song2);

        // Adding favorite song
        user.addFavorite(song3);

        Scanner scanner = new Scanner(System.in);
        Scanner in=new Scanner(System.in);
        while (true) {
            System.out.println("========== Music Player ==========");
            System.out.println("1. Play a song");
            System.out.println("2. Pause");
            System.out.println("3. Resume");
            System.out.println("4. Skip");
            System.out.println("5. Shuffle");
            System.out.println("6. Repeat");
            System.out.println("7. Adjust Volume");
            System.out.println("8. Seek");
            System.out.println("9. Create Playlist");
            System.out.println("10. View Playlists");
            System.out.println("11. View Favorites");
            System.out.println("12. Search songs by singer");
            System.out.println("13. Add new singer");
            System.out.println("14. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter song title to play:");
                    String title = scanner.nextLine();
                    List<Song> foundSongs = library.getSongsByCategory("title", title);
                    if (foundSongs.isEmpty()) {
                        System.out.println("Song not found.");
                    } else {
                        player.playSong(foundSongs.get(0));
                    }
                    break;
                case 2:
                    player.pause();
                    break;
                case 3:
                    player.resume();
                    break;
                case 4:
                    player.skip();
                    break;
                case 5:
                    player.shuffle();
                    break;
                case 6:
                    player.repeat();
                    break;
                case 7:
                    System.out.println("Enter volume level (0-100):");
                    int volume = scanner.nextInt();
                    player.adjustVolume(volume);
                    break;
                case 8:
                    System.out.println("Enter seek position (seconds):");
                    int position = scanner.nextInt();
                    player.seek(position);
                    break;
                case 9:
                    System.out.println("Enter new playlist name:");
                    String playlistName = scanner.nextLine();
                    user.createPlaylist(playlistName);
                    break;
                case 10:
                    for (Playlist playlist : user.getPlaylists()) {
                        System.out.println(playlist);
                        for (Song song : playlist.getSongs()) {
                            System.out.println("  " + song);
                        }
                    }
                    break;
                case 11:
                    for (Song song : user.getFavorites()) {
                        System.out.println(song);
                    }
                    break;
                case 12:
                    //to write
                    String singer_name;
                    System.out.println("Enter singer name to search:");
                    singer_name=in.nextLine();
                    int c=0;
                    for(Song t:mylib){
                        String s2=t.getArtist();
                        if(singer_name.equalsIgnoreCase(s2)){
                            System.out.println("Songs by "+singer_name+":");
                            System.out.println(t.allDetails());
                            c++;
                        }
                        // System.out.println(t.allDetails());
                    }
                    if(c==0){
                        System.out.println("No songs found for this singer.\n");
                    }
                    else{
                        System.out.println("\n========== Music Player ==========");
                        System.out.println("1. Play a song");
                        System.out.println("2. Pause");
                        System.out.println("3. Resume");
                        System.out.println("4. Skip");
                        System.out.println("5. Shuffle");
                        System.out.println("6. Repeat");
                        System.out.println("7. Adjust Volume");
                        System.out.println("8. Seek");
                        System.out.println("9. Create Playlist");
                        System.out.println("10. View Playlists");
                        System.out.println("11. View Favorites");
                        System.out.println("12. Search songs by singer");
                        System.out.println("13. Add new singer");
                        System.out.println("14. Exit");
                    }
                    break;
                case 13:
                    String new_singer;
                    System.out.println("Enter new singer name:");
                    new_singer=in.nextLine();
                    Song song_new = new Song("N-A", new_singer, "N-A", "N-A");
                    mylib.add(song_new);
                    library.addSong(song_new);
                    break;
                case 14:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}


