package com.study.abstraction;

import com.study.implementor.VideoFile;

public class Window extends OperatingSystem{
    public Window(VideoFile videoFile) {
        super(videoFile);
    }
    @Override
    public void play(String name) {
        getVideoFile().decode(name);
    }
}
