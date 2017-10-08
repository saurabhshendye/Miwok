package com.example.saurabh.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<word> numWords = new ArrayList<>();
        numWords.add(new word("Red", "weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
        numWords.add(new word("Green", "chokokki", R.drawable.color_green, R.raw.color_green));
        numWords.add(new word("Brown", "takakki", R.drawable.color_brown, R.raw.color_brown));
        numWords.add(new word("gray", "topoppi", R.drawable.color_gray, R.raw.color_gray));
        numWords.add(new word("Black", "kululli", R.drawable.color_black, R.raw.color_black));
        numWords.add(new word("White", "kelelli", R.drawable.color_white, R.raw.color_white));
        numWords.add(new word("Dusty Yellow", "topiisa", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        numWords.add(new word("Mustard Yellow", "chiwiita", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));


        String color = "#8800A0";
        ArrayAdapter<word> adapter = new wordAdapter(this, numWords, color);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id ) {
//                Intent intent = new Intent(NumbersActivity.this, playAudio.class);
//                startActivity(intent);

                MediaPlayer mediaPlayer = MediaPlayer.create(ColorsActivity.this, numWords.get(position).getSoundResourceId());
                mediaPlayer.start();


            }
        });
    }
}
