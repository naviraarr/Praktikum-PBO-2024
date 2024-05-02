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

    @Override
    public void addDVD(){
        System.out.println("DVD Name: " + dvdName);
        System.out.println("Genre: " + genre);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Director: " + director);
        System.out.println("Rating: " + rating);
        System.out.println("Price: " + price);
    }

    public void updateDVD(){
        System.out.println("DVD Name: " + dvdName);
        System.out.println("Genre: " + genre);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Director: " + director);
        System.out.println("Rating: " + rating);
        System.out.println("Price: " + price);
    }
}