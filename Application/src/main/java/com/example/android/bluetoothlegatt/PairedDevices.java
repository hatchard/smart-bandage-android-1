package com.example.android.bluetoothlegatt;

import android.bluetooth.BluetoothClass;

import java.util.ArrayList;
/**
 * Created by Jared on 2/16/2016.
 * This class is used to retrieve/store bluetooth devices into a text file and then try to reconnect
 * when it becomes disconnected
 */
public class PairedDevices {

    private ArrayList<Device> devices;
    private static final String file_name = "pairedDevices.txt";

    public ArrayList<Device> getDeviceList() {
        return devices;
    }

    static class Device {
        private String bleDeviceName;
        private String bleMacAddress;
    }
}


