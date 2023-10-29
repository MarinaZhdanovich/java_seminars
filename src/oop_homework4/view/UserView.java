package oop_homework4.view;

import oop_homework4.data.User;

import java.util.List;

public interface UserView<T extends User> {
    void sendOnconsole(List<T> list);
}