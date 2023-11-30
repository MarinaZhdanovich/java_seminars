package oop_seminar7_1.adapter;

import java.time.LocalDateTime;

public interface MeteoSensor {

    int getId(); // Уникальный идентификатор датчика

    double getTemperature(); // Средняя температура

    double getHumidity(); // Влажность

    double getPressure(); // Давление

    LocalDateTime getDateTime(); // Дата и время
}
