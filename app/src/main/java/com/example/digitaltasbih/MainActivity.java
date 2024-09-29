package com.example.digitaltasbih;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView liveCount, subhanallah, alhamdulillah, la_ilaha_ilallah, subhanallahDigit, alhamdulillahDigit, la_ilaha_ilallahDigit, totalTasbih;
    Button tasbihCount, resetTasbih; //leave;

    int subhanallahDgt = 0;
    int alhamdulillahDgt = 0;
    int la_ilaha_ilallahDgt = 0;
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

        totalTasbih = findViewById(R.id.totalTasbih);

        tasbihCount = findViewById(R.id.tasbihCount);
        resetTasbih = findViewById(R.id.resetTasbih);
        //leave = findViewById(R.id.leave);


        tasbihCount.setEnabled(false);
        resetTasbih.setVisibility(View.GONE);


        subhanallah.setOnClickListener(this);
        alhamdulillah.setOnClickListener(this);
        la_ilaha_ilallah.setOnClickListener(this);

        subhanallahDigit.setOnClickListener(this);
        alhamdulillahDigit.setOnClickListener(this);
        la_ilaha_ilallahDigit.setOnClickListener(this);

        totalTasbih.setOnClickListener(this);

        tasbihCount.setOnClickListener(this);
        resetTasbih.setOnClickListener(this);
        //leave.setOnClickListener(this);
        liveCount.setOnClickListener(this);


    }


    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.subhanallah) {

            subhanallah.setTextColor(getResources().getColor(R.color.deep_sky_blue));
            subhanallahDigit.setTextColor(getResources().getColor(R.color.deep_sky_blue));

            alhamdulillah.setTextColor(getResources().getColor(R.color.white));
            alhamdulillahDigit.setTextColor(getResources().getColor(R.color.white));
            la_ilaha_ilallah.setTextColor(getResources().getColor(R.color.white));
            la_ilaha_ilallahDigit.setTextColor(getResources().getColor(R.color.white));

            Toast.makeText(this, "Button Subhanallah has selected!", Toast.LENGTH_SHORT).show();
            liveCount.setText("" + 0);
            tasbihCount.setEnabled(true);
            tasbihCount.setText("Subhanallah");

            tasbihCount.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    subhanallahDgt = Integer.parseInt(subhanallahDigit.getText().toString());
                    subhanallahDgt++;
                    subhanallahDigit.setText("" + subhanallahDgt);


                    int newSubhanallah = Integer.parseInt(liveCount.getText().toString());

                    newSubhanallah++;
                    liveCount.setText(String.valueOf(newSubhanallah));

                    countTotal++;
                    totalTasbih.setText("Total Tasbih : " + countTotal);

                    resetTasbih.setVisibility(View.VISIBLE);


                }
            });


        } else if (v.getId() == R.id.alhamdulillah) {

            alhamdulillah.setTextColor(getResources().getColor(R.color.deep_sky_blue));
            alhamdulillahDigit.setTextColor(getResources().getColor(R.color.deep_sky_blue));

            subhanallah.setTextColor(getResources().getColor(R.color.white));
            subhanallahDigit.setTextColor(getResources().getColor(R.color.white));
            la_ilaha_ilallah.setTextColor(getResources().getColor(R.color.white));
            la_ilaha_ilallahDigit.setTextColor(getResources().getColor(R.color.white));

            Toast.makeText(this, "Button Alhamdulillah has selected!", Toast.LENGTH_SHORT).show();
            liveCount.setText("" + 0);
            tasbihCount.setEnabled(true);
            tasbihCount.setText("Alhamdulillah");


            tasbihCount.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    alhamdulillahDgt = Integer.parseInt(alhamdulillahDigit.getText().toString());
                    alhamdulillahDgt++;
                    alhamdulillahDigit.setText("" + alhamdulillahDgt);

                    int newAlhamdulillah = Integer.parseInt(liveCount.getText().toString());

                    newAlhamdulillah++;
                    liveCount.setText(String.valueOf(newAlhamdulillah));

                    countTotal++;
                    totalTasbih.setText("Total Tasbih : " + countTotal);

                    resetTasbih.setVisibility(View.VISIBLE);


                }
            });

        } else if (v.getId() == R.id.la_ilaha_ilallah) {

            la_ilaha_ilallah.setTextColor(getResources().getColor(R.color.deep_sky_blue));
            la_ilaha_ilallahDigit.setTextColor(getResources().getColor(R.color.deep_sky_blue));

            subhanallah.setTextColor(getResources().getColor(R.color.white));
            subhanallahDigit.setTextColor(getResources().getColor(R.color.white));
            alhamdulillah.setTextColor(getResources().getColor(R.color.white));
            alhamdulillahDigit.setTextColor(getResources().getColor(R.color.white));

            Toast.makeText(this, "Button La ilaha ilallah has selected!", Toast.LENGTH_SHORT).show();
            liveCount.setText("" + 0);
            tasbihCount.setEnabled(true);
            tasbihCount.setText("La ilaha ilallah");

            tasbihCount.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    la_ilaha_ilallahDgt = Integer.parseInt(la_ilaha_ilallahDigit.getText().toString());
                    la_ilaha_ilallahDgt++;
                    la_ilaha_ilallahDigit.setText("" + la_ilaha_ilallahDgt);

                    int newLa_ilaha_ilallah = Integer.parseInt(liveCount.getText().toString());

                    newLa_ilaha_ilallah++;
                    liveCount.setText(String.valueOf(newLa_ilaha_ilallah));


                    countTotal++;
                    totalTasbih.setText("Total Tasbih : " + countTotal);

                    resetTasbih.setVisibility(View.VISIBLE);

                }
            });

        }

        resetTasbih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                subhanallah.setTextColor(getResources().getColor(R.color.white));
                subhanallahDigit.setTextColor(getResources().getColor(R.color.white));

                alhamdulillah.setTextColor(getResources().getColor(R.color.white));
                alhamdulillahDigit.setTextColor(getResources().getColor(R.color.white));

                la_ilaha_ilallah.setTextColor(getResources().getColor(R.color.white));
                la_ilaha_ilallahDigit.setTextColor(getResources().getColor(R.color.white));

                liveCount.setText("" + 0);
                subhanallahDigit.setText("" + 0);
                alhamdulillahDigit.setText("" + 0);
                la_ilaha_ilallahDigit.setText("" + 0);

                countTotal = 0;

                totalTasbih.setText("Total Tasbih: " + countTotal);
                tasbihCount.setText("Select Tasbih");
                resetTasbih.setVisibility(View.GONE);
                tasbihCount.setEnabled(false);


                Toast.makeText(MainActivity.this, "Yore Tasbih has been reset", Toast.LENGTH_SHORT).show();

            }
        });


        //=============================================================


    }

}
