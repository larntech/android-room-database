package net.larntech.roomdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InsertActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY = "com.example.android.animalsql.REPLY";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        final EditText edName = findViewById(R.id.insertAnimal);
        Button btnAdd = findViewById(R.id.btnInsertAnimal);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent replyIntent = new Intent();
                if (TextUtils.isEmpty(edName.getText())) {
                    setResult(RESULT_CANCELED, replyIntent);
                } else {
                    String word = edName.getText().toString();
                    replyIntent.putExtra(EXTRA_REPLY, word);
                    setResult(RESULT_OK, replyIntent);
                }

                finish();


            }
        });



    }
}
