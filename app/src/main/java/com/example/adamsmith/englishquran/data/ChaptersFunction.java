package com.example.adamsmith.englishquran.data;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by adamsmith on 04-Dec-18.
 */

public class ChaptersFunction {

    public static String[] getVersesStringsFromJson(Context context, String QueryUtils)
            throws JSONException {

        final String VER = "ayahs";

    /* String array to hold each day's weather String */
        String[] parsedJsonData = null;


        JSONObject baseJsonResponse = new JSONObject(QueryUtils);

        JSONArray verseArray = baseJsonResponse.getJSONArray(VER);

        parsedJsonData = new String[verseArray.length()];


        for (int i = 0; i < verseArray.length(); i++) {
            JSONObject currentVer = verseArray.getJSONObject(i);

            int number = currentVer.getInt("numberInSurah");
            String ver = currentVer.getString("text");

            parsedJsonData[i] = number +"." + "  " + ver;
        }
        return parsedJsonData;


    }

}
