package org.howard.edu.lsp.midterm.question5;

//Music class implements the Streamable interface and adds behavior specific to music.
public class Music implements Streamable {
    private String title;

    //Constructor to initialise the music title.
    //title - The title of the music.
    public Music(String title) {
        this.title = title;
    }

    @Override
    public void play() {
        System.out.println("Playing music: " + title);
    }

    @Override
    public void pause() {
        System.out.println("Paused music: " + title);
    }

    @Override
    public void stop() {
        System.out.println("Stopped music: " + title);
    }

    //Adds the music to a specific playlist.
    //playlistName - The name of the playlist.
    public void addToPlaylist(String playlistName) {
        System.out.println("Added " + title + " to " + playlistName + " playlist");
    }
}

