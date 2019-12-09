package com.example.sqliteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        StudentDatabase studentDatabaseHelper = new StudentDatabase(this.getApplicationContext());
        SQLiteDatabase db = studentDatabaseHelper.getWritableDatabase();
        db.execSQL("INSERT INTO student(id, name) VALUES(1, 'Assane')");
        db.execSQL("INSERT INTO student(id, name) VALUES(2, 'Fall')");
        db.execSQL("INSERT INTO student(id, name) VALUES(3, 'Baye Fall')");
    }
}
