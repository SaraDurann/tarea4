package org.sara.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import org.sara.tarea3.R;

public class ClaseItems extends AppCompatActivity {
    ListView listView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clase_items);
        listView = findViewById(R.id.ListView);
        ClaseAdapter adapter = new ClaseAdapter(ListDataHelper.provideItem());
    }

}