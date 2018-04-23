package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Iwona on 22.04.2018.
 */

public class TourElementAdapter extends ArrayAdapter<TourElement> {

    /**Resource ID for the background color to this list of words*/
    private int mColorResourceId;

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param words A List of Words objects to display in a list
     * @param colorResourceId refers to the color of the activity
     */
    public TourElementAdapter(Activity context, ArrayList<TourElement> words, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link WordAdapter} object located at this position in the list
        TourElement currentTourElement = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentTourElement.getElementName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        locationTextView.setText(currentTourElement.getElementLocation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        descriptionTextView.setText(currentTourElement.getElementDescription());

        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if(currentTourElement.hasImage()){
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentTourElement.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else{
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        //Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        //Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        //Set the background color of the next container View
        textContainer.setBackgroundColor(color);
        //Set the background color of the next container View
        imageView.setBackgroundColor(color);
        View primaryContainer = listItemView.findViewById(R.id.primary_container);
        primaryContainer.setBackgroundColor(color);


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
