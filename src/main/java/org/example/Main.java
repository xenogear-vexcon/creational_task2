package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        int maxLimit = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите верхнюю границу для значений: ");
        int maxValue = Integer.parseInt(scanner.nextLine());
        logger.log("Создаём и наполняем список");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < maxLimit; i++) {
            list.add(random.nextInt(maxValue));
        }
        System.out.println("Вот случайный список: " + Arrays.toString(list.toArray()));
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int treshold = Integer.parseInt(scanner.nextLine());
        Filter filter = new Filter(treshold);
        List<Integer> filteredList = filter.filterOut(list);

        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + Arrays.toString(filteredList.toArray()));
        logger.log("Завершаем программу");
    }
}