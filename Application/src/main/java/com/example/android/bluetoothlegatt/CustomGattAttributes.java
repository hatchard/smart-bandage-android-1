/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.jared.smartbandage;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class CustomGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();

    //Define known UUID services here according to bluetoothLE specification
    public static String HEART_RATE_MEASUREMENT = "00002a37-0000-1000-8000-00805f9b34fb";
    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";

    static {
        // Define the UUIDs of the services that your bluetooth device exposes
        attributes.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate Service");
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");
        attributes.put("00001800-0000-1000-8000-00805f9b34fb", "CC2650 Service 1");
        attributes.put("00001801-0000-1000-8000-00805f9b34fb", "CC2650 Service 2");
        attributes.put("0000ffe0-0000-1000-8000-00805f9b34fb", "CC2650 Service 3");
        attributes.put("f000aa64-0451-4000-b000-000000000000", "CC2650 Service 4");
        attributes.put("f000ccc0-0451-4000-b000-000000000000", "CC2650 Service 5");
        attributes.put("f000ac00-0451-4000-b000-000000000000", "CC2650 Service 6");
        attributes.put("f000ffc0-0451-4000-b000-000000000000", "CC2650 Service 7");
        // Define the UUIDs of the characteristics for your bluetooth device


        attributes.put(HEART_RATE_MEASUREMENT, "Heart Rate Measurement");
        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");
    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
