package com.alfa.work3;

import java.util.Scanner;

public class Runner {
    public void run() {
        MyTranslator translator = new MyTranslator();
        addSomeWords(translator);
        addWords(translator);
        translateFraze(translator);
    }

    public void addWords(MyTranslator translator) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите английское слово и русский перевод через пробел или stop! для завершения ввода.");
            String word = sc.nextLine();
            if (word.equalsIgnoreCase("stop!")) break;
            String[] words = word.split(" ");
            if (words.length == 2) {
                translator.addWord(words[0], words[1]);
            } else {
                System.out.println("Данные введены неверно!");
            }
        }
        System.out.println("Ввод слов завершен.");
    }

    public void translateFraze(MyTranslator translator) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите фразу для перевода или stop! для завершения ввода.");
            String fraze = sc.nextLine();
            if (fraze.equalsIgnoreCase("stop!")) break;
            System.out.println(translator.translate(fraze));
        }
        System.out.println("Перевод завершен.");
    }

    private void addSomeWords (MyTranslator translator) {
        translator.addWord("cat", "кошка");
        translator.addWord("walk", "гуляет");
        translator.addWord("outside", "на улице");

    }
}
