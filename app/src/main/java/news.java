public class news {
    private String title;
    private int images;
    private String detail;


    public news(String title,int images,String detail) {
        this.title = title;
        this.images=images;
        this.detail=detail;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getTitle() {
        return title;
    }

    public int getImages() {
        return images;
    }

    public String getDetail() {
        return detail;
    }
}
