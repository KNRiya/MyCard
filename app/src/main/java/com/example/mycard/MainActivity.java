package com.example.mycard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private CardView hospitalCardView , locationCardview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hospitalCardView= findViewById(R.id.hospitalCardviewId1);
        locationCardview=findViewById(R.id.hospitalCardviewId2);

        hospitalCardView.setOnClickListener(this);

        locationCardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,Location.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.hospitalCardviewId1) {
            Intent intent=new Intent(MainActivity.this,Medicine_List.class);
            startActivity(intent);
        }
    }
}
