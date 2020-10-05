public class Calc {
    public static void main(String[] args) {
        if (args.length > 3) {
            System.out.println("Вы ввели > 3 аргументов");
            return;
        }
        if (args.length == 0) {
            System.out.println("Напишите аргументы!!!");
            return;
        }
        if (args.length < 3) {
            System.out.println("Вы ввели < 3 аргументов");
        }

        try {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[2]);
            char operation = args[1].charAt(0);
            if (operation == '/' && -1e-12 < b && b < 1e-12) {
                System.out.println("Делить на 0 нельзя!");
                return;
            }
            System.out.println("Результат: " + calc(a, b, operation));
        } catch (NumberFormatException exceptionObject) {
            System.out.println("Введите цифры!");
        }
    }

    private static double calc(double a, double b, char operation) {
        switch (operation) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                return 0;
        }
    }
}
