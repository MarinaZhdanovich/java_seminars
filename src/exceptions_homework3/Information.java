package exceptions_homework3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class InvalidDataException extends IllegalArgumentException {
    public InvalidDataException(String message) {
        super(message);
    }
}

public class Information {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите Фамилию Имя Отчество, дату рождения (в формате dd.mm.yyyy), номер телефона(7xxxxxxxxxx), пол (f - женский, m - мужской), разделенные пробелом: ");
            String userInput = scanner.nextLine();

            String[] userData = userInput.split(" ");
            if (userData.length != 6) {
                throw new InvalidDataException("Неверное количество данных.");
            }

            String surname = userData[0];
            String name = userData[1];
            String patronymic = userData[2];
            String dateOfBirth = userData[3];
            String phoneNumber = userData[4];
            String gender = userData[5].toLowerCase();

            List<String> errors = new ArrayList<>();

            if (!validateName(surname)) {
                errors.add("Некорректная фамилия.");
            }

            if (!validateName(name)) {
                errors.add("Некорректное имя.");
            }

            if (!validateName(patronymic)) {
                errors.add("Некорректное отчество.");
            }

            if (!validateDateOfBirth(dateOfBirth)) {
                errors.add("Некорректная дата рождения. Введите в формате dd.mm.yyyy");
            }

            if (!validatePhoneNumber(phoneNumber)) {
                errors.add("Некорректный формат номера телефона. Введите в формате 7xxxxxxxxxx.");
            }

            if (!validateGender(gender)) {
                errors.add("Некорректный формат пола. Введите латиницей f - женский, m - мужской.");
            }

            if (!errors.isEmpty()) {
                String errorMessage = String.join("\n", errors);
                throw new InvalidDataException(errorMessage);
            }
            String fileName = surname + ".txt";
            String userInfo = "<" + surname + "><" + name + "><" + patronymic + "><" + dateOfBirth + "><" + phoneNumber + "><" + gender + ">";

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
                writer.write(userInfo);
                writer.newLine();
                System.out.println("Информация успешно записана в файл " + fileName);
            } catch (IOException e) {
                System.out.println("Возникла ошибка при записи в файл: " + e.getMessage());
            }
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean validateName(String name) {
        return name.matches("[a-zA-Zа-яА-Я]+");
    }

    private static boolean validateDateOfBirth(String dateOfBirth) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate parsedDate = LocalDate.parse(dateOfBirth, formatter);
            LocalDate currentDate = LocalDate.now();

            return parsedDate.isBefore(currentDate) &&
                    parsedDate.getYear() >= 1920 &&
                    parsedDate.getMonthValue() <= 12 &&
                    parsedDate.getDayOfMonth() <= 31;
        } catch (DateTimeException e) {
            return false;
        }
    }

    private static boolean validatePhoneNumber(String phoneNumber) {
        return phoneNumber.matches("7\\d{10}");
    }

    private static boolean validateGender(String gender) {
        return gender.matches("[fm]");
    }
}