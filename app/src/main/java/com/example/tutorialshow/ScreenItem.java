package com.example.tutorialshow;

public class ScreenItem {

    private int Title;
    private int Description;
    private int ScreenImg;

    public ScreenItem(int title, int description, int screenImg) {
        Title = title;
        Description = description;
        ScreenImg = screenImg;
    }

    public int getTitle() {
        return Title;
    }

    public int getDescription() {
        return Description;
    }

    public int getScreenImg() {
        return ScreenImg;
    }
}
