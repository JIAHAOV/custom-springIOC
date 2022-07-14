package com.study.abstraction;

import com.study.implementor.VideoFile;

public class Mac extends OperatingSystem{
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }
    @Override
    public void play(String name) {
        getVideoFile().decode(name);
    }
}
