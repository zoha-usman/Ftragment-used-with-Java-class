package com.zohausman.fragment1;

import androidx.fragment.app.FragmentTransaction;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.zohausman.fragment1.Fragments.FristFragment;
import com.zohausman.fragment1.Fragments.SecondFragment;

public class MainActivity extends AppCompatActivity {
    Button btnFirst,btnSecond;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFirst= findViewById(R.id.btnFirst);
        btnSecond= findViewById(R.id.btnSecond);
        linearLayout = findViewById(R.id.linearLayout);


        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FristFragment fristFragment = new FristFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout, fristFragment);
                transaction.commit();

            }
        });

        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondFragment secondFragment = new SecondFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout, secondFragment);
                transaction.commit();
            }
        });
    }
}