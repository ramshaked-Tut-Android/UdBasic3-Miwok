package com.example.android.miwok;

public class WordImage extends Word {
    /** Miwok translation for the word */
    private int mImgResourceId;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public WordImage(String defaultTranslation, String miwokTranslation, int imgResourceId) {
        super(defaultTranslation, miwokTranslation);
        mImgResourceId = imgResourceId;
    }

    public int getmImgResourceId() {
        return mImgResourceId;
    }

}
