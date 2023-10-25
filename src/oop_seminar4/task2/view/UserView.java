package oop_seminar4.task2.view;

import oop_seminar4.task2.data.User;

import java.util.List;

public interface UserView<T extends User> {
    void sendOnconsole(List<T> list);
}