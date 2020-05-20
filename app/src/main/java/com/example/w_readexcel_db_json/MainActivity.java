package com.example.w_readexcel_db_json;
//讀取json檔案,RecycleView呈現
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<GoogleSiginAccountResult> googleList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        try {
            recyclerView = findViewById(R.id.review);
            InputStream is = getAssets().open("google.json");
            Gson gson = new Gson();
            googleList =  gson.fromJson(new InputStreamReader(is), new TypeToken<List<GoogleSiginAccountResult>>() {
            }.getType());

            Log.v("hank", "googleList:" + googleList.toString());

            GoogleSiginAccountRecylcerViewAdapter googleSiginAccountRecylcerViewAdapter = new GoogleSiginAccountRecylcerViewAdapter(googleList);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(googleSiginAccountRecylcerViewAdapter);



        } catch (Exception e) {
            Log.v("hank", "e:" + e.toString());
        }
    }
}
