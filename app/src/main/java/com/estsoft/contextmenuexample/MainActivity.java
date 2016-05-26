package com.estsoft.contextmenuexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registerForContextMenu(findViewById(android.R.id.content));
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        switch (v.getId()){
            case android.R.id.content :
                getMenuInflater().inflate(R.menu.context_menu, menu);
                break;
            default:
                break;
        }
        super.onCreateContextMenu(menu, v, menuInfo);
    }
}