package com.study.objectAdapter;

import com.study.classAdapter.sd.SdCard;
import com.study.classAdapter.tf.TfCard;

public class SdAdapterTf implements SdCard {
    private TfCard tfCard;

    public SdAdapterTf(TfCard tfCard) {
        this.tfCard = tfCard;
    }
    @Override
    public void writeSD(String string) {
        System.out.println("adapter write tf card ");
        tfCard.writeTF(string);
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card ");
        return tfCard.readTF();
    }
}
