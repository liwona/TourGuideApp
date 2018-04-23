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
                "for polish monarchy", R.drawable.wawel));
        tourElements.add(new TourElement("Main Square",
                "30-062 Kraków", "It is the principal urban space " +
                "located at the center of the city"));
        tourElements.add(new TourElement("Kraków Cloth Hall (Sukiennice)",
                "Rynek Główny 1-3, 30-001 Kraków", " It is the " +
                "central feature of the main market square in the Kraków Old Town"));
        tourElements.add(new TourElement("Oskar Schindler's Enamel Factory",
                "Lipowa 4, 30-702 Kraków", "A former metal item factory in " +
                "Kraków, is now host to two museums: the Museum of Contemporary Art in Kraków, " +
                "on the former workshops, and a branch of the Historical Museum of the City of " +
                "Kraków"));
        tourElements.add(new TourElement("St. Mary's Basilica (Kościół Mariacki)",
                "plac Mariacki 5, 31-042 Kraków", "A Brick Gothic " +
                "church adjacent to the Main Market Square in Kraków, Poland. Built in the " +
                "14th century", R.drawable.mariacki));
        tourElements.add(new TourElement("Kazimierz",
                "Kazimierz, Kraków", "It is a historical " +
                "district of Kraków and Kraków Old Town, Poland."));


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
