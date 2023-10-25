package oop_seminar4.task2.controler;

import oop_seminar4.task2.data.User;

public interface UserControler <T extends User>{
    T create(String firstName, String secondName, String lastName);
}
