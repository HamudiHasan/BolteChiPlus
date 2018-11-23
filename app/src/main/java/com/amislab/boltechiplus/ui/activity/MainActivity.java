package com.amislab.boltechiplus.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.amislab.boltechiplus.R;
import com.amislab.boltechiplus.adapter.CategoryAdapter;
import com.amislab.boltechiplus.model.Category;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Category> categoryList = new ArrayList<>();
    private CategoryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new CategoryAdapter(this, categoryList);
        recyclerView = findViewById(R.id.rv_main);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        categoryList.add(new Category());
        categoryList.add(new Category());
        categoryList.add(new Category());
        categoryList.add(new Category());
        categoryList.add(new Category());
        adapter.notifyDataSetChanged();
    }
}
