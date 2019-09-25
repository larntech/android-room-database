package net.larntech.roomdatabase;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import static android.app.Activity.RESULT_CANCELED;
import static android.app.Activity.RESULT_OK;

public class InsertAnimal extends BottomSheetDialogFragment {

    public static final String EXTRA_REPLY = "com.example.android.animalsql.REPLY";


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.insert_animal,container,false);

        final EditText edName = view.findViewById(R.id.insertAnimal);
        Button btnAdd = view.findViewById(R.id.btnInsertAnimal);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent replyIntent = new Intent();
                if (TextUtils.isEmpty(edName.getText())) {
                    getActivity().setResult(RESULT_CANCELED, replyIntent);
                } else {
                    String word = edName.getText().toString();
                    replyIntent.putExtra(EXTRA_REPLY, word);
                    getActivity().setResult(RESULT_OK, replyIntent);
                }

            }
        });



        return view;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }



}
