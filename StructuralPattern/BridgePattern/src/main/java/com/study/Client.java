package com.study;

import com.study.abstraction.Mac;
import com.study.implementor.AVIFile;
import com.study.implementor.RMVBFile;

public class Client {
    public static void main(String[] args) {
        Mac mac = new Mac(new AVIFile());
        mac.play("videName");
        mac = new Mac(new RMVBFile());
        mac.play("videName");
    }
}
