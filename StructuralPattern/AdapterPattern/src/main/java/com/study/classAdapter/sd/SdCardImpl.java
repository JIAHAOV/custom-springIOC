package com.study.classAdapter.sd;

public class SdCardImpl implements SdCard{
    private String message;
    @Override
    public void writeSD(String message) {
        this.message = message;
        System.out.println("write SD : " + message);
    }
    @Override
    public String readSD() {
        return "read SD: " + message;
    }
}
