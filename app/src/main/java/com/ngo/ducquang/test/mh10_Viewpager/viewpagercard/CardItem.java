package com.ngo.ducquang.test.mh10_Viewpager.viewpagercard;

/**
 * Created by ducqu on 5/29/2018.
 */

public class CardItem {
    private int idImage;
    private String mTextResource;
    private String mTitleResource;

    public CardItem(int idImage, String mTextResource, String mTitleResource) {
        this.idImage = idImage;
        this.mTextResource = mTextResource;
        this.mTitleResource = mTitleResource;
    }

    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }

    public String getmTextResource() {
        return mTextResource;
    }

    public void setmTextResource(String mTextResource) {
        this.mTextResource = mTextResource;
    }

    public String getmTitleResource() {
        return mTitleResource;
    }

    public void setmTitleResource(String mTitleResource) {
        this.mTitleResource = mTitleResource;
    }
}
