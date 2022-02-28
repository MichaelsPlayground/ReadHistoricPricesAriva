package de.androidcrypto.readhistoricpricesariva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button loadArivaCsvFile;
    Intent showPriceChartIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showPriceChartIntent = new Intent(MainActivity.this, ShowPriceChart.class);
        loadArivaCsvFile = findViewById(R.id.btnLoadArivaCsvFile);


        loadArivaCsvFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(showPriceChartIntent);
            }
        });

    }
}