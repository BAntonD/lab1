public class Main {
    public static void main(String[] args) {
        // Ініціалізація Матриці
        final byte[][] matrix = {
                {3, 4, 3, 1},
                {7, 7, 3, 2},
                {7, 1, 2, 3},
                {0, 7, 5, 3},
                {3, 8, 6, 2}
        };

        //Перевірка на порожність матриці
        if (matrix.length == 0 || matrix[0].length == 0) {
            System.out.println("Матриця порожня. Завдання не можуть бути виконані.");
            return; // Завершуємо виконання програми
        }

        System.out.println("Номер залікової якщо не помиляюся 2402");
        System.out.println("1 Завдання");
        System.out.println("с5 = 2");
        System.out.println("с7 = 1");
        System.out.println();

        // Виводжу початкову матрицю
        System.out.println("Ориганальна матриця:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Визначаю кількість рядків і стовпців оригінальної матриці
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Ініціалізую нову матрицю для транспонованого результату
        final byte[][] transposed = new byte[cols][rows];

        // Транспоную матрицю
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        // Виводжу транспоновану матрицю
        System.out.println("Транспонована матриця:");
        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[i].length; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("2 Завдання");
        System.out.println("с7 = 4");
        System.out.println();

        // Ініціалізація змінних сум
        int sumEvenMax = 0; // Сума найбільших елементів у рядках з парними номерами
        int sumOddMin = 0;  // Сума найменших елементів у рядках з непарними номерами

        for (int i = 0; i < transposed.length; i++) {
            byte extremeValue = transposed[i][0];

            // Знаходжу або максимум, або мінімум залежно від номера рядка
            for (int j = 1; j < transposed[i].length; j++) {
                if ((i+1) % 2 == 0) { // Для рядків з парними номерами шукаємо максимум
                    if (transposed[i][j] > extremeValue) {
                        extremeValue = transposed[i][j];
                    }
                } else { // Для рядків з непарними номерами шукаємо мінімум
                    if (transposed[i][j] < extremeValue) {
                        extremeValue = transposed[i][j];
                    }
                }
            }

            // Додаю знайдене значення до відповідної суми
            if ((i+1) % 2 == 0) {
                sumEvenMax += extremeValue;
            } else {
                sumOddMin += extremeValue;
            }
        }

        // Виводжу результати
        System.out.println("Сума найбільших елементів у рядках з парними номерами: " + sumEvenMax);
        System.out.println("Сума найменших елементів у рядках з непарними номерами: " + sumOddMin);
    }
}