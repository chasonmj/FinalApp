package edu.chason.matt.finalapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class social extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);
    }

    /** Called when the user taps the Facebook button */
    public void sendMessage(View view) {
        switch (view.getId()) {
            case R.id.button2:
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("https://touch.facebook.com/" )));
            break;
            case R.id.button3:
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("https://twitter.com/login?lang=en" )));
            break;
        }
        //startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("https://touch.facebook.com/" )));
    }


}
