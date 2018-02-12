package com.example.msi.salonz;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainNavigation extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

    //public static DBHelper dbHelper;
    public static SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_navigation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        /*sp = PreferenceManager.getDefaultSharedPreferences(getBaseContext());

        if(!sp.contains(Word.COLUMN_WORDPHRASE)){
            SharedPreferences.Editor editor = sp.edit();
            editor.putInt(Word.COLUMN_WORDPHRASE,Word.WORDPHRASE_WORD);
            editor.commit();
        }
        if(!sp.contains(Word.COLUMN_CATEGORY)){
            SharedPreferences.Editor editor = sp.edit();
            editor.putInt(Word.COLUMN_CATEGORY,Word.CATEGORY_ALL);
            editor.commit();
        }
        if(!sp.contains(Word.COLUMN_DIFFICULTY)){
            SharedPreferences.Editor editor = sp.edit();
            editor.putInt(Word.COLUMN_DIFFICULTY,Word.DIFFICULTY_EASY);
            editor.commit();
        }
        if(!sp.contains(Word.COLUMN_LANGUAGE)){
            SharedPreferences.Editor editor = sp.edit();
            editor.putInt(Word.COLUMN_LANGUAGE,Word.LANGUAGE_CHINESE);
            editor.commit();
        }

        insertWords();*/

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.fl_fragment,new SalonListActivity()).commit();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_navigation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_reserve) {
            getSupportActionBar().setTitle("Settings");
            FragmentManager fm = getSupportFragmentManager();
            fm.beginTransaction().replace(R.id.fl_fragment,new Reserve()).commit();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        FragmentManager fm = getSupportFragmentManager();

        int id = item.getItemId();

        /*if (id == R.id.nav_learn) {
            getSupportActionBar().setTitle("LanguageMaster");
            fm.beginTransaction().replace(R.id.fl_fragment,new LearnActivity()).commit();
        } else if (id == R.id.nav_normal) {
            SharedPreferences.Editor editor = sp.edit();
            editor.putInt(HighScore.COLUMN_MODE,HighScore.QUIZMODE_NORMAL);
            editor.commit();
            changeTitleBar();
            TextDialog td = TextDialog.newInstance();
            td.show(getSupportFragmentManager(), TextDialog.class.getSimpleName());
        } else if (id == R.id.nav_timed) {
            SharedPreferences.Editor editor = sp.edit();
            editor.putInt(HighScore.COLUMN_MODE,HighScore.QUIZMODE_TIMED);
            editor.commit();
            changeTitleBar();
            TextDialog td = TextDialog.newInstance();
            td.show(getSupportFragmentManager(), TextDialog.class.getSimpleName());
        } else if (id == R.id.nav_survival) {
            SharedPreferences.Editor editor = sp.edit();
            editor.putInt(HighScore.COLUMN_MODE,HighScore.QUIZMODE_SURVIVAL);
            editor.commit();
            changeTitleBar();
            TextDialog td = TextDialog.newInstance();
            td.show(getSupportFragmentManager(), TextDialog.class.getSimpleName());
        } else if (id == R.id.nav_highscore) {
            fm.beginTransaction().replace(R.id.fl_fragment,new HighScoreActivity()).commit();
            getSupportActionBar().setTitle("High Score");
        }*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
