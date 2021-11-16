package mx.edu.tesoem.isc.daetarea5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new intent ( MainActivity .this , 1.class);
                startActivity(Intent);
                finish();
            }
        }, delayMillis : 5000)


    }