import java.util.ArrayList;
import java.util.List;

abstract class MediaAudio {
    private String judul;

    public MediaAudio(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }

    public abstract void putarAudio();
}

class Lagu extends MediaAudio {
    private String penyanyi;

    public Lagu(String judul, String penyanyi) {
        super(judul);
        this.penyanyi = penyanyi;
    }

    @Override
    public void putarAudio() {
        System.out.println("Memutar lagu: " + getJudul() + " oleh " + penyanyi);
    }
}

class Podcast extends MediaAudio {
    private String pemandu;

    public Podcast(String judul, String pemandu) {
        super(judul);
        this.pemandu = pemandu;
    }

    @Override
    public void putarAudio() {
        System.out.println("Memutar podcast: " + getJudul() + " bersama " + pemandu);
    }
}


public class PemutaranMusik {
    public static void main(String[] args) {

        List<MediaAudio> playlist = new ArrayList<>();
        playlist.add(new Lagu("Lathi", "Weird Genius"));
        playlist.add(new Podcast("Sudut Pandang", "Rizky"));
        playlist.add(new Lagu("Hati-Hati di Jalan", "Tulus"));

        for (MediaAudio media : playlist) {
            media.putarAudio();
        }
    }
}

