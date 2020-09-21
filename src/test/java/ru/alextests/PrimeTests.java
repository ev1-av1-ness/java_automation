package ru.alextests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeTests {
  @Test
  public void TestPrimes () {
    Assert.assertTrue(Primes.isPrime(Integer.MAX_VALUE));

  }

  @Test(enabled = false)
  public void TestPrimesLong () {
    long n = Integer.MAX_VALUE; //преобразовали значение в тип long
    Assert.assertTrue(Primes.isPrime(n));

  }


  @Test
  public void TestNonPrimes () {
    Assert.assertFalse(Primes.isPrime(Integer.MAX_VALUE - 2));

  }
}
