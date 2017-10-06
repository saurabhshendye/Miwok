package com.example.saurabh.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<word> numWords = new ArrayList<>();
        numWords.add(new word("Red", "weṭeṭṭi"));
        numWords.add(new word("Green", "chokokki"));
        numWords.add(new word("Brown", "takakki"));
        numWords.add(new word("gray", "topoppi"));
        numWords.add(new word("Black", "kululli"));
        numWords.add(new word("White", "kelelli"));
        numWords.add(new word("Dusty Yellow", "topiisa"));
        numWords.add(new word("Mustard Yellow", "chiwiita"));


        ArrayAdapter<word> adapter = new wordAdapter(this, numWords);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
