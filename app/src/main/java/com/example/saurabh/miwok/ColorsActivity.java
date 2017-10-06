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
        numWords.add(new word("Red", "weṭeṭṭi", R.drawable.color_red));
        numWords.add(new word("Green", "chokokki", R.drawable.color_green));
        numWords.add(new word("Brown", "takakki", R.drawable.color_brown));
        numWords.add(new word("gray", "topoppi", R.drawable.color_gray));
        numWords.add(new word("Black", "kululli", R.drawable.color_black));
        numWords.add(new word("White", "kelelli", R.drawable.color_white));
        numWords.add(new word("Dusty Yellow", "topiisa", R.drawable.color_dusty_yellow));
        numWords.add(new word("Mustard Yellow", "chiwiita", R.drawable.color_mustard_yellow));


        ArrayAdapter<word> adapter = new wordAdapter(this, numWords);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
