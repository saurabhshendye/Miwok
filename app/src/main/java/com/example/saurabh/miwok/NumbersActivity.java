package com.example.saurabh.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<word> numWords = new ArrayList<>();
        numWords.add(new word("one", "lutti"));
        numWords.add(new word("two", "otiiko"));
        numWords.add(new word("three", "tolookosu"));
        numWords.add(new word("four", "oyyisa"));
        numWords.add(new word("five", "massokka"));
        numWords.add(new word("six", "temmokka"));
        numWords.add(new word("seven", "kenekaku"));
        numWords.add(new word("eight", "kawinta"));
        numWords.add(new word("nine", "wo’e"));
        numWords.add(new word("ten", "na’aacha"));

        ArrayAdapter<word> adapter = new wordAdapter(this, numWords);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
