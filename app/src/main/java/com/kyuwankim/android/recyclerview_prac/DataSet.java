package com.kyuwankim.android.recyclerview_prac;

import java.util.ArrayList;

/**
 * Created by kimkyuwan on 2017. 3. 17..
 */

public class DataSet {

    private ArrayList<Data> datas;

    public ArrayList<Data> get(){
        return datas;
    }

    public DataSet() {
        datas = new ArrayList<>();
        load();
    }

    private void load() {

        for (int i = 0; i < 100; i++) {
            Data data = new Data();

            data.title = "Title " + i;
            data.year = "200" + i;
            data.month = i + "";

            datas.add(data);
        }
    }
}
