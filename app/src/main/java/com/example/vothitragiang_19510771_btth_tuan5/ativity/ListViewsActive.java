package com.example.vothitragiang_19510771_btth_tuan5.ativity;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.vothitragiang_19510771_btth_tuan5.adapter.ListAdapter;
import com.example.vothitragiang_19510771_btth_tuan5.model.Donut;
import com.example.vothitragiang_19510771_btth_tuan5.R;

import java.util.ArrayList;
import java.util.List;

public class ListViewsActive extends AppCompatActivity {
    private List<Donut> donutList;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.idListView);
        donutList = new ArrayList<>();
        donutList.add(new Donut(1,"Tasty Donut","Spicy tasty donut family",10));
        donutList.add(new Donut(2,"Pink Donut","Spicy tasty donut family",20));
        donutList.add(new Donut(3,"Floating Donut","Spicy tasty donut family",30));
        donutList.add(new Donut(4,"Tasty Donut","Spicy tasty donut family",10));

        ListAdapter adapter = new ListAdapter(this, R.layout.list_donuts_item, donutList);
        listView.setAdapter(adapter);

    }
}
