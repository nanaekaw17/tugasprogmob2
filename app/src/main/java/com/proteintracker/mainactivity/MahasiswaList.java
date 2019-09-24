package com.proteintracker.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MahasiswaList extends AppCompatActivity {
    String[] items={"Nana Eka Wulandari", "Jonathan Prajna Marga Parama", "Emma Norren Cahya Putri",
            "Michael Gerardi Adji", "Cynthia Kumalasari", "Nikolaus Aryawan Ravato Wijaya", "Jonathan Alvin Ananto", "Monica Carista",
            "Didimus Candra Gased", "Valeriana Tanesha Indra S", "Grace Hutabarat", "Beni Mulia Tabarus"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahasiswa_list);

        ListView lst = findViewById(R.id.ListNamaTeman);

        lst.setAdapter(new ArrayAdapter<String>(MahasiswaList.this, android.R.layout.simple_list_item_1, items));
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MahasiswaList.this, "Anda memilih = " + items[i], Toast.LENGTH_LONG).show();
            }
        });
        Button tmb1 = findViewById(R.id.btnTambah);
        tmb1.setOnClickListener(tmb);

        Button upd = findViewById(R.id.btnupdt2);
        upd.setOnClickListener(udt);

    }
    private View.OnClickListener tmb = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MahasiswaList.this,TambahMahasiswa.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener udt = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent( MahasiswaList.this,UpdateMahasiswa.class);
            startActivity(intent);
        }
    };

}
