package org.sara.listview;

public class ListViewitem {

    private int imageResource;
    private String title;

    public ListViewitem(int imageResource, String title) {
        this.imageResource = imageResource;
        this.title = title;
    }

    public int getImageResource() {
        return imageResource;}

    public String getTitle () {return title; }
}