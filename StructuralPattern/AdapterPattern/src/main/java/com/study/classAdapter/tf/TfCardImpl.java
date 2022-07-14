package com.study.classAdapter.tf;

public class TfCardImpl implements TfCard{
    private String message;
    @Override
    public void writeTF(String message) {
        this.message = message;
        System.out.println("write TF: " + message);
    }
    @Override
    public String readTF() {
        return "read TF: " + message;
    }
}
