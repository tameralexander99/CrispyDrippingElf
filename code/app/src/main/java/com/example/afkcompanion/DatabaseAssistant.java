package com.example.afkcompanion;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.nio.charset.spi.CharsetProvider;

public class DatabaseAssistant extends SQLiteOpenHelper {

    public static final String Champion_Table = "CHAMPION_TABLE";
    public static final String COLUMN_Champion_Title = "CHAMPION_NAME";
    public static final String COLUMN_Champion_Faction = "CHAMPION_FACTION";
    public static final String COLUMN_ID = "ID";

    public DatabaseAssistant(@Nullable Context context) {
        super(context, "ChampionsDatabase", null, 1);
    }

    //called first time when accessing database
    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + Champion_Table + " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_Champion_Title + " TEXT, " + COLUMN_Champion_Faction + " TEXT)";

        db.execSQL(createTable);
    }
    //when version number of database changes
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public boolean addOne(ChampionDatabase championModel){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_Champion_Title, championModel.getName());
        cv.put(COLUMN_Champion_Faction, championModel.getFaction());

        long insert = db.insert(Champion_Table, null, cv);
        if (insert == -1){
            return false;
        }else{
            return true;
        }
    }

}
