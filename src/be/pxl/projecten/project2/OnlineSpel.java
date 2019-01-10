package be.pxl.projecten.project2;

public class OnlineSpel extends Spel {
    private String genre;
    private String url;

    public OnlineSpel(String naam, Uitgever uitgever) {
        super(naam, uitgever);
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getGenre() {
        return genre;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("OnlineSpel{").append(super.toString())
                .append(",genre=").append(genre).append(", url=").append(url)
                .append("}").toString();
    }
}
