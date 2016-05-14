package com.example.raghav.sweet_home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity implements View.OnClickListener

{

    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);


    }
    public void button2Click(){
        startActivity(new Intent("android.intent.action.register"));

    }
    public void onClick(View v){
        switch(v.getId())
        {
            case R.id.button2:
                button2Click();
                break;
        }

    }
}
