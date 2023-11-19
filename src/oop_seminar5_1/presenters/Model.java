package oop_seminar5_1.presenters;


import oop_seminar5_1.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    Collection<Table> loadTables();


    int reservationTable(Date reservationDate, int tableNo, String name);
}
