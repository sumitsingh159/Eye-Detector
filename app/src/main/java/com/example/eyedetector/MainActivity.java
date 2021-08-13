package com.example.eyedetector;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.pd.lookatme.LookAtMe;

public class MainActivity extends AppCompatActivity {
    private LookAtMe lookAtMe;
    public void owner (View view){
        Toast.makeText(this, "Sumit Singh", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lookAtMe = findViewById(R.id.lookme);
        lookAtMe.init(this);
        lookAtMe.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.videoplayback));
        // lookAtMe.setVideoPath("http://website.com/video/mp4/62000/62792m.mp4"); to use video from a url

        lookAtMe.start();
        lookAtMe.setLookMe();
    }
}