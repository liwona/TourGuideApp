package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Iwona on 22.04.2018.
 */

public class PlacesFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.element_list, container, false);

        TextView welcomeTextView =(TextView) rootView.findViewById(R.id.welcome_message);
        welcomeTextView.setText(R.string.welcome_places_fragment);

        final ArrayList<TourElement> tourElements = new ArrayList<TourElement>();
        tourElements.add(new TourElement(getString(R.string.pf_element_0_name),
                getString(R.string.pf_element_0_location), getString(R.string.pf_element_0_description)));
        tourElements.add(new TourElement(getString(R.string.pf_element_1_name),
                getString(R.string.pf_element_1_location), getString(R.string.pf_element_1_description)));
        tourElements.add(new TourElement(getString(R.string.pf_element_2_name),
                getString(R.string.pf_element_2_location), getString(R.string.pf_element_2_description)));
        tourElements.add(new TourElement(getString(R.string.pf_element_3_name),
                getString(R.string.pf_element_3_location), getString(R.string.pf_element_3_description)));
        tourElements.add(new TourElement(getString(R.string.pf_element_4_name),
                getString(R.string.pf_element_4_location), getString(R.string.pf_element_4_description)));


        // Create an {@link TourElementAdapter}, whose data source is a list of {@link TourElement}. The
        // adapter knows how to create list items for each item in the list.
        TourElementAdapter adapter = new TourElementAdapter(getActivity(), tourElements, R.color.places_background);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link TourElementAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link TourElement} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
