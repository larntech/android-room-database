package net.larntech.roomdatabase;

import android.app.Application;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

public class AnimalViewModel extends AndroidViewModel {

    private AnimalRepository animalRepository;
    private LiveData<List<Animals>> mAllAnimals;

    public AnimalViewModel(@NonNull Application application) {
        super(application);
        animalRepository = new AnimalRepository(application);
        mAllAnimals = animalRepository.getAllAnimal();
    }

    public LiveData<List<Animals>> getmAllAnimals() {
        return mAllAnimals;
    }

    public void insert(Animals animals){
        animalRepository.insertAnimal(animals);
    }
}
