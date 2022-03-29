package com.example.appppe4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TholdiSQLiteOpenHelper extends SQLiteOpenHelper {

    private static TholdiSQLiteOpenHelper singleton;
    private static final String DATABASE_NAME = "zonestockage.db";
    private static int DATABASE_VERSION = 1;

    public TholdiSQLiteOpenHelper(Context aContext) {
        super(aContext, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public static synchronized TholdiSQLiteOpenHelper getInstance(Context aContext) {
        if (singleton == null) {
            singleton = new TholdiSQLiteOpenHelper(aContext);
        }
        return singleton;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }


}


