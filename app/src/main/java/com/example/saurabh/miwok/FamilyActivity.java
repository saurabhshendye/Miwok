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
        numWords.add(new word("Father", "apa"));
        numWords.add(new word("Mother", "ata"));
        numWords.add(new word("Son", "angsi"));
        numWords.add(new word("Daughter", "tune"));
        numWords.add(new word("Older Brother", "taachi"));
        numWords.add(new word("Younger Brother", "chalitti"));
        numWords.add(new word("Older Sister", "tete"));
        numWords.add(new word("Youger Sister", "kolliti"));
        numWords.add(new word("Grandmother", "ama"));
        numWords.add(new word("Grandfather", "paapa"));

        ArrayAdapter<word> adapter = new wordAdapter(this, numWords);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
