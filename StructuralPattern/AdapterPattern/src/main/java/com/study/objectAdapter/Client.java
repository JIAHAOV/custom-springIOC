package com.study.objectAdapter;

import com.study.classAdapter.Computer;
import com.study.classAdapter.tf.TfCardImpl;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        SdAdapterTf sdAdapterTf = new SdAdapterTf(new TfCardImpl());
        computer.readSD(sdAdapterTf);
    }
}
