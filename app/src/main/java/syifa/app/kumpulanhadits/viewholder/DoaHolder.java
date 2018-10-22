package syifa.app.kumpulanhadits.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import syifa.app.kumpulanhadits.R;

/**
 * Created by USER on 08/10/2018.
 */

public class DoaHolder extends RecyclerView.ViewHolder {

    public TextView txtNamaDoa;
    public TextView txtArtiDoa;
    public ImageView imageView;
    public Button ButtonView;



    public DoaHolder(View itemView) {
        super(itemView);
        txtNamaDoa = (TextView) itemView.findViewById(R.id.txt_nama_doa);
        txtArtiDoa = (TextView) itemView.findViewById(R.id.txt_arti_doa);
        imageView  = (ImageView) itemView.findViewById(R.id.imageView);
    }
}
