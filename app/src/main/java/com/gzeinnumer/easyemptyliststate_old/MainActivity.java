package com.gzeinnumer.easyemptyliststate_old;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("No Nested");

        rv = findViewById(R.id.easy_empty_list);
        img = findViewById(R.id.img);
        initRVView();
    }

    private void initRVView() {
        int size = 1;
        if (size==0){
            img.setVisibility(View.VISIBLE);
            rv.setVisibility(View.GONE);
        } else {
            img.setVisibility(View.GONE);
            rv.setVisibility(View.VISIBLE);

            DummyAdapterV2 adapter = new DummyAdapterV2(R.layout.item_view, position -> {

            });

            rv.setAdapter(adapter);
            rv.hasFixedSize();
            rv.setLayoutManager(new LinearLayoutManager(this));
        }
    }
}