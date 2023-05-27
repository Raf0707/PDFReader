package raf.tabiin.pdfreader.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import raf.tabiin.pdfreader.R;

public class PdfViewHolder extends RecyclerView.ViewHolder {
    public TextView fileName;
    public CardView container;

    public PdfViewHolder(@NonNull View itemView) {
        super(itemView);

        fileName = itemView.findViewById(R.id.fileName);
        container = itemView.findViewById(R.id.container);
    }
}
