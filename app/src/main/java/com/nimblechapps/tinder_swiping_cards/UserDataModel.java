package com.nimblechapps.tinder_swiping_cards;

/**
 * Created by user26 on 29/7/17.
 */

public class UserDataModel {
    String name, totalLikes;
    int photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTotalLikes() {
        return totalLikes;
    }

    public void setTotalLikes(String totalLikes) {
        this.totalLikes = totalLikes;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
