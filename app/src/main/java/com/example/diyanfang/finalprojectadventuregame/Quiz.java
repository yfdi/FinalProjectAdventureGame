package com.example.diyanfang.finalprojectadventuregame;

/**
 * Created by diyanfang on 4/22/18.
 */

public class Quiz {

    public int cityName;
    public int description;
    public int photoId;
    public boolean isFinished;

    public int getCityName() {
        return cityName;
    }

    public void setCityName(int cityName) {
        this.cityName = cityName;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    public Quiz() {

    }

    public Quiz(int cityName, int description, int photoId, boolean isFinished) {
        this.cityName = cityName;
        this.description = description;
        this.photoId = photoId;
        this.isFinished = isFinished;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "cityName=" + cityName +
                ", description=" + description +
                ", photoId=" + photoId +
                ", isFinished=" + isFinished +
                '}';
    }
}
