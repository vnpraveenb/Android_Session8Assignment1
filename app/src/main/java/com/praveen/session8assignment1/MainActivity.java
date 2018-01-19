package com.praveen.session8assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> monthsList;         // Declaring ArrayList Object to store month list as strings
    ArrayAdapter<String> monthsListAdapter; // Declaring ArrayList Adapter to show month objects
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //References View Object with Layout Views
        Button ascButton = findViewById(R.id.ascButton);
        Button descButton = findViewById(R.id.descButton);
        ListView listView = findViewById(R.id.listView);

        ascButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Collections.sort(monthsList);
                monthsListAdapter.notifyDataSetChanged();

            }
        });

        descButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Collections.sort(monthsList);
                Collections.reverse(monthsList);
                monthsListAdapter.notifyDataSetChanged();
            }
        });


        // Initializing ArrayList Object with months of the year
        monthsList = new ArrayList<String>();
        monthsList.add("January");
        monthsList.add("February");
        monthsList.add("March");
        monthsList.add("April");
        monthsList.add("May");
        monthsList.add("June");
        monthsList.add("July");
        monthsList.add("August");
        monthsList.add("September");
        monthsList.add("October");
        monthsList.add("November");
        monthsList.add("December");

        // Binding the ArrayList to ArrayAdapter
        monthsListAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,monthsList);
        listView.setAdapter(monthsListAdapter);



    }
}
