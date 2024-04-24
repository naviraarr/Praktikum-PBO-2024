public class rating extends dvd_film {
    private double rating;

    public rating(String dvdName, String genre, int releaseYear, String director, int price, double rating) {
        super(dvdName, genre, releaseYear, director, price);
        this.rating = rating;
    }

    @Override
    public void tampil() {
        System.out.println("DVD Name: " + dvdName);
        System.out.println("Genre: " + genre);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Director: " + director);
        System.out.println("Price: " + price);
        System.out.println("Rating: " + rating);
    }

    public void setRating(double newRating) {
        throw new UnsupportedOperationException("Unimplemented method 'setRating'");
    }
}