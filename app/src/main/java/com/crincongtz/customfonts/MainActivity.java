package com.crincongtz.customfonts;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView3 = findViewById(R.id.three);
        TextView textView8 = findViewById(R.id.eight);
        Typeface typeface3, typeface8;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            typeface3 = getResources().getFont(R.font.arial_bold_italic);
            typeface8 = getResources().getFont(R.font.encorpada_extra_light);
        } else {
            typeface3 = ResourcesCompat.getFont(this, R.font.arial_bold_italic);
            typeface8 = ResourcesCompat.getFont(this, R.font.encorpada_extra_light);
        }

        textView3.setTypeface(typeface3);
        textView8.setTypeface(typeface8);
    }
}
