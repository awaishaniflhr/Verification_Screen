package com.example.verification_screen_01;

import androidx.appcompat.app.AppCompatActivity;
import com.hbb20.CountryCodePicker;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CountryCodePicker ccp;
    private TextView phonetextview;
    private Button sendbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendbtn = (Button) findViewById(R.id.btnSend);
        sendbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });

        initializeViews();
//        listeners();
    }
    public void openActivity2(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    private void initializeViews(){
        ccp = (CountryCodePicker) findViewById(R.id.ccp);
        phonetextview = (EditText) findViewById(R.id.editTextPhone);
        sendbtn = (Button) findViewById(R.id.btnSend);
    }
//    private  void listeners(){
//        sendbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //get Variables
//                String code = ccp.getSelectedCountryCode();
//                String country = ccp.getSelectedCountryEnglishName();
//                String number = ccp.getTextView_selectedCountry().getText().toString();
//
//
//                //Create Toast  String number = ccp.phonetextview.getText().toString();
//                Context context = getApplicationContext();
//                CharSequence text = "Country : "+ country + ", Value Sent: "+ code+" " + number;
//                int duration = Toast.LENGTH_SHORT;
//                Toast toast = Toast.makeText(context, text, duration);
//                toast.show();
//            }
//        });
//    }

}