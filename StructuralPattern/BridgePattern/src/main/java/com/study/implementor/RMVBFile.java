package com.study.implementor;

public class RMVBFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("RMVBFile: " + fileName);
    }
}
