package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private int progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressBarId);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                 doWork();
            }
        });
        thread.start();
    }

    private void doWork() {

        for (progress=10;progress<=100;progress+=10){

            try {
                Thread.sleep(1000);
                progressBar.setProgress(progress);
            }catch (Exception e){

            }
        }


    }
}
