package oop_homework4.controler;

import oop_homework4.data.User;

public interface UserController<T extends User>{
    T create(String firstName, String secondName, String lastName);
}


