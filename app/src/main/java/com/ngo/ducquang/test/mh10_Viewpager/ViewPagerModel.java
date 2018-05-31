package com.ngo.ducquang.test.mh10_Viewpager;

/**
 * Created by ducqu on 5/29/2018.
 */

public class ViewPagerModel {
    private int idImage;
    private String nameAnimal, contentAnimal;
    private boolean isChecked = false;

    public ViewPagerModel(int idImage, String nameAnimal, String contentAnimal) {
        this.idImage = idImage;
        this.nameAnimal = nameAnimal;
        this.contentAnimal = contentAnimal;
    }

    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public String getContentAnimal() {
        return contentAnimal;
    }

    public void setContentAnimal(String contentAnimal) {
        this.contentAnimal = contentAnimal;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }
}
