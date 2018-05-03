package com.example.kushan.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycle;
    private RecyclerView.Adapter adapter;
    private List<ListModel> listModels ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycle = (RecyclerView)findViewById(R.id.recycle);
        recycle.setHasFixedSize(true);
        recycle.setLayoutManager(new LinearLayoutManager(this));

        listModels = new ArrayList<>();

        for(int i=0;i<=10;i++){
            ListModel listModel = new ListModel(
                "srilanka","galle");
            listModels.add(listModel);
        }

        adapter = new MyAdapter(listModels,this);
        recycle.setAdapter(adapter);
    }
}
