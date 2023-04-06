package com.example.a0406f;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout LL1, LL2, LL3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LL1 = (LinearLayout) findViewById(R.id.color1);
        LL2 = (LinearLayout) findViewById(R.id.color2);
        LL3 = (LinearLayout) findViewById(R.id.color3);
    }

    public void onClick(LinearLayout linearLayout){
        LL1.setVisibility(LinearLayout.VISIBLE);
        LL2.setVisibility(LinearLayout.VISIBLE);
        LL3.setVisibility(LinearLayout.VISIBLE);
        switch (LinearLayout.generateViewId()) {

        }
    }
}