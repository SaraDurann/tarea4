package org.sara.listview;

import org.sara.tarea3.R;

import java.util.ArrayList;

public class ListDataHelper {
    public static ArrayList<ListViewitem> provideItem(){
        ArrayList<ListViewitem> list = new ArrayList<>();
        list.add(new ListViewitem(R.drawable.ic_android, "android"));
        list.add(new ListViewitem(R.drawable.ic_child_care, "child care"));
        list.add(new ListViewitem(R.drawable.ic_directions_bike, "directions bike"));
        list.add(new ListViewitem(R.drawable.ic_directions_subway, "directions subway"));
        list.add(new ListViewitem(R.drawable.ic_local_airport, "local airport"));
        list.add(new ListViewitem(R.drawable.ic_notifications_active, "notifications active"));
        list.add(new ListViewitem(R.drawable.ic_pan_tool, "pan tool"));
        list.add(new ListViewitem(R.drawable.ic_record_voice_over, "record voice over"));
        list.add(new ListViewitem(R.drawable.ic_wb_sunny, "wb sunny"));

        return list;

    }
}
