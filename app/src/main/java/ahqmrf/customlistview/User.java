package ahqmrf.customlistview;

/**
 * Created by ahqmrf on 1/5/2017.
 */

public class User {
    private String handle;
    private int lastOnline;
    private int rating;
    private String titlePhoto;

    public User(String handle, int lastOnline, int rating, String titlePhoto) {
        this.handle = handle;
        this.lastOnline = lastOnline;
        this.rating = rating;
        this.titlePhoto = titlePhoto;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public int getLastOnline() {
        return lastOnline;
    }

    public void setLastOnline(int lastOnline) {
        this.lastOnline = lastOnline;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getTitlePhoto() {
        return titlePhoto;
    }

    public void setTitlePhoto(String titlePhoto) {
        this.titlePhoto = titlePhoto;
    }
}
