package edu.chason.matt.finalapp;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class resources extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[ ] rlist={"FDA", "Mayo Clinic", "WebMD"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_resources, R.id.resmenu, rlist));


    }

    protected void onListItemClick(ListView l, View v, int position, long id){
        switch(position){
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("https://www.fda.gov/Food/IngredientsPackagingLabeling/FoodAdditivesIngredients/ucm094211.htm" )));
                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("https://www.mayoclinic.org/healthy-lifestyle/nutrition-and-healthy-eating/in-depth/healthy-recipes/art-20047195" )));
                break;
            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("https://www.webmd.com/food-recipes/features/healthy-ingredients#1" )));
                break;

        }
    }


}
