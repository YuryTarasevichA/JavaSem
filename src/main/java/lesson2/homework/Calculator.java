package lesson2.homework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculate('+', 5, 2);
    }

    /**
     * "гггг-мм-дд чч:мм User entered the first operand = {первое число}"
     * "гггг-мм-дд чч:мм User entered the operation = {оператор}"
     * "гггг-мм-дд чч:мм User entered the second operand = {второе число}"
     * "гггг-мм-дд чч:мм Result is {результат}"
     */
    public int calculate(char op, int a, int b) {
        try {
            Path log = createLogFile();

            int result = -1;
            if ('+' == op) {
                result = a + b;
            }
            // Остальные операции

            StringBuilder output = new StringBuilder()
                    .append(getCurrentDateFormat() + " User entered the first operand = " + a + "\n")
                    .append(getCurrentDateFormat() + " User entered the operation = " + op + "\n")
                    .append(getCurrentDateFormat() + " User entered the second operand = " + b + "\n")
                    .append(getCurrentDateFormat() + " Result is = " + result);

            Files.writeString(log, output);
            return result;
        } catch (IOException e) {
            System.err.println("Произошла ошибка: " + e.getMessage());
            return -1;
        }
    }

    private static String getCurrentDateFormat() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("YYYY-mm-DD HH:mm"));
    }

    private static Path createLogFile() throws IOException {
        Path log = Path.of("log.txt");
        if (Files.notExists(log)) {
            Files.createFile(log);

        }
        return log;
    }
}
