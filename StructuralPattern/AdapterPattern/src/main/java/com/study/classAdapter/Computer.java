package com.study.classAdapter;

import com.study.classAdapter.sd.SdCard;

public class Computer {
    public void readSD(SdCard sdCard) {
        String message = sdCard.readSD();
        System.out.println(message);
        sdCard.writeSD("hello world");
    }
}
