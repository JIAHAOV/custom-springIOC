package com.study.implementor;

public class AVIFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("AVI: " + fileName);
    }
}
