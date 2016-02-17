package com.example.android.bluetoothlegatt;

import android.bluetooth.BluetoothClass;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import com.google.gson.Gson;
/**
 * Created by Jared on 2/16/2016.
 * This class is used to retrieve/store bluetooth devices into a text file and then try to reconnect
 * when it becomes disconnected
 */
public class PairedDevices {

    private ArrayList<Device> devices;
    public ArrayList<Device> getDeviceList() {
        return devices;
    }

    static class Device {
        private String bleDeviceName;
        private String bleMacAddress;
    }
}


