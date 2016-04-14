package com.example.ag.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by student on 14/04/2016.
 */
public class ClassTestScores extends SQLiteOpenHelper {

    private final static String Class_Test_Scores = "Score";
    private final static int DB_VERSION = 1;

    public ClassTestScores(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE TEST_SCORES "
               + "(_id INTEGER PRIMARY KEY AUTOINCREMENT, "
               + "NAME TEXT, "
               + "LAST_NAME TEXT, "
               + "STUDENT_PHONE INTEGER, "
               + "SCORE REAL);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
