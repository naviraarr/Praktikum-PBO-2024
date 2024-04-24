public abstract class dvd_film {
    protected String dvdName;
    protected String genre;
    protected int releaseYear;
    protected String director;
    protected int price;

    public dvd_film(String dvdName, String genre, int releaseYear, String director, int price) {
        this.dvdName = dvdName;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.director = director;
        this.price = price;
    }

    protected String getNewName(){
        return dvdName;
    }

    protected void setNewName(String dvdName){
        this.dvdName = dvdName;
    }

    protected String getNewGenre() {
        return genre;
    }

    protected void setNewGenre(String genre){
        this.genre = genre;
    }

    protected int getNewYear(){
        return releaseYear;
    }

    protected void setNewYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    protected String getDirector(){
        return director;
    }

    protected void setDirector(String director){
        this.director = director;
    }

    protected int getNewPrice(){
        return price;
    }

    protected void setNewPrice(int price){
        this.price = price;
    }

    public abstract void tampil();
}