package com.example.digitaltasbih;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView liveCount, subhanallah, alhamdulillah, la_ilaha_ilallah, subhanallahDigit, alhamdulillahDigit, la_ilaha_ilallahDigit;
    Button tasbihCount, resetTasbih, leave;

    int countSubhanallah = 0;
    int countAlhamdulillah = 0;
    int countLa_ilaha_ilallah = 0;
    int countTotal = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        liveCount = findViewById(R.id.liveCount);
        subhanallah = findViewById(R.id.subhanallah);
        alhamdulillah = findViewById(R.id.alhamdulillah);
        la_ilaha_ilallah = findViewById(R.id.la_ilaha_ilallah);

        subhanallahDigit = findViewById(R.id.subhanallahDigit);
        alhamdulillahDigit = findViewById(R.id.alhamdulillahDigit);
        la_ilaha_ilallahDigit = findViewById(R.id.la_ilaha_ilallahDigit);

        tasbihCount = findViewById(R.id.tasbihCount);
        resetTasbih = findViewById(R.id.resetTasbih);
        leave = findViewById(R.id.leave);


        tasbihCount.setEnabled(false);


        subhanallah.setOnClickListener(this);
        alhamdulillah.setOnClickListener(this);
        la_ilaha_ilallah.setOnClickListener(this);

        subhanallahDigit.setOnClickListener(this);
        alhamdulillahDigit.setOnClickListener(this);
        la_ilaha_ilallahDigit.setOnClickListener(this);

        tasbihCount.setOnClickListener(this);
        resetTasbih.setOnClickListener(this);
        leave.setOnClickListener(this);
        liveCount.setOnClickListener(this);


    }


    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.subhanallah) {

            liveCount.setText(""+0);
            tasbihCount.setEnabled(true);
            tasbihCount.setText("Subhanallah");

            tasbihCount.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    int subhanallahDgt = Integer.parseInt(subhanallahDigit.getText().toString());
                    subhanallahDgt++;
                    subhanallahDigit.setText("" + subhanallahDgt);


                    int newSubhanallah = Integer.parseInt(liveCount.getText().toString());

                    newSubhanallah++;
                    liveCount.setText(String.valueOf(newSubhanallah));


                }
            });


        } else if (v.getId() == R.id.alhamdulillah) {

            liveCount.setText(""+0);
            tasbihCount.setEnabled(true);
            tasbihCount.setText("Alhamdulillah");


            tasbihCount.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    int alhamdulillahDgt = Integer.parseInt(alhamdulillahDigit.getText().toString());
                    alhamdulillahDgt++;
                    alhamdulillahDigit.setText("" + alhamdulillahDgt);

                    int newAlhamdulillah = Integer.parseInt(liveCount.getText().toString());

                    newAlhamdulillah++;
                    liveCount.setText(String.valueOf(newAlhamdulillah));



                }
            });

        } else if (v.getId() == R.id.la_ilaha_ilallah) {

            liveCount.setText(""+0);
            tasbihCount.setEnabled(true);
            tasbihCount.setText("La ilaha ilallah");

            tasbihCount.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    int la_ilaha_ilallahDgt = Integer.parseInt(la_ilaha_ilallahDigit.getText().toString());
                    la_ilaha_ilallahDgt++;
                    la_ilaha_ilallahDigit.setText("" + la_ilaha_ilallahDgt);

                    int newLa_ilaha_ilallah = Integer.parseInt(liveCount.getText().toString());

                    newLa_ilaha_ilallah++;
                    liveCount.setText(String.valueOf(newLa_ilaha_ilallah));

                }
            });

        }


    }

}
