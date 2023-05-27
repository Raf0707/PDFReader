package raf.tabiin.pdfreader.adapter;

import android.content.Context;
import android.view.ContentInfo;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.io.File;
import java.util.List;

import raf.tabiin.pdfreader.R;

public class PdfAdapter extends RecyclerView.Adapter<PdfViewHolder> {
    private Context context;
    private List<File> pdfFiles;

    public PdfAdapter(Context context, List<File> pdfFiles) {
        this.context = context;
        this.pdfFiles = pdfFiles;
    }

    @NonNull
    @Override
    public PdfViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PdfViewHolder(LayoutInflater.from(context)
                .inflate(R.layout.element_holder, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PdfViewHolder holder, int position) {
        holder.fileName.setText(pdfFiles.get(position).getName());
        holder.fileName.setSelected(true);
    }

    @Override
    public int getItemCount() {
        return pdfFiles.size();
    }
}
