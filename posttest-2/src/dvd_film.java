public class dvd_film {
    private String dvdName;
    protected String genre;
    int releaseYear;
    public String director;
    private int price;

    public String getNewName(){
        return dvdName;
    }

    public void setNewName(String dvdName){
        this.dvdName = dvdName;
    }

    protected String getNewGenre() {
        return genre;
    }

    protected void setNewGenre(String genre){
        this.genre = genre;
    }

    int getNewYear(){
        return releaseYear;
    }

    void setNewYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getNewPrice(){
        return price;
    }

    public void setNewPrice(int price){
        this.price = price;
    }

    public dvd_film(String dvdName, String genre, int releaseYear, String director, int price){
        this.dvdName = dvdName;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.director = director;
        this.price = price;
    }
}