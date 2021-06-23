package com.example.splashscreendifferentactivitiesprojects;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;

public class SQLiteDataBase extends SQLiteOpenHelper {
     SQLiteDatabase  db;

    private static final String DATABASE_NAME="student_info";
    private static final int DATABASE_VERSION=1;
    //TABLE NAME
    private static final String NEW_STUDENT= "tablestudent";
    //COLOUMN FOR TABLES
    public static final String KEY_ROWID="id";
    public static final String KEY_FIRST_NAME="firstname";
    public static final String KEY_LAST_NAME="lastname";

    public SQLiteDataBase(Context context) {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(android.database.sqlite.SQLiteDatabase db) {
        String CREATE_STUDENT=" CREATE TABLE " +NEW_STUDENT+ "(" +KEY_ROWID+ " INTEGER PRIMARY KEY AUTOINCREMENT, "+
                KEY_FIRST_NAME+ " TEXT, " +KEY_LAST_NAME+ " TEXT);";
        db.execSQL(CREATE_STUDENT);
        db.close();
    }

    @Override
    public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+NEW_STUDENT);
        onCreate(db);
    }

    public long insertStudent(String firstname, String lastname){
        db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put(KEY_FIRST_NAME,firstname);
        cv.put(KEY_LAST_NAME,lastname);
        return db.insert(NEW_STUDENT,null,cv);
    }

    public String getData() {
        db=this.getReadableDatabase();
        String[] columns=new String[]{KEY_ROWID,KEY_FIRST_NAME,KEY_LAST_NAME};
        Cursor cursor=db.query(NEW_STUDENT,columns,null,null,null,null,null);
        String result="";
        int row= cursor.getColumnIndex(KEY_ROWID);
        int firstname=cursor.getColumnIndex(KEY_FIRST_NAME);
        int lastname=cursor.getColumnIndex(KEY_LAST_NAME);
        for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext())
        {
            result=result + cursor.getString(row) + "\t\t" + cursor.getString(firstname) + "\t" + cursor.getString(lastname) + "\n";

        }
        db.close();
        return result;

    }

    public String searchStudentfirstname(Long l) {
        db=this.getReadableDatabase();

        String[] columns=new String[]{KEY_ROWID,KEY_FIRST_NAME,KEY_LAST_NAME};
        Cursor cursor=db.query(NEW_STUDENT,columns,KEY_ROWID + "="+ l,null,null,null,null);
        if(cursor!=null){
            cursor.moveToFirst();
            String name=cursor.getString(1);
            return name;
        }
        db.close();
        return null;
    }

    public String searchStudentlastname(Long l) {

        db=this.getReadableDatabase();
        String[] columns=new String[]{KEY_ROWID,KEY_FIRST_NAME,KEY_LAST_NAME};
        Cursor cursor=db.query(NEW_STUDENT,columns,KEY_ROWID + "="+ l,null,null,null,null);
        if(cursor!=null){
            cursor.moveToFirst();
            String name2=cursor.getString(2);
            return name2;
        }
        db.close();
        return null;
    }

    public void updateStudent(Long l, String firstname, String lastname) {
        db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(KEY_FIRST_NAME,firstname);
        contentValues.put(KEY_LAST_NAME,lastname);
        db.update(NEW_STUDENT,contentValues, KEY_ROWID + "=" + 1,null);
        db.close();
    }
}
