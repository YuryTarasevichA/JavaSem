package home_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/**
 * Дан текст. Нужно отсортировать слова по длине (по возрастанию) и вывести статистику на экран.
 * Регистр слова не имеет значения. Формат вывода произвольный.
 * Программа-минимум:
 * 1. Слова, состоящие из дефисов, считаем одним словом. Т.е. каких-то - одно слово из 8 символов.
 * 2. Точки и запятые не должны входить в статистику.
 *
 * Доп. задание
 * 1. * Не включать дефис в длину слова. Т.е. каких-то - одно слово из 7 символов.
 *
 * Пример:
 *
 * Это мой первый текст. Он состоит из каких-то тестовых слов и нужен для того, чтобы выполнить тестовое задание GB.
 * Данный текст не несет в себе какого-либо смысла, он просто содержит набор слов.
 *
 * 1 -> [и, в]
 * 2 -> [он, из, gb, не]
 * 3 -> [мой, для]
 * 4 -> [слов, того, себе]
 * 5 -> [текст, нужен, чтобы, несет, набор]
 * ...
 */
public class Homework {
    public static void main (String[] args) {
        String text = "Это мой первый текст. Он состоит из каких-то тестовых " +
                "слов и нужен для того, чтобы выполнить тестовое задание GB. " +
                "Данный текст не несет в себе какого-либо смысла, он просто содержит набор слов.";
        printStats(text);

    }
    static void printStats(String text) {
        // 1. Split текста, приведение его к нижнему регистру, удаление запятых и точек.
        String [] words = text.toLowerCase().replaceAll("[.,]","").split("\\s+");
        // 2. Сбор структуры со статистикой.
        Map<Integer, List<String>> stats = new TreeMap<>(); // Структура, в которой ключ - длина слова, значение - список таких слов.
        for (String word : words) {
            int length = word.replaceAll("-","").length();
            if (stats.containsKey(length)) {
                stats.get(length).add(word);
            }else {
                List<String> list = new ArrayList<>();
                list.add(word);
                stats.put(length, list);
            }
        }
        for (Map.Entry<Integer, List<String>> entry:stats.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }

}
