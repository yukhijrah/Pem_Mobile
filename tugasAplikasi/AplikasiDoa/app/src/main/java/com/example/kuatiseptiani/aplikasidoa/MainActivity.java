package com.example.kuatiseptiani.aplikasidoa;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.kuatiseptiani.aplikasidoa.adapter.DoaAdapter;
import com.example.kuatiseptiani.aplikasidoa.model.Doa;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView lstDoa;
    LinearLayoutManager linear;

    List<Doa> doas;
    DoaAdapter adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstDoa = (RecyclerView) findViewById(R.id.lst_doa);

        linear = new LinearLayoutManager(this);
        lstDoa.setLayoutManager(linear);

        doas = new ArrayList<>();
        doas.add(new Doa(0, "Do'a Sebelum Tidur","بِسْمِكَ اللّهُمَّ اَحْيَا وَ بِسْمِكَ اَمُوْتُ","Dengan menyebut Namamu Ya Allah Aku Hidup dan dengan menyebut Namamu Aku Mati"));
        doas.add(new Doa(0, "Do'a Bangun Tidur","اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْرُ","Segala puji bagi Allah Dzat yang menghidupkan kami setelah kami mati (tidur) dan kepadanyalah kami kembali"));
        doas.add(new Doa(0, "Do'a Masuk Masjid","اَللّهُمَّ افْتَحْ لِيْ اَبْوَابَ رَحْمَتِكَ.","Wahai Tuhanku, bukakanlah untukku pintu-pintu rahmat-Mu"));
        doas.add(new Doa(0, "Do'a Keluar Masjid","اَللّهُمَّ اِنِّيْ أسْأَلُكَ مِنْ فَضْلِكَ","Wahai Tuhanku, sesungguhnya aku memohon kepada-Mu akan segala keutamaan-Mu"));
        doas.add(new Doa(0, "Do'a Sebelum Belajar","رَضِتُ بِااللهِ رَبَا وَبِالْاِسْلاَمِ دِيْنَا وَبِمُحَمَّدٍ نَبِيَا وَرَسُوْلاَ رَبِّ زِدْ نِيْ عِلْمًـاوَرْزُقْنِـيْ فَهْمًـاٍ","Kami ridho Allah Swt sebagai Tuhanku, Islam sebagai agamaku, dan Nabi Muhammad sebagai Nabi dan Rasul, Ya Allah, tambahkanlah kepadaku ilmu dan berikanlah aku pengertian yang baik"));
        doas.add(new Doa(0, "Do'a Setelah Belajar","اَللّٰهُمَّ اخْرِجْنَا مِنْ ظُلُمَاتِ الْوَهْمِ وَاَكْرِمْنَا بِنُوْرِالْفَهْمِ وَافْتَحْ عَلَيْنَا بِمَعْرِفَتِكَوَسَهِّلْ لَنَآ اَبْوَابَ فَضْلِكَ يَآ اَرْحَمَ الرَّاحِمِيْنَ","Ya Allah, keluarkanlah kami dari kegelapan prasangka muliakanlah kami dengan cahaya kepahaman, bukakanlah pengertian ilmu pada kami dan bukakanlah untuk kami pintu-pintu anugerah-Mu, wahai Dzat yang paling penyayang"));
        doas.add(new Doa(0, "Do'a Keluar Rumah","بِسْمِ اللَّهِ ، تَوَكَّلْتُ عَلَى اللَّهِ ، وَلا حَوْلَ وَلا قُوَّةَ إِلاَّ بِاللَّه","Dengan menyebut nama Allah, aku menyerahkan diriku pada Allah dan tidak ada daya dan kekuatan selain dengan Allah saja"));
        doas.add(new Doa(0, "Do'a Masuk Rumah","بِسْمِ اللهِ وَلَجْنَا وَبِسْمِ اللهِ خَرَجْنَا ، وَعَلَى اللهِ رَبَّنَا تَوَكَّلْنَا","Dengan nama Allah kami masuk rumah, dengan nama Allah aku keluar rumah, serta kepada-Nya aku berserah diri"));
        doas.add(new Doa(0, "Do'a Untuk Orang Tua","اَللهُمَّ اغْفِرْلِىْ ذُنُوْبِىْ وَلِوَالِدَىَّ وَارْحَمْهُمَا كَمَا رَبَّيَانِىْ صَغِيْرًا","Ya Allah, berikanlah ampunan kepadaku atas dosa-dosaku dan dosa-dosa kedua orang tuaku, dan kasihanilah keduanya itu sebagaimana beliau berdua merawatku ketika aku masih kecil"));

        adapter = new DoaAdapter(this, doas);
        lstDoa.setAdapter(adapter);
    }

    /*private void DoaCollections() {
        doas.add(new Doa(0, "Nama", "Arti"));
        doas.add(new Doa(0, "Nama", "Arti"));
        doas.add(new Doa(0, "Nama", "Arti"));

        adapter = new DoaAdapter(this, doas);

        lstDoa.setAdapter(adapter);

    }*/

}
