public class CD implements Packable {
    private String artist;
    private String name;
    private int publication;

    public CD(String artist, String name, int publication) {
        this.artist = artist;
        this.name = name;
        this.publication = publication;
    }

    @Override
    public double weight() {
        return 0.1;
    }

    @Override
    public String toString() {
        return artist + ": " + name + " (" + publication + ")";
    }
}
