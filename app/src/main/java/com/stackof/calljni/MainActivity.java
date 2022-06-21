package com.stackof.calljni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    String Tag = "StackOF";
    TextView textview1;
    int c=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview1=(TextView)findViewById(R.id.textView1);
    }
    public void bt1_click(View view){
        c = c+1;
        textview1.setText("click:"+c+"\n"+JniLib.callToCpp());
    }
}