package com.example.android.tourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Iwona on 22.04.2018.
 */

public class TourAdapter extends FragmentPagerAdapter {

    public TourAdapter(FragmentManager fm) {
        super(fm);
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
}

