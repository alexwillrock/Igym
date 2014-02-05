package com.alexWillrock.Igym.menu;

import android.app.Activity;
import android.content.Intent;
import android.view.MenuItem;
import com.alexWillrock.Igym.GymActivity;
import com.alexWillrock.Igym.R;

public class MainMenu extends Activity{

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu){
        getMenuInflater().inflate(R.menu.mainmenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.menuGym:
                Intent intent = new Intent(this, GymActivity.class);
                startActivity(intent);
                break;
            case R.id.menuSquat:
                //
                break;
            case R.id.menuDeadlift:
                //
                break;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
