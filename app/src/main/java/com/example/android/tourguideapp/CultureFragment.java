package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class CultureFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.element_list, container, false);

        final ArrayList<TourElement> tourElements = new ArrayList<TourElement>();
        tourElements.add(new TourElement("Wawel Castle",
                "Wawel 5, 31-001 Kraków", "A castle residency build " +
                "for polish monarchy"));
        tourElements.add(new TourElement("Main Square",
                "30-062 Kraków", "It is the principal urban space " +
                "located at the center of the city"));

        // Create an {@link TourElementAdapter}, whose data source is a list of {@link TourElement}. The
        // adapter knows how to create list items for each item in the list.
        TourElementAdapter adapter = new TourElementAdapter(getActivity(), tourElements, R.color.primary_background);

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
