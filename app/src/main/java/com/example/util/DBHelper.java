package com.example.util;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper {
    private static final String DATABASE_NAME = "datastoragenew";//保存数据库名称
    private static final int DATABASE_VERSION = 1;//保存数据库版本号
    private static final String TABLE_NAME = "users";//保存表名称
    private static final String TABLE_NAME1 = "student";//保存表名称
    private static final String TABLE_NAME2 = "cs";//保存表名称
    private static final String TABLE_NAME3 = "course";//保存表名称
    private static final String ID = "_id";// 保存ID值
    private static final String USERNAME = "username";// 保存用户名
    private static final String PASSWORD = "password";// 保存密码
    private DBOpenHelper helper;
    private SQLiteDatabase db;

    public DBHelper(Context context) {
        helper = new DBOpenHelper(context) {
            @Override
            public void onCreate(SQLiteDatabase sqLiteDatabase) {

            }
        };
        db = helper.getWritableDatabase();

    }

    public void insert(DataBean db) {
    }

    private static abstract class DBOpenHelper extends SQLiteOpenHelper {
        private static final String CREATE_TABLE = "create table" + TABLE_NAME + "(" + ID + "inter primary key autoincrement," + USERNAME + "text not null," + PASSWORD + "text not null);";

        public DBOpenHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(CREATE_TABLE);// 创建表格
        }

        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("drop table if exists " + TABLE_NAME);//删除旧版表格
            onCreate(db);

        }
    }
    public void insert(User user){//向表中插入数据
        ContentValues values=new ContentValues();
        values.put(USERNAME,user.getUsername());
        values.put(PASSWORD,user.getPassword());
        db.insert(TABLE_NAME,null,values);

    }
    public User query(int id){
        User user=new User();
        Cursor cursor=db.query(TABLE_NAME,new String[]{
                USERNAME,PASSWORD},"_id="+id,null,null,null,null);
        if(cursor.getCount()>0){
            cursor.moveToFirst();
            user.setUsername(cursor.getString(0));
            user.setUsername(cursor.getString(1));
            return user;
        }
        cursor.close();
        return null;
    }
}

