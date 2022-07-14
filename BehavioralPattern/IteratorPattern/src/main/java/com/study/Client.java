package com.study;

import com.study.code.Iterator;
import com.study.code.Person;
import com.study.code.PersonAggregate;
import org.junit.jupiter.api.Test;

public class Client {
    @Test
    public void test() {
        Person rose = new Person(1, "rose");
        Person marry = new Person(2, "marry");
        Person clara = new Person(3, "clara");
        Person max = new Person(4, "max");
        PersonAggregate aggregate = new PersonAggregate();
        aggregate.addPerson(rose);
        aggregate.addPerson(marry);
        aggregate.addPerson(clara);
        aggregate.addPerson(max);
        Iterator<Person> iterator = aggregate.getPersonIterator();
        while (iterator.hasNext()) {
            Person next = iterator.next();
            System.out.println(next);
        }
    }
}
