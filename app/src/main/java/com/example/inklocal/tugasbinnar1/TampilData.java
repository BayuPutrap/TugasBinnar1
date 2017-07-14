package com.example.inklocal.tugasbinnar1;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Inklocal on 7/14/2017.
 */

public class TampilData implements Serializable {
    private String nama;
    private String nim;
    private String jurusan;
    private String alamat;


    public TampilData(String nama, String nim, String jurusan, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }


    public String getNama() {

        return nama;
    }

    public void setNama(String nama) {

        this.nama = nama;
    }

    public String getNim() {

        return nim;
    }

    public void setNIM(String nim) {

        this.nim = nim;
    }
    public String getJurusan() {

        return jurusan;
    }

    public void setJurusan(String jurusan) {

        this.jurusan = jurusan;
    }

    public String getAlamat() {

        return jurusan;
    }

    public void setAlamat(String alamat) {

        this.alamat = alamat;
    }


}
