class duration extends dvd_film {
    private int duration;

    public duration(String dvdName, String genre, int releaseYear, String director, int price, int duration) {
        super(dvdName, genre, releaseYear, director, price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
