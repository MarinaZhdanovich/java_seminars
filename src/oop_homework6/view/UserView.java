package oop_homework6.view;

import oop_homework6.data.User;

import java.util.List;

public interface UserView<T extends User> {
    void sendOnconsole(List<T> list);
}

//Принцип разделения интерфейсов (Interface Segregation Principle)