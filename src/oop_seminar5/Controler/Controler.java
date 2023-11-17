package oop_seminar5.Controler;

import oop_seminar5.Data.Student;
import oop_seminar5.Data.Type;
import oop_seminar5.Data.User;
import oop_seminar5.Service.DataService;
import oop_seminar5.View.StudentView;

import java.util.List;

public class Controler {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();

    public void createStudent(String firstName, String secondName,
                              String lastName, String dateB){
        service.create(firstName,secondName,lastName,dateB, Type.STUDENT);
    }

    public void getAllStudent(){
        List<User> userList = service.getAllStudent();
        for (User user: userList){
            studentView.printOnConsole((Student) user);
        }
    }
}