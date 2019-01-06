package com.example.adamsmith.englishquran;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.adamsmith.englishquran.data.ChaptersFunction;
import com.example.adamsmith.englishquran.data.QueryUtils001;

public class ChapterFourActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private static final String TAG = MainActivity.class.getSimpleName();

    private QuranListAdapter mAdapter;

    private RecyclerView quranRecyclerView;

    private String mChapters = QueryUtils001.CHAPTER_FOUR_JSON;

    TextView tittleTextView;

    TextView numberTextView;

    TextView number_verse_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tittleTextView = (TextView) findViewById(R.id.title_text);
        tittleTextView.setText(R.string.qur_4);

        number_verse_text = (TextView) findViewById(R.id.number_verse_text);
        number_verse_text.setText(R.string.ver_4);

        // Set local attributes to corresponding views
        quranRecyclerView = (RecyclerView) this.findViewById(R.id.quran_chapters_list_view);


        // Set layout for the RecyclerView, because it's a list we are using the linear layout
        quranRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        quranRecyclerView.setHasFixedSize(true);
        //
        // Create an adapter for that cursor to display the data //
        mAdapter = new QuranListAdapter();
        mAdapter.setChapterData(loadJsonData());
        // Link the adapter to the RecyclerView
        quranRecyclerView.setAdapter(mAdapter);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);

        } else {
            new AlertDialog.Builder(this)
                    .setTitle("Exit")
                    .setMessage("Are you sure you want to exit?")
                    .setNegativeButton(android.R.string.no, null)
                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface arg0, int arg1) {
                            ChapterFourActivity.super.onBackPressed();
                        }
                    }).create().show();
//            super.onBackPressed();
        }
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_one) {
            // opens chapteroneactivity
            chapterOne();
        } else if (id == R.id.nav_two) {
            //opens chaptertwoactivity
//            chapterTwo();
        } else if (id == R.id.nav_three) {
            chapterThree();

        } else if (id == R.id.nav_five) {
            chapterFive();
        } else if (id == R.id.nav_six) {
            chapterSix();
        } else if (id == R.id.nav_ten) {
            chapterTen();

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void chapterOne() {
        Context context = ChapterFourActivity.this;
        Class destinationActivity = MainActivity.class;
        Intent chapterOneIntent = new Intent(context, destinationActivity);
        startActivity(chapterOneIntent);
        finish();
    }


//    public void chapterTwo() {
//        Context context = ChapterThreeActivity.this;
//        Class destinationActivity = ChapterTwoActivity.class;
//        Intent chapterTwoIntent = new Intent(context, destinationActivity);
//        startActivity(chapterTwoIntent);
//    }
public void chapterThree() {
    Context context = ChapterFourActivity.this;
    Class destinationActivity = ChapterThreeActivity.class;
    Intent chapterThreeIntent = new Intent(context, destinationActivity);
    startActivity(chapterThreeIntent);
    finish();
}

    public void chapterFive() {
        Context context = ChapterFourActivity.this;
        Class destinationActivity = ChapterFiveActivity.class;
        Intent chapterThreeIntent = new Intent(context, destinationActivity);
        startActivity(chapterThreeIntent);
        finish();
    }
    public void chapterSix() {
        Intent intent = new Intent(ChapterFourActivity.this, ChapterSixActivity.class);
        startActivity(intent);
        finish();
    }

    public void chapterTen() {
        Context context = ChapterFourActivity.this;
        Class destinationActivity = ChapterTenActivity.class;
        Intent chapterTenIntent = new Intent(context, destinationActivity);
        startActivity(chapterTenIntent);
        finish();
    }

    protected String[] loadJsonData(){
        try {
            String[] jsonData = ChaptersFunction.getVersesStringsFromJson(ChapterFourActivity.this, mChapters );
            return jsonData;
        }catch (Exception e){
            Log.e("QueryUtils", "Problem parsing the JSON results", e);
            return null;
        }
    }


}

