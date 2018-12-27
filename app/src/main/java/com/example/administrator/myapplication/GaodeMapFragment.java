package com.example.administrator.myapplication;


import android.app.Activity;
import android.os.Bundle;
import android.provider.SyncStateContract;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.maps.AMap;
import com.amap.api.maps.LocationSource;
import com.amap.api.maps.MapFragment;
import com.amap.api.maps.MapView;
import com.amap.api.navi.AMapNaviView;
import com.amap.api.navi.AMapNaviViewListener;


public class GaodeMapFragment extends BaseNaviFragment implements LocationSource,
        AMapLocationListener {

    private static GaodeMapFragment fragment = null;
    public static final int POSITION = 0;

    private MapView mapView;
    private AMap aMap;
    private View mapLayout;
    private AMapLocation aMapLocation;


    public static Fragment newInstance() {
        if (fragment == null) {
            synchronized (MapFragment.class) {
                if (fragment == null) {
                    fragment = new GaodeMapFragment();
                }
            }
        }
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        if (mapLayout == null) {
//            Log.i("sys", "MF onCreateView() null");
//            mapLayout = inflater.inflate(R.layout.map, null);
//            mapView = (MapView) mapLayout.findViewById(R.id.mapView);
//            mapView.onCreate(savedInstanceState);
//            if (aMap == null) {
//                aMap = mapView.getMap();
//            }
//        }else {
//            if (mapLayout.getParent() != null) {
//                ((ViewGroup) mapLayout.getParent()).removeView(mapLayout);
//            }
//        }
//        return mapLayout;

        if (mapLayout == null) {
            mapLayout = inflater.inflate(R.layout.map, container, false);
            mAMapNaviView = (AMapNaviView) mapLayout.findViewById(R.id.naviView);
        }
        mAMapNaviView.onCreate(savedInstanceState);
        mAMapNaviView.setAMapNaviViewListener((AMapNaviViewListener) this);
        return mapLayout;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onResume() {
        Log.i("sys", "mf onResume");
        super.onResume();
        mAMapNaviView.onResume();
    }

    /**
     * 方法必须重写
     * map的生命周期方法
     */
    @Override
    public void onPause() {
        Log.i("sys", "mf onPause");
        super.onPause();
        mAMapNaviView.onPause();
    }

    /**
     * 方法必须重写
     * map的生命周期方法
     */
    @Override
    public void onSaveInstanceState(Bundle outState) {
        Log.i("sys", "mf onSaveInstanceState");
        super.onSaveInstanceState(outState);
        mAMapNaviView.onSaveInstanceState(outState);
    }

    /**
     * 方法必须重写
     * map的生命周期方法
     */
    @Override
    public void onDestroy() {
        Log.i("sys", "mf onDestroy");
        super.onDestroy();
        mAMapNaviView.onDestroy();
    }

    @Override
    public void activate(OnLocationChangedListener onLocationChangedListener) {

    }

    @Override
    public void deactivate() {

    }

    @Override
    public void onLocationChanged(AMapLocation aMapLocation) {

    }
}
