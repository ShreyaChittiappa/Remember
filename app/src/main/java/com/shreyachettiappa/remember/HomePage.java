package com.shreyachettiappa.remember;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomePage extends AppCompatActivity {


    // TODO: Add member variables here:
    // UI references.
    EditText mPasswordView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

}

    public void uploadPhoto(View v) {
        Intent intent = new Intent(this, com.shreyachettiappa.remember.UploadPhoto.class);
        finish();
        startActivity(intent);


    }
    public void search(View v) {
        Intent intent = new Intent(this, com.shreyachettiappa.remember.Search.class);
        finish();
        startActivity(intent);
    }
    public void gallery(View v) {
        Intent intent = new Intent(this, com.shreyachettiappa.remember.Gallery.class);
        finish();
        startActivity(intent);
    }
    }
