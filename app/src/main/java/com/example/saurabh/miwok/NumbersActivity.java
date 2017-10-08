package com.example.saurabh.miwok;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<word> numWords = new ArrayList<>();
        numWords.add(new word("one", "lutti", R.drawable.number_one, R.raw.number_one));
        numWords.add(new word("two", "otiiko", R.drawable.number_two, R.raw.number_two));
        numWords.add(new word("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
        numWords.add(new word("four", "oyyisa", R.drawable.number_four, R.raw.number_four));
        numWords.add(new word("five", "massokka", R.drawable.number_five, R.raw.number_five));
        numWords.add(new word("six", "temmokka", R.drawable.number_six, R.raw.number_six));
        numWords.add(new word("seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        numWords.add(new word("eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
        numWords.add(new word("nine", "wo’e", R.drawable.number_nine, R.raw.number_nine));
        numWords.add(new word("ten", "na’aacha", R.drawable.number_ten, R.raw.number_ten));

        String color = "#FD8E09";
        ArrayAdapter<word> adapter = new wordAdapter(this, numWords, color);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id ) {

                MediaPlayer mediaPlayer = MediaPlayer.create(NumbersActivity.this, numWords.get(position).getSoundResourceId());
                mediaPlayer.start();
            }
        });
    }
}
