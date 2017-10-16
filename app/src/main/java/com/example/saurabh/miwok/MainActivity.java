package com.example.saurabh.miwok;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        MiwokFragmentPagerAdapter adapter = new MiwokFragmentPagerAdapter(getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);


//        setContentView(R.layout.activity_main);
//
//        TextView numbers = (TextView) findViewById(R.id.numbers);
//        numbers.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent numIntent = new Intent(MainActivity.this, NumbersActivity.class);
//                startActivity(numIntent);
//            }
//        });
//
//        TextView colors = (TextView) findViewById(R.id.colors);
//        colors.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent colIntent = new Intent(MainActivity.this, ColorsActivity.class);
//                startActivity(colIntent);
//            }
//        });
//
//        TextView family = (TextView) findViewById(R.id.family);
//        family.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent famIntent = new Intent(MainActivity.this, FamilyActivity.class);
//                startActivity(famIntent);
//            }
//        });
//
//        TextView phrases = (TextView) findViewById(R.id.phrases);
//        phrases.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent phrIntent = new Intent(MainActivity.this, PhrasesActivity.class);
//                startActivity(phrIntent);
//            }
//
//        });

    }
}
