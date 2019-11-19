package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvNumber;
    Button BtnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvNumber = findViewById(R.id.recycler_number);
        rvNumber.setLayoutManager(new LinearLayoutManager(this));
        final NumberAdapter adapter = new NumberAdapter();
        rvNumber.setAdapter(adapter);
        final List<String> data1 = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            data1.add("lan");
            data1.add("Nam");
            data1.add("Cam");
        }
        final NumberAdapter adapter1 = new NumberAdapter();
        adapter.data = data1;
        rvNumber.setAdapter(adapter);

        findViewById(R.id.button_add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data1.add("hoc sinh moi");
                adapter.notifyDataSetChanged();
            }
        });
    }
}
