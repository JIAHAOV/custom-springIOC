package com.study;

import com.study.code.Computer;
import com.study.code.vsitor.Master;
import com.study.code.vsitor.Visitor;
import org.junit.jupiter.api.Test;

public class Client {
    @Test
    public void test() {
        Computer computer = new Computer();
        Master master = new Master("master");
        Visitor visitor = new Visitor("visitor");
        computer.accept(master);
        computer.accept(visitor);
    }
}
