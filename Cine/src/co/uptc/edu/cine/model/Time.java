package co.uptc.edu.cine.model;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Time {
    LocalDateTime date = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'Fecha: 'dd/MM/yyyy\n'Hora: 'HH:mm:ss");

    public String getFormatter() {
        return date.format(formatter);
    }

    public static void main(String[] args) {
        Time time = new Time();
        System.out.println(time.getFormatter());
    }
}
