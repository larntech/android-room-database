package net.larntech.roomdatabase;

import android.app.Application;
import android.content.Context;
import android.os.AsyncTask;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Room;

public class AnimalRepository {

    private AnimalDao animalDao;
    private LiveData<List<Animals>> mAllAnimals;
    AnimalRoomDatabase db;

    AnimalRepository(Application context) {

        db = AnimalRoomDatabase.getDatabase(context);
        animalDao = db.animalDao();
        mAllAnimals = animalDao.getAllAnimals();

    }

//    //get all animals
    public LiveData<List<Animals>> getAllAnimal() {
        return mAllAnimals;
    }

//    //insert animal
    public void insertAnimal(final Animals animals) {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
               db.animalDao().insertAnimal(animals);

                return null;
            }

        }.execute();
    }


//
//
//    //delete animal
//    public void deleteAnimal(final Animals animals) {
//
//        new AsyncTask<Void, Void, Void>() {
//            @Override
//            protected Void doInBackground(Void... voids) {
//                animalRoomDatabase.animalDao().deleteAnimal(animals);
//                return null;
//            }
//        }.execute();
//
//    }
//
//    //update animal record
//    public void updateAnimal(final Animals animals) {
//
//        new AsyncTask<Void, Void, Void>() {
//            @Override
//            protected Void doInBackground(Void... voids) {
//                animalRoomDatabase.animalDao().updateAnimal(animals);
//                return null;
//            }
//        }.execute();
//    }
//
//
//




}
