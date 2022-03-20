package isd;

public class MusicList {
        private String judulLagu, penyanyi;

    public MusicList(String judulLagu, String penyanyi) {
        this.judulLagu = judulLagu;
        this.penyanyi = penyanyi;
    }

    public String getJudulLagu() {
        return this.judulLagu;
    }

    @Override
    public String toString() {
        return this.judulLagu;
    }
}

