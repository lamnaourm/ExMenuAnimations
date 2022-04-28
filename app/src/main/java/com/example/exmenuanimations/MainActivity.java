package com.example.exmenuanimations;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.m1: Toast.makeText(this, "Menu 1", Toast.LENGTH_SHORT).show(); break;
            case R.id.m2: Toast.makeText(this, "Menu 2", Toast.LENGTH_SHORT).show(); break;
            case R.id.m3: Toast.makeText(this, "Menu 3", Toast.LENGTH_SHORT).show(); break;
            case R.id.m4: Toast.makeText(this, "Menu 4", Toast.LENGTH_SHORT).show(); break;
        }
        return true;
    }
}