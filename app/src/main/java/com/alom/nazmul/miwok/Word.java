package com.alom.nazmul.miwok;

/**
 * Created by DELL on 11/13/2016.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = No_Image_Provided;
    private int mAudioResourceId;

    private static final int No_Image_Provided = 1;

    public Word (String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;

    }

    public Word (String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;

    }

    public String getDefaultTranslation() {

        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {

        return mMiwokTranslation;
    }

    public int getmImageResourceId() {

        return mImageResourceId;
    }

    public boolean hasImage() {

        return mImageResourceId != No_Image_Provided ;
    }

    public int getAudioResourceId() {

        return mAudioResourceId;
    }
}
