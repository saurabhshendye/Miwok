package com.example.saurabh.miwok;

/**
 * Created by saurabhs on 9/29/17.
 *
 * {@link word} Represeints vocabulary word and presents with methids to get the miwok as well as translated word
 */

public class word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int imageResourceId;
    private int soundResourceId;
    private boolean isImage;

    public word(String miwok, String translated, int imageResourceId, int soundId) {
        this.mMiwokTranslation = miwok;
        this.mDefaultTranslation = translated;
        this.imageResourceId = imageResourceId;
        this.soundResourceId = soundId;
        isImage = true;
    }

    public word(String miwok, String translated, int soundId) {
        this.mMiwokTranslation = miwok;
        this.mDefaultTranslation = translated;
        this.soundResourceId = soundId;
        isImage = false;
    }

    public String getTranslation() {
        return mMiwokTranslation;
    }

    public String getMiwokWord() {
        return mDefaultTranslation;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public int getSoundResourceId() {
        return soundResourceId;
    }

    public boolean hasImage() {
        return isImage;
    }

}
