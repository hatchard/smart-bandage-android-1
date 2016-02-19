package com.example.android.bluetoothlegatt;

import android.util.Log;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Jared on 2/16/2016.
 */
public class FileIO {

    private File getFile(String file_name) throws IOException {
        File f = new File(file_name);
        if (!f.exists()) {
            Log.d("File:","Not exists, creating");
            f.createNewFile();
        }
        return f;
    }

    public String readFile(String file_name) {
        File f = null;
        try {
            f = getFile(file_name);
            BufferedReader buf = new BufferedReader(new FileReader(f));
            String line = null;
            StringBuilder stringBulder = new StringBuilder();

            while ( (line = buf.readLine()) != null){
                stringBulder.append(line);
            }
            buf.close();
            return stringBulder.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }

    public ArrayList<String> readFileIntoArray(String file_name) {
        File f = null;
        ArrayList<String> list = new ArrayList<>();
        try {
            f = getFile(file_name);
            BufferedReader buf = new BufferedReader(new FileReader(f));
            String line = null;
            StringBuilder stringBulder = new StringBuilder();

            while ( (line = buf.readLine()) != null){
                list.add(line);
            }
            buf.close();
            return list;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }

    public boolean writeFile(String file_name,boolean append,String content){
        File f = null;
        try {
            f = getFile(file_name);
            int contentLength = content.length();
            BufferedWriter buf = new BufferedWriter(new FileWriter(f,append));
            buf.write(content, 0, contentLength);
            buf.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean writeArrayListToFile(String file_name,boolean append,ArrayList<String> list){
        File f = null;
        try {
            f = getFile(file_name);
            Iterator iter = list.iterator();
            BufferedWriter buf = new BufferedWriter(new FileWriter(f, append));
            while (iter.hasNext()) {
                String content =iter.next().toString();
                buf.write(content, 0, content.length());
                buf.newLine();
            }
            buf.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

}
