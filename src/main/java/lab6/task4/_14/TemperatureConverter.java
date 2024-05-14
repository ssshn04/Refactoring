package lab6.task4._14;

public class TemperatureConverter {
    public static double convertToCelsius(double fahrenheit) {
        if (fahrenheit < -459.67) {
            System.out.println("Помилка: Неприпустима температура: менше абсолютного нуля");
            return Double.NaN;
        }
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        double celsius = convertToCelsius(-500);
        if (!Double.isNaN(celsius)) {
            System.out.println("Температура в градусах Цельсія: " + celsius);
        } else {
            System.out.println("Неможливо конвертувати температуру.");
        }
    }
}

