package com.study.classAdapter;

import com.study.classAdapter.sd.SdCard;
import com.study.classAdapter.tf.TfCardImpl;

public class SdAdapterTf extends TfCardImpl implements SdCard {
    @Override
    public void writeSD(String string) {
        System.out.println("adapter write tf card ");
        writeTF(string);
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card ");
        return readTF();
    }
}
