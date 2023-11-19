package oop_seminar5_1.presenters;



import oop_seminar5_1.models.Table;

import java.util.Collection;

public interface View {

    void showTables(Collection<Table> tables);

    void showReservationTableResult(int reservationNo);

    void registerObserver(ViewObserver observer);

}
