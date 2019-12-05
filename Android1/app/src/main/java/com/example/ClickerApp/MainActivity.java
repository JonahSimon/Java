package com.example.ClickerApp;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv_Clicks;
    TextView tv_Up1;
    TextView tv_Up2;
    Button b_Up1;
    Button b_Up2;
    Button b_clicks;
    //EditText txtInput;
    CountDownTimer timer;


    int clicks = 0;
    int ClicksPer = 1;
    int AutoClicks = 0;
    int Up1Cost = 100;
    int Up2Cost = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv_Clicks = findViewById(R.id.Clicks);
        //tv_Clicks.setText(FileHelper.ReadFile(MainActivity.this));
        tv_Up1 = findViewById(R.id.Upgrade1Cost);
        tv_Up2 = findViewById(R.id.Upgrade2Cost);

        b_clicks = findViewById(R.id.b_clicks);
        b_Up1 = findViewById(R.id.Upgrade1);
        b_Up2 = findViewById(R.id.Upgrade2);

        tv_Clicks.setText("Clicks: " + clicks);
        tv_Up1.setText("Cost: " + Up1Cost);
        tv_Up2.setText("Cost: " + Up2Cost);

        //timer.start();

        b_clicks.setEnabled(true);
        b_Up1.setEnabled(false);
        b_Up2.setEnabled(false);

        timer = new CountDownTimer(1000000000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                clicks += AutoClicks;
                tv_Clicks.setText("Clicks: " + clicks);
            }

            @Override
            public void onFinish() {
                timer.start();
            }
        };

        timer.start();

        b_clicks.setOnClickListener(new View.OnClickListener() {
           @SuppressLint("WrongViewCast")
           @Override
            public void onClick(View v) {
                clicks += ClicksPer;
                tv_Clicks.setText("Clicks: " + clicks);

                if(clicks == Up1Cost || clicks > Up1Cost){
                    b_Up1.setEnabled(true);
                }
                else
                    b_Up1.setEnabled(false);

                if(clicks == Up2Cost || clicks > Up2Cost){
                    b_Up2.setEnabled(true);
                }
                else
                    b_Up2.setEnabled(false);

                //txtInput = findViewById(R.id.Clicks);
                //FileHelper.saveToFile( txtInput.getText().toString());
            }
        });

        b_Up1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicks = clicks - Up1Cost;
                tv_Clicks.setText("Clicks: " + clicks);
                ClicksPer++;
                Up1Cost = Up1Cost * 2;
                tv_Up1.setText("Cost: " + Up1Cost);
                if(clicks == Up1Cost || clicks > Up1Cost){
                    b_Up1.setEnabled(true);
                }
                else
                    b_Up1.setEnabled(false);

                if(clicks == Up2Cost || clicks > Up2Cost){
                    b_Up2.setEnabled(true);
                }
                else
                    b_Up2.setEnabled(false);
            }
        });

        b_Up2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicks = clicks - Up2Cost;
                tv_Clicks.setText("Clicks: " + clicks);
                AutoClicks++;
                Up2Cost = Up2Cost * 2;
                tv_Up2.setText("Cost: " + Up2Cost);

                if(clicks == Up2Cost || clicks > Up2Cost){
                    b_Up2.setEnabled(true);
                }
                else
                    b_Up2.setEnabled(false);

                if(clicks == Up1Cost || clicks > Up1Cost){
                    b_Up1.setEnabled(true);
                }
                else
                    b_Up1.setEnabled(false);
            }
        });

    }
}
