package oop_seminar5_1;


import oop_seminar5_1.models.TableModel;
import oop_seminar5_1.presenters.BookingPresenter;
import oop_seminar5_1.views.BookingView;

import java.util.Date;

public class Program {

    //TODO: Метод changeReservationTable должен заработать!
    public static void main(String[] args) {

        TableModel tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
        bookingPresenter.updateTablesUI();
        bookingView.reservationTable(new Date(), 3, "Станислав");


        bookingView.changeReservationTable(1004, new Date(), 2, "Станислав");

    }

}
