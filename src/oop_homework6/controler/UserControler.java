package oop_homework6.controler;

import oop_homework6.data.User;

public interface UserControler <T extends User>{
    T create(String firstName, String secondName, String lastName);
}

//Принцип разделения интерфейсов (Interface Segregation Principle)