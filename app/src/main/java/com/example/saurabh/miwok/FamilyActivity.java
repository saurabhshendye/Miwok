package com.example.saurabh.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<word> numWords = new ArrayList<>();
        numWords.add(new word("Father", "apa", R.drawable.family_father));
        numWords.add(new word("Mother", "ata",R.drawable.family_mother));
        numWords.add(new word("Son", "angsi", R.drawable.family_son));
        numWords.add(new word("Daughter", "tune",R.drawable.family_daughter));
        numWords.add(new word("Older Brother", "taachi", R.drawable.family_older_brother));
        numWords.add(new word("Younger Brother", "chalitti", R.drawable.family_younger_brother));
        numWords.add(new word("Older Sister", "tete", R.drawable.family_older_sister));
        numWords.add(new word("Youger Sister", "kolliti", R.drawable.family_younger_sister));
        numWords.add(new word("Grandmother", "ama", R.drawable.family_grandmother));
        numWords.add(new word("Grandfather", "paapa", R.drawable.family_grandfather));

        ArrayAdapter<word> adapter = new wordAdapter(this, numWords);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
