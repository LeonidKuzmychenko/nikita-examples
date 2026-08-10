package project8;

import java.time.LocalDate;

public class PrintDay {

    public String typeDay() {
        int dayNumber = LocalDate.now().getDayOfWeek().getValue();
        String typeDay;
        switch (dayNumber) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                typeDay = "Рабочий день";
                break;
            case 6:
            case 7:
                typeDay = "Выходной день";
                break;
            default:
                typeDay = "Некорректный день";
                break;
        }
        return typeDay;
    }

    public String typeDay2(int dayNumber) {
        ; //LocalDate.now().getDayOfWeek().getValue();
        return switch (dayNumber) {
            case 1, 2, 3, 4 -> "Рабочий день";
            case 5 ->  {
                System.out.println("Рабский день");
                System.out.println("Почти выходной");
                yield "Пятница!";
            }
            case 6, 7 -> "Выходной день";
            default -> "Некорректный день";
        };
    }

}
