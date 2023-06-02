package co.uptc.edu.cine.model;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Time {
    LocalDateTime date = LocalDateTime.now();
    LocalDateTime filmTime;
    DateTimeFormatter filmFormatter = DateTimeFormatter.ofPattern("'Hoy: 'dd/MM/yyyy ' - 'HH:mm");
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'Fecha: 'dd/MM/yyyy\n'Hora: 'HH:mm:ss");

    public String getFormatter() {
        return date.format(formatter);
    }

    public void setTime(int hour, int minute) {
        filmTime = LocalDateTime.of(this.date.getYear(), this.date.getMonth(), this.date.getDayOfMonth(), hour, minute);
    }

    public String timeFilm() {
        filmTime = LocalDateTime.of(this.date.getYear(), this.date.getMonth(), this.date.getDayOfMonth(),
                this.date.getHour() + 4, this.date.getMinute());
        return filmTime.format(formatter);
    }

    public String getFilmTime() {
        return filmTime.format(filmFormatter);
    }

    public static void main(String[] args) {
        Time time = new Time();
        System.out.println(time.getFormatter());
        time.setTime(18, 30);
        System.out.println(time.getFilmTime());
    }
}