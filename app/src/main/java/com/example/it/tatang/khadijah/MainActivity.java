package com.example.it.tatang.khadijah;

import android.app.ActionBar;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toolbar;

import com.example.it.tatang.khadijah.Apps.Controller.C_Main;


public class MainActivity extends AppCompatActivity {

    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private int id_home_item = 2131232188;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            if (savedInstanceState == null) {
                goDestination(C_Main.getInstance(getApplicationContext()).ChooseMenu(id_home_item));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        dl = (DrawerLayout) findViewById(R.id.drawerLayout);
        t = new ActionBarDrawerToggle(this, dl, R.string.Open, R.string.Close);
        dl.addDrawerListener(t);
        t.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_close);

        NavigationView nv = findViewById(R.id.nv);


//        setTitle("Background");
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                goDestination(C_Main.getInstance(getApplicationContext()).ChooseMenu(id));
                dl = findViewById(R.id.drawerLayout);
                dl.closeDrawer(GravityCompat.START);
                return true;

            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return t.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }

    private void goDestination(Fragment fragment) {
        if (fragment != null) {
            fragmentTransaction =
                    getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.container_activity, fragment);
            fragmentTransaction.commit();
        }
    }
}
