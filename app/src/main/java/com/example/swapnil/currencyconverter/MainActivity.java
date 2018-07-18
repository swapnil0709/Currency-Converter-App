package com.example.swapnil.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        EditText editText =(EditText)findViewById(R.id.ediText);
        String AmountInDollars = editText.getText().toString();
        Double dollars = Double.parseDouble(AmountInDollars);
        Double rupee = dollars*50.09;
        String AmountInRupees = String.format("%.2f",rupee);
        Toast.makeText(this, AmountInDollars +" Dollars is: Rs " + AmountInRupees , Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
