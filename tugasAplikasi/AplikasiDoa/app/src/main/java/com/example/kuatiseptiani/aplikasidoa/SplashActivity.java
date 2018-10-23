package com.example.kuatiseptiani.aplikasidoa;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by kuatiseptiani on 23/10/18.
 */

public class SplashActivity extends AppCompatActivity {
    private static final int TIGA_DETIK = 3000; //satuannya milisecon

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        countDown();
    }

    private void countDown() {
        Handler handler = new Handler(); //untuk delay

        Runnable menunggu = new Runnable() { //aksi setelah dia menunggu
            @Override
            public void run() {
                gotoMain(); //method yg akan dipanggil setelah menunggu
            }
        };
        handler.postDelayed(menunggu, TIGA_DETIK); //runnable + satuan waktu
    }

    private void gotoMain() {
        Intent intenMain = new Intent(this, MainActivity.class);
        startActivity(intenMain);
        finish();
    }
}
