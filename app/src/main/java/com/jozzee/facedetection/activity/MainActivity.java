package com.jozzee.facedetection.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jozzee.facedetection.R;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button detectPhotoBtn = (Button) findViewById(R.id.face_detect_photo_btn);
        Button faceTrackerBtn = (Button) findViewById(R.id.face_tracker_btn);

        detectPhotoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getApplicationContext(), FaceDetectPhotoActivity.class));
            }
        });
        faceTrackerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), FaceTrackerActivity.class));
            }
        });

    }
}
