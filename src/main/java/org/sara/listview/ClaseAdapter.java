package org.sara.listview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.sara.tarea3.R;

import java.util.ArrayList;

public class ClaseAdapter extends BaseAdapter {

    private ArrayList<ListViewitem> items;
    public ClaseAdapter(ArrayList<ListViewitem> items){
        this.items =items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public ListViewitem getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null){
            view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.listview_item, viewGroup, false);
        }
        decorateWith(view, items.get(i));
        return view;
    }

    private void decorateWith(View view, ListViewitem listViewitem) {
        ImageView imageView = view.findViewById(R.id.imageView);
        TextView textView = view.findViewById(R.id.textView3);
        imageView.setImageResource(listViewitem.getImageResource());
        textView.setText(listViewitem.getTitle());

    }
}
