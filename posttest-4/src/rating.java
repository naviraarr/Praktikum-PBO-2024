import java.util.ArrayList;

class rating extends dvd_film{
    private double rating;

    public rating(String dvdName, String genre, int releaseYear, String director, int price, double rating){
        super(dvdName, genre, releaseYear, director, price);
        if (rating < 0 || rating > 5) {
            System.out.println("Invalid Rating");
        } else {
            this.rating = rating;
        }
    }

    public double getRating(){
        return rating;
    }

    public void setRating(double rating) {
        if (rating <0 || rating >5 ){
            System.out.println("Invalid Rating");
        }
        else{
            this.rating = rating;
        }
    }
    public void tampil(ArrayList<rating> rtg){
        tampil();
        System.out.println("  Rating : " + getRating());
    }

}