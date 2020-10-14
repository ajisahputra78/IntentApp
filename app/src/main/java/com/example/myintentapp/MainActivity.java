package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        Button btnMoveWithDataActivity = findViewById(R.id.btn_move_activity_data);
        btnMoveWithDataActivity.setOnClickListener(this);

        Button btnDialphone = findViewById(R.id.btn_dial_number);
        btnDialphone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;

            case R.id.btn_move_activity_data:
                Intent moveWithDataIntent = new Intent(MainActivity.this, MoveWithData.class);
                moveWithDataIntent.putExtra(MoveWithData.EXTRA_NAME, "Aji Sahputra");
                moveWithDataIntent.putExtra(MoveWithData.EXTRA_AGE, 19);
                startActivity(moveWithDataIntent);
                break;

            case R.id.btn_dial_number:
                String phoneNumber = "+6281234567890";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
                break;
            }

        }

}