package id.ac.polinema.tugas1febtria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.tugas1febtria.adapters.BuahAdapter;
import id.ac.polinema.tugas1febtria.models.Buah;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvBuah;
    List<Buah> buahList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvBuah = findViewById(R.id.rvBuah);

        Buah buah = new Buah("Apel" , "Buah Apel rasanya Manis, warna buahnya adalah Merah" ,R.drawable.apel);
        buahList.add(buah);

        buah = new Buah("Anggur" , "Buah Anggur rasanya Manis dan asam, warna buahnya adalah Merah ke ungu-unguan" ,R.drawable.anggur);
        buahList.add(buah);

        buah = new Buah("Jeruk" , "Buah Jeruk rasanya Manis dan asam, warna buahnya adalah Orange" ,R.drawable.jeruk);
        buahList.add(buah);

        buah = new Buah("Mangga" , "Buah Mangga rasanya Manis dan asam, warna kulitnya adalah hijau tetapi isinya setelah dikupas berwarna kuning setengah orange" ,R.drawable.mangga);
        buahList.add(buah);

        buah = new Buah("Semangka" , "Buah Semangka rasanya Manis, warna kulitnya adalah hijau, ketika dikupas isinya berwarna Merah" ,R.drawable.semangka);
        buahList.add(buah);

        BuahAdapter buahAdapter = new BuahAdapter(buahList);
        rvBuah.setAdapter(buahAdapter);
        rvBuah.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        rvBuah.setLayoutManager(new GridLayoutManager(this,2));
    }
}
