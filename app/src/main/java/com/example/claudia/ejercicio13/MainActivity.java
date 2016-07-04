package com.example.claudia.ejercicio13;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
        SharedPreferences preferences=getSharedPreferences("datos", Context.MODE_PRIVATE);
        et1.setText(preferences.getString("mail",""));
    }

    public  void ejecutar(View view){
        SharedPreferences preferences=getSharedPreferences("datos",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=preferences.edit();
        editor.putString("mail",et1.getText().toString());
        editor.commit();
        finish();
    }
}
