package com.nomadlab.mylayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

    public class MainActivity extends AppCompatActivity {

        Toolbar toolbar;
        BottomNavigationView bottomNavigationView;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            toolbar = findViewById(R.id.topAppBar);
            bottomNavigationView = findViewById(R.id.bottom_navigation);

            setSupportActionBar(toolbar);
            addMenuEventListener();

        }

        private void addMenuEventListener() {
            bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()) {
                        case R.id.page_1:
                            Log.d("TAG", "bottomNavigationView1 selected");
                            break;
                        case R.id.page_2:
                            Log.d("TAG", "bottomNavigationView2 selected");
                            break;
                        case R.id.page_3:
                            Log.d("TAG", "bottomNavigationView3 selected");
                            break;
                        case R.id.page_4:
                            Log.d("TAG", "bottomNavigationView4 selected");
                            break;
                    }
                    return true;
                }
            });
        }


        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.top_app_bar, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.menuItem1:
                    Log.d("TAG", "menuItem1 selected");
                    break;
                case R.id.menuITem2:
                    Log.d("TAG", "menuItem2 selected");
                    break;
            }
            return true;
        }
    }