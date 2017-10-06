package com.example.saurabh.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by saurabhs on 9/30/17.
 */

class wordAdapter extends ArrayAdapter<word> {

    wordAdapter(Context context, ArrayList<word> words) {
        super(context, 0, words);
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

        TextView miwokView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokView.setText(currentWord.getMiwokWord());


        TextView defaultView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultView.setText(currentWord.getTranslation());

        return listItemView;
    }
}
