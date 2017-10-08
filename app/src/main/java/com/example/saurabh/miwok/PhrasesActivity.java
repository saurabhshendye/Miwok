package com.example.saurabh.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<word> numWords = new ArrayList<>();
        numWords.add(new word("Where are you going?", "minto wuksus", R.raw.phrase_where_are_you_going));
        numWords.add(new word("What is your name?", "tinnә oyaase'nә", R.raw.phrase_what_is_your_name));
        numWords.add(new word("My name is..", "oyaaset..", R.raw.phrase_my_name_is));
        numWords.add(new word("Are you coming?", "әәnәs'aa?", R.raw.phrase_are_you_coming));
        numWords.add(new word("Yes, I’m coming", "hәә’ әәnәm", R.raw.phrase_yes_im_coming));
        numWords.add(new word("I’m coming.", "kelelli", R.raw.phrase_im_coming));
        numWords.add(new word("Let’s go", "yoowutis", R.raw.phrase_lets_go));
        numWords.add(new word("Come here", "әnni'nem", R.raw.phrase_come_here));

        String color = "#16AFCA";
        ArrayAdapter<word> adapter = new wordAdapter(this, numWords, color);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id ) {

                MediaPlayer mediaPlayer = MediaPlayer.create(PhrasesActivity.this, numWords.get(position).getSoundResourceId());
                mediaPlayer.start();


            }
        });
    }
}
