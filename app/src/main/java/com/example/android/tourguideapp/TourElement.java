package com.example.android.tourguideapp;

/**
 * {@link TourElement} represents atraction at the city that the user wants to see / visit.
 * It contains ...
 */

public class TourElement {

    /** Name of the event, restaurant or place */
    private String mElementName;

    /** Address of the event, restaurant or place */
    private String mElementLocation;

    /** Description of the event, restaurant or place */
    private String mElementDescription;

    /** Image resource ID for the element (it can be photo or icon) */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Returns the string representation of the {@link TourElement} object.
     */
    @Override
    public String toString() {
        return "TourElement{" +
                "mElementName='" + mElementName + '\'' +
                ", mElementLocation='" + mElementLocation + '\'' +
                ", mElementDescription='" + mElementDescription + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }

    /**
     * Create a new TourElement object.
     *
     * @param elementName is the name of the restaurant or event or place to visit
     * @param elementLocation is the address of the restaurant or event or place to visit
     * @param elementDescription is the short introduction / summary regarding the restaurant
     * or event or place to visit
     */
    public TourElement(String elementName, String elementLocation, String elementDescription) {
        mElementName = elementName;
        mElementLocation = elementLocation;
        mElementDescription = elementDescription;
    }

    /**
     * Create a new TourElement object.
     *
     * @param elementName is the name of the restaurant or event or place to visit
     * @param elementLocation is the address of the restaurant or event or place to visit
     * @param elementDescription is the short introduction / summary regarding the restaurant
     * or event or place to visit
     * @param imageResourceId is the drawable resource Id for the image associated with the Word
     */
    public TourElement(String elementName, String elementLocation, String elementDescription, int imageResourceId) {
        mElementName = elementName;
        mElementLocation = elementLocation;
        mElementDescription = elementDescription;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getElementName(){
        return mElementName;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getElementLocation(){
        return mElementLocation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getElementDescription(){
        return mElementDescription;
    }

    /**
     * Return the image resource ID of the word
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
