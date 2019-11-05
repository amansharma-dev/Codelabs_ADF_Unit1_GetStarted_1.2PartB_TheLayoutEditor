package com.example.codelabs_adf_unit1_getstarted_12partb_thelayouteditor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static int mCount = 0;
    private TextView textView_countUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_countUp = findViewById(R.id.show_count);

    }

    public void countUp(View view){
        mCount++;
        if(textView_countUp!=null){
            textView_countUp.setText(Integer.toString(mCount));
        }
    }

    public void toastMessage(View view){
        Toast.makeText(getApplicationContext(),R.string.text_helloToast,Toast.LENGTH_SHORT).show();
    }
}
