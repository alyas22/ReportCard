package com.example.android.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.ReportCard);

        ReportCard reportCard = new ReportCard("", 0, 0, 0, 0, 0);

        reportCard.setname("Alya");
        reportCard.setchemistry(90);
        reportCard.setmath(80);
        reportCard.setenglish(90);
        reportCard.setphysics(80);
        reportCard.setbiology(100);

        textView.setText(reportCard.toString());

    }



}
