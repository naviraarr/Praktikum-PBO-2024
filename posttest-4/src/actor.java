import java.util.ArrayList;

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

    //overloading
    public void tampil(ArrayList<actor> act){
        tampil();
        System.out.println("  Starring : " + getActor());
    }
}