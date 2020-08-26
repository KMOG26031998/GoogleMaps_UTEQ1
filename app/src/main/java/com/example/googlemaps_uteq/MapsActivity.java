package com.example.googlemaps_uteq;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        /////////////////PUNTOS////////////////////777777
        //FCI
        LatLng FCI = new LatLng(-1.0127992,-79.4703445);
        mMap.addMarker(new MarkerOptions().position(FCI).title("FCI").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(FCI));

        
        //FCE
        LatLng FCE = new LatLng(-1.0123803,-79.4700179);
        mMap.addMarker(new MarkerOptions().position(FCE).title("FCE").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(FCE));
        //FCAM
        LatLng FCAM = new LatLng(-1.0128652,-79.4708047);
        mMap.addMarker(new MarkerOptions().position(FCAM).title("FCAM").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(FCAM));
        //ENFERMERIA
        LatLng ENF= new LatLng(-1.0125912,-79.4692893);
        mMap.addMarker(new MarkerOptions().position(ENF).title("ENFERMERIA").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ENF));
        //COMEDOR
        LatLng CS = new LatLng(-1.0126317,-79.4700394);
        mMap.addMarker(new MarkerOptions().position(CS).title("COMEDOR").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CS));
        //BIBLIOTECA
        LatLng BIBL = new LatLng(-1.0126579,-79.4684568);
        mMap.addMarker(new MarkerOptions().position(BIBL).title("BIBLIOTECA").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(BIBL));
        //INSTITUTO
        LatLng INS = new LatLng(-1.0123944,-79.4695334);
        mMap.addMarker(new MarkerOptions().position(INS).title("INSTITUTO").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(INS));
        //CENTROMEDICO
        LatLng CEN = new LatLng(-1.0126129,-79.4690479);
        mMap.addMarker(new MarkerOptions().position(CEN).title("CENTRO MEDICO").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CEN));
        //RECTORADO
        LatLng REC = new LatLng(-1.0128676,-79.4685787);
        mMap.addMarker(new MarkerOptions().position(REC).title("RECTORADO").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(REC));
        //AUDITORIO
        LatLng AUD = new LatLng(-1.0127096,-79.4676656);
        mMap.addMarker(new MarkerOptions().position(AUD).title("AUDITORIO").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(AUD));
        ////BOTONES
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        ///////POLIGONO
        Polyline polyline1 = googleMap.addPolyline(new PolylineOptions()
                .clickable(true)
                .add(
                        new LatLng(-1.0120302,-79.4669389),
                        new LatLng(-1.0136164,-79.4671109),
                        new LatLng(-1.0133382,-79.4718261),
                        new LatLng(-1.0119417,-79.4718937),
                       // new LatLng(-1.011772,-79.4698741),
                        new LatLng(-1.0118206,-79.4718925),
                        new LatLng(-1.0120302,-79.4669389)
                ));
    }
}