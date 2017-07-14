package com.example.inklocal.tugasbinnar1;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
/**
 * Created by Inklocal on 7/14/2017.
 */

public class Tampil extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil);
        TextView nama = (TextView) findViewById(R.id.tvTampilNama);
        TextView nim = (TextView) findViewById(R.id.tvTampilNIM);
        TextView jurusan = (TextView) findViewById(R.id.tvTampilJurusan);
        TextView alamat = (TextView) findViewById(R.id.tvTampilAlamat);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        TampilData data = (TampilData) bundle.getSerializable("data");
        nama.setText (data.getNama());
        nim.setText(data.getNim());
        jurusan.setText(data.getJurusan());
        alamat.setText(data.getAlamat());
    }
}



