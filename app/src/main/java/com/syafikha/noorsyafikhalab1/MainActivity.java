package com.syafikha.noorsyafikhalab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button buttonDisplay;
    private TextView txtMsg;
    private EditText edtName;
    private Button buttonReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonDisplay=(Button) findViewById(R.id.btnDisplay);
        txtMsg=(TextView) findViewById(R.id.textView);
        edtName=(EditText) findViewById(R.id.editText);
        buttonReset=(Button) findViewById(R.id.btnReset);
    }
    public void displayText(View view)
    {
        String text=edtName.getText().toString();
        txtMsg.setText("Welcome "+ text);
        Toast toast=Toast.makeText(this, "Welcome "+text, Toast.LENGTH_SHORT);
        toast.show();

    }
    public void displayText1(View view1)
    {
        edtName.getText().clear();
        txtMsg.setText("Welcome");
        Toast toast1=Toast.makeText(this, "Name have been reset", Toast.LENGTH_SHORT);
        toast1.show();
    }

}
