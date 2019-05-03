package com.example.intent_explicitintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class GetDataActivity extends AppCompatActivity {


    private Toolbar toolbar;
    private TextView firstName,lastName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_data);

        toolbar = (Toolbar) findViewById(R.id.toolBarTitle_getdata);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.toolbar_getdata);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_arrow_back_black_24dp));

        firstName = findViewById(R.id.textview_description_first);
        lastName = findViewById(R.id.textview_description_last);

        Bundle bundle = getIntent().getExtras();

        String fName = bundle.getString("FirstName");
        String lName = bundle.getString("LastName");


        firstName.setText(fName);
        lastName.setText(lName);

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
