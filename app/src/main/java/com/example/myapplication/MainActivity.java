package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private TextView TextView;
    private Spinner Spnbooks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        TextView = findViewById(R.id.textView);
        Spnbooks = findViewById(R.id.Spnbooks);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cat = Spnbooks.getSelectedItem().toString();
                DataBase db = new DataBase();
                List<Book> result = db.getBooks(cat);
                String str  = "";
                for(Book b:result){
                    str +=b.getTitle();
                }
                TextView.setText(str);


            }
        });
    }
}