package com.example.search;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    SearchView searchView;
    ListView listView;
    ArrayList<String>names=new ArrayList<>(Arrays.asList("apple","mango","banana","orange","sappota"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchView=findViewById(R.id.search);
        listView=findViewById(R.id.lview);


        final ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1,names);
        listView.setAdapter(arrayAdapter);



        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                arrayAdapter.getFilter().filter(s);
                return false;
            }
        });

//
//        final Fruitsadapter fruitsadapter=new Fruitsadapter(MainActivity.this,names);
//        listView.setAdapter(fruitsadapter);
//
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String s) {
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String s) {
//                return false;
//            }
//        });
    }
}
