package com.example.intent_explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private EditText firstName,lastName;
    private Button senddata;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolBarTitle_explicitintent);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.toolbar_intentexplicitintent);


        firstName = findViewById(R.id.edittext_firstname);
        lastName = findViewById(R.id.edittext_lastname);
        senddata = findViewById(R.id.senddata_btn);

        senddata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendDataToNextActivity();
            }
        });
    }

    private void sendDataToNextActivity(){

        String fname = firstName.getText().toString();
        String lname = lastName.getText().toString();

        if(!fname.isEmpty() && !lname.isEmpty()){
        Bundle bundle = new Bundle();
        bundle.putString("FirstName",fname);
        bundle.putString("LastName",lname);

        Intent intent = new Intent(MainActivity.this,GetDataActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
        }
        else{
            Toast.makeText(getApplicationContext(),"Enter First & Last Name",Toast.LENGTH_SHORT).show();
        }
    }

}
