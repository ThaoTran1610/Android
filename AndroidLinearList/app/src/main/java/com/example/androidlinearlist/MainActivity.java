package com.example.androidlinearlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] list_name = new String[]{"Nam", "Hoa", "Lan", "Anh"};

        for (int i=0; i < list_name.length; i++)
        {
            TextView textView = new TextView(MainActivity.this);
            textView.setText(list_name[i]);

            Button button = new Button(MainActivity.this);
            button.setText("+");

            LinearLayout linerChild = new LinearLayout(MainActivity.this);
            linerChild.setOrientation(LinearLayout.HORIZONTAL);

            linerChild.addView(textView);
            linerChild.addView(button);

            LinearLayout mainLiner = findViewById(R.id.linerMain);

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    1.0f
            );

            textView.setLayoutParams(params);
            mainLiner.addView(linerChild);

        }
    }
}

