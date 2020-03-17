package com.example.crud;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.TextView;

import androidx.annotation.Nullable;

import org.json.JSONArray;

class crud extends SQLiteOpenHelper{

    public crud(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, "vehicles.db", factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table vehicles(id text primary key,name text)");
    }

    public void insert(String id, String name) {
        ContentValues cv=new ContentValues();
        cv.put("id",id);
        cv.put("name",name);
        this.getWritableDatabase().insertOrThrow("vehicles","",cv);
    }
    public void delete(String id)
    {
        this.getWritableDatabase().delete("vehicles","id='"+id+"'",null);
    }
    public void update(String id,String name)
    {
        this.getWritableDatabase().execSQL("update vehicles set name='"+name+"' where id='"+id+"'");
    }

    public String list(TextView tview)
    {
        JSONArray resSet=new JSONArray();
        Cursor cr=this.getReadableDatabase().rawQuery("select * from vehicles",null);
        tview.setText("");
        while (cr.moveToNext())
        {
            tview.append(cr.getString(0)+" "+cr.getString(1));
            resSet.put(cr.getString(0)+" "+cr.getString(1));

        }
        return String.valueOf(resSet);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}