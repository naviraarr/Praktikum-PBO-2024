class actor extends dvd_film{
    private String actor;

    public actor(String dvdName, String genre, int releaseYear, String director, int price, String actor){
        super(dvdName, genre, releaseYear, director, price);
        this.actor = actor;
    }

    public String getActor(){
        return actor;
    }

    public  void setActor(String actor) {
        this.actor = actor;
    }

    @Override
    public void addDVD(){
        System.out.println("DVD Name: " + dvdName);
        System.out.println("Genre: " + genre);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Director: " + director);
        System.out.println("Actor: " + actor);
        System.out.println("Price: " + price);
    }

    public void updateDVD(){
        System.out.println("DVD Name: " + dvdName);
        System.out.println("Genre: " + genre);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Director: " + director);
        System.out.println("Actor: " + actor);
        System.out.println("Price: " + price);
    }
}