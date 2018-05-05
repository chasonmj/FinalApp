package edu.chason.matt.finalapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class scan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        //startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("https://www.integrativenutrition.com/blog/2016/09/red-40-side-effects" )));

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Red Dye #40 Detected!");
                alertDialogBuilder.setPositiveButton("Learn More",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                               // Toast.makeText(scan.this,"Learn More",Toast.LENGTH_LONG).show();
                               startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("https://www.integrativenutrition.com/blog/2016/09/red-40-side-effects" )));
                            }
                        });

        alertDialogBuilder.setNegativeButton("Ignore",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();


    }

}
