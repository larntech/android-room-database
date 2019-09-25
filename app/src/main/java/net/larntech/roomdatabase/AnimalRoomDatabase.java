package net.larntech.roomdatabase;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Animals.class}, version = 1)
public abstract class AnimalRoomDatabase extends RoomDatabase {


    public abstract AnimalDao animalDao();

    private static volatile AnimalRoomDatabase INSTANCE;


    static AnimalRoomDatabase getDatabase(final Context context){



        if(INSTANCE == null){
            synchronized (AnimalRoomDatabase.class){

                if(INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(), AnimalRoomDatabase.class,"animal_db").build();
                }


            }
        }

        return INSTANCE;


    }



}
