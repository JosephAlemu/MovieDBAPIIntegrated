package movieapi.joseph.com.movieapi.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by Admin on 2/22/2018.
 */

public class Movie implements Serializable {

    private String original_title;

    private String release_date;

    private double vote_count;

    public Movie(String original_title, String release_date, double vote_count) {
        this.original_title = original_title;
        this.release_date = release_date;
        this.vote_count = vote_count;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public double getVote_count() {
        return vote_count;
    }

    public void setVote_count(double vote_count) {
        this.vote_count = vote_count;
    }


}
