package com.study;

public class Phone {
    private String cpu;
    private String screen;
    private String memory;
    private String mainBoard;
    private Phone (PhoneBuilder builder) {
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.memory = builder.memory;
        this.mainBoard = builder.mainBoard;
    }
    public static final class PhoneBuilder {
        private String cpu;
        private String screen;
        private String memory;
        private String mainBoard;
        public PhoneBuilder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public PhoneBuilder setScreen(String screen) {
            this.screen = screen;
            return this;
        }
        public PhoneBuilder setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public PhoneBuilder setMainBoard(String mainBoard) {
            this.mainBoard = mainBoard;
            return this;
        }
        public Phone build() {
            return new Phone(this);
        }
    }
    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                '}';
    }
}
