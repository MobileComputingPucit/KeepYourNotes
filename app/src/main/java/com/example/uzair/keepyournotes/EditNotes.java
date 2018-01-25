package com.example.uzair.keepyournotes;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.util.HashSet;

public class EditNotes extends AppCompatActivity {
    boolean note;
    String id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_notes);
        Intent intent = getIntent();

        Mydatabase mybase;
        note = intent.getBooleanExtra("notes",false);
        mybase = new Mydatabase(getParent(), null, null, 1);

        EditText editText = (EditText) findViewById(R.id.editText);
        if (!note){

        }
        else{

        }

    }
}
