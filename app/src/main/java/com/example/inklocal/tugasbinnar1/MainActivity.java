package com.example.inklocal.tugasbinnar1;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button tambah = (Button) findViewById(R.id.btnTampilSatu);
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText Nama = (EditText) findViewById(R.id.etNama);
                EditText NIM = (EditText) findViewById(R.id.etNIM);
                EditText Jurusan = (EditText) findViewById(R.id.etJurusan);
                EditText Alamat = (EditText) findViewById(R.id.etAlamat);

                boolean NamaKosong = Nama.length() == 0;
                boolean NIMKosong = NIM.length() == 0;
                boolean JurusanKosong = Jurusan.length() == 0;
                boolean AlamatKosong = Alamat.length() == 0;

                if (NamaKosong || NIMKosong || JurusanKosong || AlamatKosong) {
                    Toast.makeText(MainActivity.this, "Di isi Dong!!", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, Tampil.class);
                    TampilData Tampil = new TampilData(Nama.getText().toString(), NIM.getText().toString(), Jurusan.getText().toString(), Alamat.getText().toString());
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("data", Tampil);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            }
        });
    }
}


