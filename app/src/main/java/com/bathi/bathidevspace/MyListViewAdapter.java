package com.bathi.bathidevspace;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListViewAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] myNames;
    private final Integer[] myImages;

    public MyListViewAdapter(Activity context, String[] ProNames, Integer[] ProImages) {
        super(context, R.layout.activity_my_list_view, ProNames);
        this.context = context;
        this.myNames = MyDevProfile.myNames;
        this.myImages = MyDevProfile.myImages;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View rowView = layoutInflater.inflate(R.layout.activity_my_list_view, null, true);
        TextView textTitle = rowView.findViewById(R.id.textView7);
        ImageView imageView = rowView.findViewById(R.id.imageView2);
        textTitle.setText(myNames[position]);
        imageView.setImageResource(myImages[position]);
        return rowView;
    }
}