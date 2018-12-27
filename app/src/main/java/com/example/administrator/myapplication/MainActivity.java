package com.example.administrator.myapplication;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.view.View.OnClickListener;

import com.amap.api.maps.AMap;
import com.amap.api.maps.MapView;

import org.xutils.x;

public class MainActivity extends FragmentActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


////        获取地图控件引用
//        mMapView = (MapView) findViewById(R.id.map);
//        //在activity执行onCreate时执行mMapView.onCreate(savedInstanceState)，创建地图
//        mMapView.onCreate(savedInstanceState);
//        init();
        GaodeLocaFragment fragment =  GaodeLocaFragment.newInstance();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fragment_container, fragment);
        transaction.commit();


    }


    /**
     * 初始化AMap对象
     */
//    private void init() {
//        if (aMap == null) {
//            aMap = mapView.getMap();
//        }
//        basicmap = (Button) findViewById(R.id.basicmap);
//        basicmap.setOnClickListener(this);
//        rsmap = (Button) findViewById(R.id.rsmap);
//        rsmap.setOnClickListener(this);
//
//        mRadioGroup = (RadioGroup) findViewById(R.id.check_language);
//
//        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                if (checkedId == R.id.radio_en) {
//                    aMap.setMapLanguage(AMap.ENGLISH);
//                } else {
//                    aMap.setMapLanguage(AMap.CHINESE);
//                }
//            }
//        });
//    }

//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        //在activity执行onDestroy时执行mMapView.onDestroy()，销毁地图
////        mMapView.onDestroy();
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        //在activity执行onResume时执行mMapView.onResume ()，重新绘制加载地图
////        mMapView.onResume();
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        //在activity执行onPause时执行mMapView.onPause ()，暂停地图的绘制
////        mMapView.onPause();
//    }
//
//    @Override
//    protected void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//        //在activity执行onSaveInstanceState时执行mMapView.onSaveInstanceState (outState)，保存地图当前的状态
////        mMapView.onSaveInstanceState(outState);
//    }
//
//    @Override
//    public void onClick(View v) {
////        switch (v.getId()) {
////            case R.id.basicmap:
////                aMap.setMapType(AMap.MAP_TYPE_NORMAL);// 矢量地图模式
////                break;
////            case R.id.rsmap:
////                aMap.setMapType(AMap.MAP_TYPE_SATELLITE);// 卫星地图模式
////                break;
////        }
//    }
}
