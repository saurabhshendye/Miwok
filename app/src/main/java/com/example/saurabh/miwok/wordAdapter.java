package com.example.saurabh.miwok;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by saurabhs on 9/30/17.
 */

class wordAdapter extends ArrayAdapter<word> {

    private String backgroudColor;

    wordAdapter(Context context, ArrayList<word> words, String Color) {
        super(context, 0, words);
        backgroudColor = Color;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        // Check if the existing view is being reused, otherwise inflate the view
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        word currentWord = getItem(position);

        LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.LinearLayout);
        linearLayout.setBackgroundColor(Color.parseColor(backgroudColor));

        TextView miwokView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokView.setText(currentWord.getMiwokWord());


        TextView defaultView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultView.setText(currentWord.getTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
        if (currentWord.hasImage()) {
            imageView.setVisibility(View.VISIBLE);
            imageView.setImageResource(currentWord.getImageResourceId());
        } else {
            imageView.setVisibility(View.GONE);
        }
        return listItemView;
    }


}
