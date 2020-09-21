package ru.alextests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {
  public static void main(String[] args) {
    //String[] langs = new String[4]; //объявлена переменная langs типа массив строк String[] - тип
    //элементов, которые могут храниться в этом массиве
    //размер 4 элемента при конструировании
    //заполняем
//    langs[0] = "Java";
//    langs[1] = "Python";
//    langs[2] = "C#";
//    langs[3] = "PHP";

    String[] langs = {"Java", "Python", "C#", "PHP"};
    for (int i = 0; i < langs.length; i++) { //length - аттрибут
      System.out.println("Я хочу выучить: " + langs[i]);
    }

    List<String> languages = new ArrayList<String>(); //интерфейс = конкретный класс, который реализует
    languages.add("Java"); //размер списка - 1
    languages.add("Python");
    languages.add("C#");

    for (String l1 : languages) { //переменная l - это не индекс, это ссылка на элемент массива
      System.out.println("Я хочу выучить: " + l1); //для списков тоже работает
    }
    //этот интерфейс
    //для интерфейса List существует несколько разных реализаций
    //одна из таких реализаций - ArrayList
    //размер списка при создании равен 0
    //доб. удал элементы из списка - размер будет меняться
    //размер массива заранее известен
    //Специально для коллекций в языке Java есть особая конструкция цикла
    for (String l : langs) { //переменная l - это не индекс, это ссылка на элемент массива
      System.out.println("Я хочу выучить: " + l); //переменная l последовательно указывает на все элементы
      //этой коллекции
      //указатель на нужный элемент массива, рассчитывать не нужно
      //для каждого элемента l массива langs нужно выполнить {}
      //есть специальные классы для работы с java коллекциями
      //java.util
      //Interface Collection -> Interface List (упорядоченные коллекции): могут повторяющиеся элементы
      //Interface Collection -> Interface Set (множество): посчитать кол-во элементов,
      //перебрать все элементы, но нельзя взять элемент по индексу, потому что порядок элементов
      //не определен. все элементы уникальны. множество при добавлении дубликата не изменится
      //у этих интерфейсов есть классы, которые их реализуют (например ArrayList)
      //+ вспомни коллекцию Map

    }
//если попробовать обратиться к 4 --> exception --> индекс выходит за пределы массива
    //преобразовать массив --> в список
    List<String> languages1 = Arrays.asList("Java", "Python", "C#", "PHP"); //строки передаем как параметры
    //как будто аналог вызова в {} массива

    for (int i = 0; i < languages1.size(); i++) { //length - аттрибут
      System.out.println("Я хочу выучить: " + languages1.get(i)); //не langs[i]
    }

    //List languages2 = Arrays.asList("Java", "Python", "C#", "PHP");
    //тогда
    //for (Object l : languages2) { //переменная l - это не индекс, это ссылка на элемент массива
    //      System.out.println("Я хочу выучить: " + l);

  }
}
