package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        Iterator<Integer> iterator = source.iterator();

        logger.log("Запускаем фильтрацию");
        while (iterator.hasNext()) {
            int value = iterator.next();
            if (value >= treshold) {
                result.add(value);
                logger.log("Элемент " + value + " проходит");
            } else {
                logger.log("Элемент " + value + " не проходит");
            }
        }
        logger.log("Прошло фильтр " + result.size() + " элемента из " + source.size());
        return result;
    }
}
