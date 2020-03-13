package com.ekorydes.jsonbscsclab130320;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Department> list=new ArrayList<>();
        list.add(new Department("CS"));
        list.add(new Department("SE"));
        list.add(new Department("IT"));


        Uni objectUni=new Uni("Superior",2000,list);
        Gson objectGson=new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();

        String responseJSON=objectGson.toJson(objectUni);
        
    }
}
