package dominando.android.hotel.repository.sqlite

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class HotelSqlHelper (contex: Context) :
    SQLiteOpenHelper(contex, DATABASE_NAME, null, DATABASE_VERSION){

    override fun onCreate(sqLiteDatabase: SQLiteDatabase) {
        sqLiteDatabase.execSQL(
            "CREATE TABLE $TABLE_HOTEL ("+
                    "$COLUMN_ID INTEGER PRIMARY KEY AUTOINCREMENT, "+
                    "$COLUMN_NAME TEXT NOT NULL, "+
                    "$COLUMN_ADDRESS TEXT "+
                    "$COLUMN_RATING REAL"
        )
    }

    override fun onUpgrade(sqLiteDatabase: SQLiteDatabase,
                           oldVersion: Int, newVerion: Int) {
        TODO("Not yet implemented")
    }
}