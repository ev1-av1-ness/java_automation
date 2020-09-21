package ru.alextests;


//здесь понятно, сколько раз нужно выполнить действие в цикле (i++ с условием)
public class Primes {
  //простое число - такое число, которое делится только на себя и на 1
  public static boolean isPrime(int n) {
  //делим от 2 до n-1
    for (int i = 2; i < n; i++) { //i += 5 (любое другое число кроме 1)
       if(n % i == 0) {
         return false; //досрочное окончание цикла и выход из функции
       }
    }
    return true;
  }
//ту же функцию попробуем написать с while
  public static boolean isPrimeWhile(int n) {
    int i = 2;
    while (i < n) { //&& n % i != 0 //i += 5 (любое другое число кроме 1)
      if(n % i == 0) {
        return false; //досрочное окончание цикла и выход из функции
      }
      i++;
    }
    return true;
  }

  public static boolean isPrime(long n) { //длинное целое число
    //делим от 2 до n-1
    //int m = (int) Math.sqrt(n); //хотим преобразовать результат от n --> в точно int m явное преобразование
    for (int i = 2; i < n; i++) { //i += 5 (любое другое число кроме 1)
      if(n % i == 0) {
        return false; //досрочное окончание цикла и выход из функции
      }
    }
    return true;
  }
}
