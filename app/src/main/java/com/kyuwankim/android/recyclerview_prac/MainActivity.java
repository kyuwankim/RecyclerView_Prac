package com.kyuwankim.android.recyclerview_prac;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    ArrayList<Data> datas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataSet data = new DataSet();
        datas = data.get();

        rv = (RecyclerView) findViewById(R.id.recyclerview);
        RecyclerAdapter ra = new RecyclerAdapter(datas, R.layout.list_card_item);
        rv.setAdapter(ra);

        rv.setLayoutManager(new LinearLayoutManager(this));


    }





}
