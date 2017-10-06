package com.example.saurabh.miwok;

/**
 * Created by saurabhs on 9/29/17.
 *
 * {@link word} Represeints vocabulary word and presents with methids to get the miwok as well as translated word
 */

public class word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;


    public word(String miwok, String translated) {
        mMiwokTranslation = miwok;
        mDefaultTranslation = miwok;
    }

    public String getTranslation() {
        return mMiwokTranslation;
    }

    public String getMiwokWord() {
        return mDefaultTranslation;
    }
}
