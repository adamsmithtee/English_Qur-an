package com.example.adamsmith.englishquran;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by adamsmith on 19-Nov-18.
 */

public class QuranListAdapter extends RecyclerView.Adapter<QuranListAdapter.QuranViewHolder> {

    private static final String TAG = QuranListAdapter.class.getSimpleName();

    private Context mContext;

   private String[] mChapters;


    // this sets in MainActivity or any otherActivity
//    public QuranListAdapter(String[] Chapters){
//        this.mChapters = Chapters;
//    }

    public QuranListAdapter(){

    }

    /**
     * Inner class to hold the views needed to display a single item in the recycler-view
     */
    public class QuranViewHolder extends RecyclerView.ViewHolder{
        // define view objects
        public final TextView mQuranVerseTextView;;

        public QuranViewHolder(View itemView) {
            super(itemView);
            //initialize view objects
            mQuranVerseTextView = (TextView) itemView.findViewById(R.id.quran_text);
        }

    }

    @Override
    public QuranListAdapter.QuranViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Get the RecyclerView item layout
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.quran_chapter_list_item, parent, false);
        return new QuranViewHolder(view);
    }

    @Override
    public void onBindViewHolder(QuranListAdapter.QuranViewHolder holder, int position) {

        // Set the holder's nameTextView text to the guest's name
//        String currentVerse = mVerseData[position];
//        holder.mQuranVerseTextView.setText(currentVerse);
//        holder.mVerseTextView.setText(String.valueOf(position));

        String chapter = mChapters[position];
//        holder.mVerseTextView.setText(String.valueOf(position));
        holder.mQuranVerseTextView.setText(chapter);

    }

    @Override
    public int getItemCount() {
//        return mNumberItems;
        return mChapters.length;
    }

    public void setChapterData(String[] chapterData ){
        mChapters= chapterData;
        notifyDataSetChanged();
    }

}

