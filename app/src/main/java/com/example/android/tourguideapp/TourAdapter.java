package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Iwona on 22.04.2018.
 */

public class TourAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link TourAdapter} object.
     *
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public TourAdapter(FragmentManager fm) {
        super(fm);
        Context mContext;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CultureFragment();
        } else if (position == 1){
            return new RestaurantsFragment();
        } else if (position == 2){
            return new EventsFragment();
        } else {
            return new PlacesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_culture);
        } else if (position == 1) {
            return mContext.getString(R.string.category_restaurants);
        } else if (position == 2) {
            return mContext.getString(R.string.category_events);
        } else {
            return mContext.getString(R.string.category_places);
        }
    }
}

