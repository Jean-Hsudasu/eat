package com.example.user.eat;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends ListActivity {
    ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();

    private SimpleAdapter adapter;

    private static final String[] mPlaces = new String[] {
            "高雄市", "新北市", "台南市", "高雄市", "苗粟縣",
            "台北市", "新北市", "台南市", "台北市", "苗粟縣",
            "台北市", "新北市", "台南市", "高雄市", "苗粟縣",

    };

    private static final String[] mFoods = new String[] {
            "大腸包小腸", "蚵仔煎", "東山鴨頭", "臭豆腐", "潤餅",
            "豆花", "青蛙下蛋","豬血糕", "大餅包小餅", "鹹水雞",
            "烤香腸","車輪餅","珍珠奶茶","鹹酥雞","大熱狗",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i=0; i<mPlaces.length; i++){
            HashMap<String,String> item = new HashMap<String,String>();
            item.put( "food", mFoods[i]);
            item.put( "place",mPlaces[i] );
            list.add( item );
        }

        adapter = new SimpleAdapter(
                this,
                list,
                android.R.layout.simple_list_item_2,
                new String[] { "food","place" },
                new int[] { android.R.id.text1, android.R.id.text2 } );

        setListAdapter(adapter);
    }







    @Override

    protected void onListItemClick(ListView l, View v, int position , long id) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra("n",position );
        super.onListItemClick(l, v, position, id);
        startActivityForResult(intent, 111);
        index = position;
    }

    int index;
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (data == null)
            return;

        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case 111:
                int like = data.getIntExtra("Like",1);
                if (like == 1) {
                    Toast.makeText(this, "我喜歡吃在"+mPlaces[index]+"的"+mFoods[index],Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(this, "我不喜歡吃在"+mPlaces[index]+"的"+mFoods[index],Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
