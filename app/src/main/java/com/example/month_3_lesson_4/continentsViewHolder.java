package com.example.month_3_lesson_4;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class continentsViewHolder extends RecyclerView.ViewHolder {


    private TextView tvName;

    public continentsViewHolder(@NonNull View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.text_name);
    }

    public void onBindContinents(CL_gen continent) {
    tvName.setText(continent.getName());
    }
}
