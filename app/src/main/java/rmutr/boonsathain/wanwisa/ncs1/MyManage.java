package rmutr.boonsathain.wanwisa.ncs1;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by masterUNG on 4/14/16 AD.
 */
public class MyManage {

    //Explicit
    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase sqLiteDatabase;

    public static final String user_table = "userTABLE";
    public static final String column_id = "_id";
    public static final String column_User = "User";
    public static final String column_Pass = "Password";
    public static final String column_Status = "Status";
    public static final String column_Name = "Name";
    public static final String column_Surname = "Surname";

    public static final String boat_table = "boatTABLE";
    public static final String column_data2 = "data2";
    public static final String column_data3 = "data3";
    public static final String column_data4 = "data4";
    public static final String column_data5 = "data5";
    public static final String column_data6 = "data6";
    public static final String column_data7 = "data7";
    public static final String column_data8 = "data8";
    public static final String column_data9 = "data9";
    public static final String column_data10 = "data10";
    public static final String column_data11 = "data11";
    public static final String column_data12 = "data12";
    public static final String column_data13 = "data13";
    public static final String column_data14 = "data14";
    public static final String column_data15 = "data15";
    public static final String column_data16 = "data16";

    public MyManage(Context context) {

        myOpenHelper = new MyOpenHelper(context);
        sqLiteDatabase = myOpenHelper.getWritableDatabase();

    }   //Constructor


    public long addNewBoat(String data2,
                           String data3,
                           String data4,
                           String data5,
                           String data6,
                           String data7,
                           String data8,
                           String data9,
                           String data10,
                           String data11,
                           String data12,
                           String data13,
                           String data14,
                           String data15,
                           String data16
    ) {

        ContentValues contentValues = new ContentValues();
        contentValues.put(column_data2, data2);
        contentValues.put(column_data3, data3);
        contentValues.put(column_data4, data4);
        contentValues.put(column_data5, data5);
        contentValues.put(column_data6, data6);
        contentValues.put(column_data7, data7);
        contentValues.put(column_data8, data8);
        contentValues.put(column_data9, data9);
        contentValues.put(column_data10, data10);
        contentValues.put(column_data11, data11);
        contentValues.put(column_data12, data12);
        contentValues.put(column_data13, data13);
        contentValues.put(column_data14, data14);
        contentValues.put(column_data15, data15);
        contentValues.put(column_data16, data16);


        return sqLiteDatabase.insert(boat_table, null, contentValues);
    }

    public long addNewUser(String strUser,
                           String strPassword,
                           String strStatus,
                           String strName,
                           String strSurname) {

        ContentValues contentValues = new ContentValues();
        contentValues.put(column_User, strUser);
        contentValues.put(column_Pass, strPassword);
        contentValues.put(column_Status, strStatus);
        contentValues.put(column_Name, strName);
        contentValues.put(column_Surname, strSurname);

        return sqLiteDatabase.insert(user_table, null, contentValues);
    }


}   // Main Class
