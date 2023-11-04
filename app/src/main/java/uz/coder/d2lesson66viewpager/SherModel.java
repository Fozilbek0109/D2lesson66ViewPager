package uz.coder.d2lesson66viewpager;

import java.io.Serializable;

public class SherModel implements Serializable {
private String sher;
private String author;
private String img;

    public SherModel(String sher, String author, String img) {
        this.sher = sher;
        this.author = author;
        this.img = img;
    }

    public String getSher() {
        return sher;
    }

    public void setSher(String sher) {
        this.sher = sher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
