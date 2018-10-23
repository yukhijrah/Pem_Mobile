package com.example.kuatiseptiani.aplikasidoa.viewholder;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kuatiseptiani.aplikasidoa.R;

/**
 * Created by kuatiseptiani on 23/10/18.
 */

public class DoaHolder extends RecyclerView.ViewHolder {

    public TextView txtJudulDoa;
    public TextView txtArtiDoa;
    public ImageView imgDoa;
    public CardView cardItemDoa;

    public DoaHolder(View itemView) {
        super(itemView);
        cardItemDoa = (CardView) itemView.findViewById(R.id.carditem_doa);
        imgDoa = (ImageView) itemView.findViewById(R.id.img_doa);
        txtJudulDoa = (TextView) itemView.findViewById(R.id.txt_judul_doa);
        txtArtiDoa = (TextView) itemView.findViewById(R.id.txt_arti_doa);

    }
}
