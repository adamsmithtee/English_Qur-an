package com.example.adamsmith.englishquran;


/*
public class ChapterTwoActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private static final String TAG = ChapterTwoActivity.class.getSimpleName();


    private QuranListAdapter mAdapter;

    private RecyclerView quranRecyclerView;

    private String mChapters;

    TextView tittleTextView;

    TextView numberTextView;

    TextView number_verse_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tittleTextView = (TextView) findViewById(R.id.title_text);
        tittleTextView.setText(R.string.qur_1);

        numberTextView = (TextView) findViewById(R.id.number_text);
        numberTextView.setText(R.string.chap_1);

        number_verse_text = (TextView) findViewById(R.id.number_verse_text);
        number_verse_text.setText(R.string.ver_1);

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
            super.onBackPressed();
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
        } else if (id == R.id.nav_three) {

        } else if (id == R.id.nav_four) {

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
        Context context = ChapterTwoActivity.this;
        Class destinationActivity = MainActivity.class;
        Intent chapterOneIntent = new Intent(context, destinationActivity);
        startActivity(chapterOneIntent);
    }

    public void chapterTen() {
        Context context = ChapterTwoActivity.this;
        Class destinationActivity = ChapterTenActivity.class;
        Intent chapterTenIntent = new Intent(context, destinationActivity);
        startActivity(chapterTenIntent);
    }

    protected String[] loadJsonData(){
        try {
            String[] jsonData = ChaptersFunction.getVersesStringsFromJson(ChapterTwoActivity.this, mChapters );
            return jsonData;
        }catch (Exception e){
            Log.e("QueryUtils", "Problem parsing the earthquake JSON results", e);
            return null;
        }
    }

}
*/