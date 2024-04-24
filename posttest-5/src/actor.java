public class actor extends dvd_film {
    private String actorName;

    public actor(String dvdName, String genre, int releaseYear, String director, int price, String actorName) {
        super(dvdName, genre, releaseYear, director, price);
        this.actorName = actorName;
    }

    @Override
    public void tampil() {
        System.out.println("DVD Name: " + dvdName);
        System.out.println("Genre: " + genre);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Director: " + director);
        System.out.println("Price: " + price);
        System.out.println("Actor: " + actorName);
    }

    public void setActor(String newActor) {
        throw new UnsupportedOperationException("Unimplemented method 'setActor'");
    }
}