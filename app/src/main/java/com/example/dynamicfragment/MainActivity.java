package com.example.dynamicfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Fragment frag;
    Button btn1, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.b1);
        btn2=(Button)findViewById(R.id.b2);
        onBtnClick();
    }

     void onBtnClick() {
         btn1.setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick(View v) {
                 frag = new Fragment1();
         FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
         ft.replace(R.id.fragment, frag);
         ft.addToBackStack(null);
         ft.commit();
         }});

         btn2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 frag = new Fragment2();
                 FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                 ft.replace(R.id.fragment, frag);
                 ft.addToBackStack(null);
                 ft.commit();
             }
         });
     }
}
