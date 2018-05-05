package edu.chason.matt.finalapp;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[ ] menulist={"Scan", "Red Dye #40", "Profile", "Social"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.mainmenu, menulist));

    }

    protected void onListItemClick(ListView l, View v, int position, long id){
        switch(position){
            case 0:
                startActivity(new Intent(MainActivity.this, scan.class));
                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("https://www.mlb.com/brewers/ballpark" )));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, scan.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, scan.class));
                break;
            case 4:
                startActivity(new Intent(MainActivity.this, scan.class));
                break;
        }
    }


}
