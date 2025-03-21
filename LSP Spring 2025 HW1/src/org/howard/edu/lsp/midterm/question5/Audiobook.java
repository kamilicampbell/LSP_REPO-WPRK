package org.howard.edu.lsp.midterm.question5;

//Audiobook class implements the Streamable interface and adds behavior specific to audiobooks.
public class Audiobook implements Streamable {
    private String title;

    //Constructor to initialize the audiobook title.
    //title - The title of the audiobook.
    public Audiobook(String title) {
        this.title = title;
    }

    @Override
    public void play() {
        System.out.println("Playing audiobook: " + title);
    }

    @Override
    public void pause() {
        System.out.println("Paused audiobook: " + title);
    }

    @Override
    public void stop() {
        System.out.println("Stopped audiobook: " + title);
    }

    //Sets the playback speed for the audiobook.
    //speed - The speed to set the playback to (e.g., 1.5 for 1.5x speed).
    public void setPlaybackSpeed(double speed) {
        System.out.println("Setting playback speed of audiobook: " + title + " to " + speed + "x");
    }
}

