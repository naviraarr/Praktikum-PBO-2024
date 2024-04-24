public class duration extends dvd_film {
    private int duration;

    public duration(String dvdName, String genre, int releaseYear, String director, int price, int duration) {
        super(dvdName, genre, releaseYear, director, price);
        this.duration = duration;
    }

    @Override
    public void tampil() {
        System.out.println("DVD Name: " + dvdName);
        System.out.println("Genre: " + genre);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Director: " + director);
        System.out.println("Price: " + price);
        System.out.println("Duration: " + duration + " minutes");
    }

    public void setDuration(int newDuration) {
        throw new UnsupportedOperationException("Unimplemented method 'setDuration'");
    }
}