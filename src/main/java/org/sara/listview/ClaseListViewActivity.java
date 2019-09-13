package org.sara.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;
import org.sara.tarea3.R;

public class ClaseListViewActivity extends AppCompatActivity {
    GridView listView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clase_items); //vaya vaya
        listView = findViewById(R.id.ListView);
        final ClaseAdapter adapter = new ClaseAdapter(ListDataHelper.provideItem());
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(
                        getApplicationContext(),
                        adapter.getItem(position).getTitle(),
                        Toast.LENGTH_LONG
                ).show();
            }
        });
    }

}