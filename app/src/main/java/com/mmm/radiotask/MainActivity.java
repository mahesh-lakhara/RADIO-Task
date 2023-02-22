package com.mmm.radiotask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rdoGroup;

    Button btnSumbmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Binding();

        btnSumbmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int  id = rdoGroup.getCheckedRadioButtonId();
                RadioButton rb = findViewById(id);

                Toast.makeText(MainActivity.this, "Gender ="+rb.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void Binding() {
        rdoGroup = findViewById(R.id.rdoGroup);
        btnSumbmit = findViewById(R.id.btnSumbmit);
    }
}