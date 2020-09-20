package ru.alextests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EquationTests {

  @Test
  public void test0 () {

    Equation e = new Equation(1, 1, 1);
    Assert.assertEquals(e.howManyDecisions(), 0); //сравниваем с 0
// а получить значение атрибута как можем? нужно return n с помощью отдельного метода

  }

  @Test
  public void test1 () {

    Equation e = new Equation(1, 2, 1);
    Assert.assertEquals(e.howManyDecisions(), 1); //сравниваем с 0
// а получить значение атрибута как можем? нужно return n с помощью отдельного метода

  }

  @Test
  public void test2 () {

    Equation e = new Equation(1, 5, 6);
    Assert.assertEquals(e.howManyDecisions(), 2); //сравниваем с 0
// а получить значение атрибута как можем? нужно return n с помощью отдельного метода

  }


}
