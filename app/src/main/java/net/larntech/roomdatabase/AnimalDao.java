package net.larntech.roomdatabase;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface AnimalDao {


    @Insert
    void insertAnimal(Animals animals);

    @Update
    void updateAnimal(Animals animals);

    @Delete
    void deleteAnimal(Animals animals);

    @Query("SELECT * from animals")
    LiveData<List<Animals>> getAllAnimals();

}
