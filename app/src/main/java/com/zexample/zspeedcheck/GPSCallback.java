package com.zexample.zspeedcheck;

import android.location.Location;

public interface GPSCallback {

    public abstract void onGPSUpdate(Location location);

}
