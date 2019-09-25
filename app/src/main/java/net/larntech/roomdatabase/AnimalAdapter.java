package net.larntech.roomdatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder> {


    private LayoutInflater inflater;
    private List<Animals> animalsList;

    public AnimalAdapter(Context context) {
        inflater = LayoutInflater.from(context);
    }



    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view = inflater.inflate(R.layout.recyclerview_items,parent,false);

      return new AnimalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {

        if(animalsList !=null){
            Animals animals = animalsList.get(position);

            holder.animalName.setText(animals.getName());
        }else{
            holder.animalName.setText("no data");
        }


    }

    void setData(List<Animals> animals){

        animalsList = animals;
        notifyDataSetChanged();

    }

    @Override
    public int getItemCount() {
      if(animalsList !=null)
          return animalsList.size();
      else
          return 0;

    }

    public class AnimalViewHolder extends RecyclerView.ViewHolder {

        private TextView animalName;
        public AnimalViewHolder(@NonNull View itemView) {
            super(itemView);

            animalName = itemView.findViewById(R.id.animalName);

        }
    }
}
