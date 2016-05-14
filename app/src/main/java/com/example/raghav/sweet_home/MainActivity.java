package com.example.raghav.sweet_home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;


public class MainActivity extends AppCompatActivity {

    Button button2;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Firebase myFirebaseRef = new Firebase("https://android-home.firebaseio.com/");
            myFirebaseRef.child("message").setValue("Do you have data? You'll love Firebase.");
            myFirebaseRef.child("message").addValueEventListener(new ValueEventListener() {

                @Override
                public void onDataChange(DataSnapshot snapshot) {
                    System.out.println(snapshot.getValue());  //prints "Do you have data? You'll love Firebase."
                }

                @Override public void onCancelled(FirebaseError error) { }

            });
            button2Click();
        }
    public void button2Click(){
        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.raghav.sweet_home.Register.class");
                        startActivity(intent);

                    }
                }
        );


    }

}



