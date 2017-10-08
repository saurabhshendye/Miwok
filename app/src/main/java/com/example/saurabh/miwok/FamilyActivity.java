package com.example.saurabh.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<word> numWords = new ArrayList<>();
        numWords.add(new word("Father", "apa", R.drawable.family_father, R.raw.family_father));
        numWords.add(new word("Mother", "ata",R.drawable.family_mother, R.raw.family_mother));
        numWords.add(new word("Son", "angsi", R.drawable.family_son, R.raw.family_son));
        numWords.add(new word("Daughter", "tune",R.drawable.family_daughter, R.raw.family_daughter));
        numWords.add(new word("Older Brother", "taachi", R.drawable.family_older_brother, R.raw.family_older_brother));
        numWords.add(new word("Younger Brother", "chalitti", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        numWords.add(new word("Older Sister", "tete", R.drawable.family_older_sister, R.raw.family_older_sister));
        numWords.add(new word("Youger Sister", "kolliti", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        numWords.add(new word("Grandmother", "ama", R.drawable.family_grandmother, R.raw.family_grandmother));
        numWords.add(new word("Grandfather", "paapa", R.drawable.family_grandfather, R.raw.family_grandfather));

        String color = "#379237";
        ArrayAdapter<word> adapter = new wordAdapter(this, numWords, color);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id ) {

                MediaPlayer mediaPlayer = MediaPlayer.create(FamilyActivity.this, numWords.get(position).getSoundResourceId());
                mediaPlayer.start();

            }
        });
    }
}
