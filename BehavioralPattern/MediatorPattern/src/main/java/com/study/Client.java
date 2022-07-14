package com.study;

import com.study.code.ConcreteMediator;
import com.study.code.FirstColleague;
import org.junit.jupiter.api.Test;

public class Client {
    @Test
    public void test() {
        ConcreteMediator mediator = new ConcreteMediator();
        FirstColleague rose = new FirstColleague("rose", mediator);
        FirstColleague clara = new FirstColleague("clara", mediator);
        mediator.addColleague(rose);
        mediator.addColleague(clara);
        clara.sendMessage("rose", "hello");
    }
}
