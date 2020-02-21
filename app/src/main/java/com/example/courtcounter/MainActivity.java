package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int a=0, b = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    private View viewObj(String sID){
        int ID = getResources().getIdentifier(sID, "id", getPackageName());
        return findViewById(ID);
    }

    public void points(View view){
        String tag = (String) view.getTag();
        if (tag.length()==1){a=0; b=0;}
        else if (tag.charAt(0) == 'L') a += tag.charAt(1)-'0';
        else if (tag.charAt(0) == 'R') b += tag.charAt(1)-'0';
        display();
    }

    private void display(){
        TextView teamA = (TextView) viewObj("TA");
        TextView teamB = (TextView) viewObj("TB");
        teamA.setText("" + a);
        teamB.setText("" + b);
    }





}
