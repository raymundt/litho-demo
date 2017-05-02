package com.project.lithodemo.object;

public class Article {

    public enum DisplayType {
        TEXT_ONLY,
        SMALL_IMAGE,
        LARGE_IMAGE,
        THREE_IMAGES,
        WEB
    }

    private String title;
    private DisplayType displayType;
    private String[] images;
    private String link;

    public Article(String title, DisplayType displayType, String[] images) {
        this.title = title;
        this.displayType = displayType;
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public DisplayType getDisplayType() {
        return displayType;
    }

    public void setDisplayType(DisplayType displayType) {
        this.displayType = displayType;
    }

    public String[] getImages() {
        return images;
    }

    public void setImages(String[] images) {
        this.images = images;
    }

    public String getImage() {
        return images != null && images.length > 0 ? images[0] : null;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
