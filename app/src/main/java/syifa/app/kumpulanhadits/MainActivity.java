package syifa.app.kumpulanhadits;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import syifa.app.kumpulanhadits.adapter.DoaAdapter;
import syifa.app.kumpulanhadits.model.Doa;

/**
 * Created by USER on 01/10/2018.
 */

public class MainActivity extends AppCompatActivity {

    private List<Doa> doas = new ArrayList<>();
    private RecyclerView lstDoa;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // untuk casting recycleViewnya
        lstDoa =  (RecyclerView) findViewById(R.id.list_doa);

        doaCollections();

        DoaAdapter adapter = new DoaAdapter(doas);
    }

    private void doaCollections() {
        doas.add(new Doa("Do'a sebelum tidur","Dengan menyebut Namamu Ya Allah Aku Hidup dan dengan menyebut Namamu Aku Mati","بِسْمِكَ اللّهُمَّ اَحْيَا وَ بِسْمِكَ اَمُوْتُ"));
        doas.add(new Doa("Do'a bangun tidur","Segala puji bagi Allah Dzat yang menghidupkan kami setelah kami mati (tidur) dan kepadanyalah kami kembali","اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْرُ"));
        doas.add(new Doa("Do'a Masuk masjid","Wahai Tuhanku, bukakanlah untukku pintu-pintu rahmat-Mu","اَللّهُمَّ افْتَحْ لِيْ اَبْوَابَ رَحْمَتِكَ."));
        doas.add(new Doa("Do'a keluar masjid","Wahai Tuhanku, sesungguhnya aku memohon kepada-Mu akan segala keutamaan-Mu","اَللّهُمَّ اِنِّيْ أسْأَلُكَ مِنْ فَضْلِكَ"));
        doas.add(new Doa("Do'a sebelum belajar","Kami ridho Allah Swt sebagai Tuhanku, Islam sebagai agamaku, dan Nabi Muhammad sebagai Nabi dan Rasul, Ya Allah, tambahkanlah kepadaku ilmu dan berikanlah aku pengertian yang baik","رَضِتُ بِااللهِ رَبَا وَبِالْاِسْلاَمِ دِيْنَا وَبِمُحَمَّدٍ نَبِيَا وَرَسُوْلاَ رَبِّ زِدْ نِيْ عِلْمًـاوَرْزُقْنِـيْ فَهْمًـاٍ"));
        doas.add(new Doa("Do'a setelah belajar","Ya Allah, keluarkanlah kami dari kegelapan prasangka muliakanlah kami dengan cahaya kepahaman, bukakanlah pengertian ilmu pada kami dan bukakanlah untuk kami pintu-pintu anugerah-Mu, wahai Dzat yang paling penyayang.","اَللّٰهُمَّ اخْرِجْنَا مِنْ ظُلُمَاتِ الْوَهْمِ وَاَكْرِمْنَا بِنُوْرِالْفَهْمِ وَافْتَحْ عَلَيْنَا بِمَعْرِفَتِكَوَسَهِّلْ لَنَآ اَبْوَابَ فَضْلِكَ يَآ اَرْحَمَ الرَّاحِمِيْنَ"));
        doas.add(new Doa("Do'a keluar rumah","Dengan menyebut nama Allah, aku menyerahkan diriku pada Allah dan tidak ada daya dan kekuatan selain dengan Allah saja","بِسْمِ اللَّهِ ، تَوَكَّلْتُ عَلَى اللَّهِ ، وَلا حَوْلَ وَلا قُوَّةَ إِلاَّ بِاللَّه"));
        doas.add(new Doa("Do'a masuk rumah","Dengan nama Allah kami masuk rumah, dengan nama Allah aku keluar rumah, serta kepada-Nya aku berserah diri","بِسْمِ اللهِ وَلَجْنَا وَبِسْمِ اللهِ خَرَجْنَا ، وَعَلَى اللهِ رَبَّنَا تَوَكَّلْنَا"));
        doas.add(new Doa("Do'a untuk orang tua","Ya Allah, berikanlah ampunan kepadaku atas dosa-dosaku dan dosa-dosa kedua orang tuaku, dan kasihanilah keduanya itu sebagaimana beliau berdua merawatku ketika aku masih kecil","اَللهُمَّ اغْفِرْلِىْ ذُنُوْبِىْ وَلِوَالِدَىَّ وَارْحَمْهُمَا كَمَا رَبَّيَانِىْ صَغِيْرًا"));
    }
}
