package ru.alextests;

public class Equation {
  private double a;
  private double b;
  private double c;

  //D = b*b - 4ac
  //  D < 0; 0 решений
  //  D = 0; 1 решение
  //  D > 0; 2 решения

  private int n; //количество решений

  public Equation (double a, double b, double c) {
    //alt enter
    //параметры их скобок хочу присвоить в одноименные поля


    this.a = a;
    this.b = b;
    this.c = c;

    double d = b*b - 4*a*c; //будем анализировать, чтобы присвоить в атрибут, который мы назовем n -
    //количество решений

/*    if (d > 0) {
       n = 2;
    } else {
      if (d == 0) {
        n = 1;
      } else {
        n = 0;
      }
    }
   */

    if (d > 0) {
      n = 2;
    } else if (d == 0) {
        n = 1;
     } else {
        n = 0;
     }
    }
//при наличии блока else никакие лишние проверки не выполняются


  public int howManyDecisions () {
    return n;
  }
}
