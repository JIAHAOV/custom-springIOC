package com.study.abstraction;

import com.study.implementor.VideoFile;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class OperatingSystem {
    private VideoFile videoFile;
    public abstract void play(String name);
}
