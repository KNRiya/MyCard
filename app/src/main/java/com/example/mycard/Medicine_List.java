package com.example.mycard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Medicine_List extends AppCompatActivity {
private Button SaveData,LoadData;
private EditText MedicineName, AlarmTimes;
DatabaseReference dbRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine__list);
        dbRef= FirebaseDatabase.getInstance().getReference();
        MedicineName=findViewById(R.id.EtMedicineId);
        AlarmTimes=findViewById(R.id.EtTimesId);
        SaveData=findViewById(R.id.buttonSaveId);
        LoadData=findViewById(R.id.buttonLoadId);

        LoadData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        SaveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SaveData();
            }


        });

    }
    private void SaveData() {
        String Medicine=MedicineName.getText().toString().trim();
        String Times=AlarmTimes.getText().toString().trim();
        String key=dbRef.push().getKey();
        Medicine medicine=new Medicine(Medicine,Times);
        dbRef.child(key).setValue(medicine);
        Toast.makeText(getApplicationContext(),"Info added",Toast.LENGTH_LONG).show();
        MedicineName.setText("");
        AlarmTimes.setText("");
    }
}