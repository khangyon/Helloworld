package com.example.taruc.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName, editTextAge;
    private TextView textViewMessage;

    //onCreate = main() function
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView method displays the UI
        //R = resource class
        setContentView(R.layout.activity_main);

        //Linking program with UI
        editTextName = (EditText)findViewById(R.id.editTextName);
        editTextAge = (EditText)findViewById(R.id.editTextAge);
        textViewMessage = (TextView)findViewById(R.id.textViewMessage);
    }
    public void displayMessage(View view){
        String name;
        int age;
        age = Integer.parseInt(editTextAge.getText().toString());
        name = editTextName.getText().toString();
        textViewMessage.setText("Hi" + name + ". You will be" + age + "years old in 2018");
    }
    public void resetMessage(View view){
        editTextName.setText("Name");
        editTextAge.setText("Age");
        textViewMessage.setText("Hello World!");
    }
}
