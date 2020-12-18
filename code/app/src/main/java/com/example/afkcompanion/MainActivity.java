package com.example.afkcompanion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {
    Button tierListButton;
    Button guidesButton;
    Button databaseButton;
    Button button_Clear, button_View;
    EditText et_Champion, et_faction;
    ListView List_Champions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        //NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);

        tierListButton = (Button) findViewById(R.id.button);
        tierListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTierListActivity();
            }
        });

        guidesButton = (Button) findViewById(R.id.button2);
        guidesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGuidesActivity();
            }
        });

        databaseButton = (Button) findViewById(R.id.button3);
        databaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDatabaseSearch();
            }
        });
    }

    private void openTierListActivity() {
        Intent intent = new Intent(this, TierListActivity.class);
        startActivity(intent);
    }
    private void openGuidesActivity() {
        Intent intent = new Intent(this, GuidesActivity.class);
        startActivity(intent);
    }
    private void openDatabaseSearch() {
        Intent intent = new Intent(this, DatabaseSearchActivity.class);
        startActivity(intent);
    }
/* Database code here
        button_View = findViewById(R.id.button_View);
        button_Clear = findViewById(R.id.button_Clear);
        et_Champion = findViewById(R.id.et_champion);
        et_faction = findViewById(R.id.et_faction);
        List_Champions = findViewById(R.id.List_Champions);

        //button click listener
        button_View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ChampionDatabase championModel;

                championModel = new ChampionDatabase(-1, et_Champion.getText().toString(), et_faction.getText().toString());

                Toast.makeText(MainActivity.this, championModel.toString(), Toast.LENGTH_SHORT).show();

                DatabaseAssistant dataBaserHelper = new DatabaseAssistant(MainActivity.this);

            }
        });
        button_Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clearing", Toast.LENGTH_SHORT).show();
            }
        });*/
    }