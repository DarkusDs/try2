package com.example.try1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button_col = findViewById(R.id.button_collection);

        button_col.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCollectionActivity();
            }
        });
        Button button_shop = findViewById(R.id.button_shop);
        button_shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShopActivity();
            }
        });
        Button button_raid = findViewById(R.id.button_raid);
        button_raid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRaidActivity();
            }
        });
        Button button_options = findViewById(R.id.button_options);
        button_options.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOptionsActivity();
            }
        });
        ImageButton button_gm1 = findViewById(R.id.imageButton_GameMode1);
        button_gm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGameMode1Activity();
            }
        });





    }

    public void openCollectionActivity(){
        Intent intent = new Intent(this, CollectionActivity.class);
        startActivity(intent);
    }
    public void openShopActivity(){
        Intent intent = new Intent(this, ShopActivity.class);
        startActivity(intent);
    }
    public void openRaidActivity(){
        Intent intent = new Intent(this, RaidActivity.class);
        startActivity(intent);
    }
    public void openOptionsActivity(){
        Intent intent = new Intent(this, OptionsActivity.class);
        startActivity(intent);
    }
    public void openGameMode1Activity(){
        Intent intent = new Intent(this, GM1Activity.class);
        startActivity(intent);
    }

}
