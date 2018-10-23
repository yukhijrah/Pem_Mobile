package com.example.kuatiseptiani.aplikasidoa;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by kuatiseptiani on 23/10/18.
 */

public class DetailActivity extends AppCompatActivity {

    TextView txtDetailJudul, txtDetailAyat, txtDetailArti;

    @Override
    protected void onCreate(@Nullable Bundle savedInstancesState) {
        super.onCreate(savedInstancesState);
        setContentView(R.layout.activity_detail);

        txtDetailJudul = (TextView) findViewById(R.id.txt_detail_judul);
        txtDetailAyat = (TextView) findViewById(R.id.txt_detail_ayat);
        txtDetailArti = (TextView) findViewById(R.id.txt_detail_arti);

        getData();
    }

    private void getData() {
        txtDetailJudul.setText(getIntent().getStringExtra("id_judul"));
        txtDetailAyat.setText(getIntent().getStringExtra("id_ayat"));
        txtDetailArti.setText(getIntent().getStringExtra("id_arti"));
    }
}
