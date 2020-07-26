package com.java.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName: ObjectStructure
 * @Author: kunyao
 * @Description: 访问者模式
 * @Date: 2020/7/26 19:19
 * @Version: 1.0
 */
public class ObjectStructure {

    private List<Person> persons = new LinkedList<>();


    public void attach(Person person){
        persons.add(person);
    }

    public void detach(Person person){
        persons.remove(person);
    }

    public void display(Action action){
        for(Person person : persons){
            person.accept(action);
        }
    }
}
