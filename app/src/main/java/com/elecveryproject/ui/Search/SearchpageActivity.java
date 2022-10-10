package com.elecveryproject.ui.Search;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.elecveryproject.R;
import com.elecveryproject.databinding.ActivityMainBinding;
import com.elecveryproject.ui.dashboard.DashboardViewModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SearchpageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_page);
        Button button=(Button) findViewById(R.id.back_page);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DashboardViewModel.class);
                startActivity(intent);
            }
        });
    }
}
