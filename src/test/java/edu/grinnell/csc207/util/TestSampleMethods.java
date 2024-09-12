package edu.grinnell.csc207.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Tests of the sample methods.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class TestSampleMethods {
  /**
   * A test that should succeed.
   */
  @Test
  void sampleSuccesfulTest() {
    assertEquals(2, 2);
  } // sampleSuccessfulTest()

  /**
   * A test that should fail.
   */
  void sampleFailingTest() {
    assertEquals(2, 3);
  } // sampleFailingTest()

  public void test2() {
    assertEquals(10, 3*5, "stupid test");  } // test2()

  @Test
  public void test3(){
    assertEquals(32, SampleMethods.c2f(0), "If 0C = 32F");
  }

  @Test
  public void test4(){
    assertEquals(212, SampleMethods.c2f(100), "If 100C = 212F");
  }

  int[] values = { 1, 2, 3 };
  int[] values2 = {0, 0, 0, 0, 0,};
  int[] values3 = {};
  

  @Test
  public void test5(){
    assertEquals(6, SampleMethods.sum(values), "If 6 = 6");
  }

  @Test
  public void test6(){
    assertEquals(0, SampleMethods.sum(values2), "If 0 = array of 0's");
  }
  
  @Test
  public void test7(){
    assertEquals(0, SampleMethods.sum(values3), "0 = empty set");
  }

  @Test
  public void test8(){
    int expected = 1;
    for(int power = 0; power < 10; power++){
      assertEquals(expected, SampleMethods.expt(2, power), "If 6 = 6");
      expected *= 2;
    }
  } //test8
    
  @Test
  public void test9(){
    int expected = 1;
    for(int power = 0; power < 10; power++){
      assertEquals(expected * power, SampleMethods.expt(expected, power), "If 6 = 6");
      expected *= -2;
    }
  } //test9

  /**
   * Check that removeAs works as expected.
   */
  @Test
  public void testRemoveAs() {
    assertEquals("", 
                 SampleMethods.removeAs(""),
                 "empty string");
    assertEquals("hello", 
                 SampleMethods.removeAs("hello"),
                 "no as");
    assertEquals("", 
                 SampleMethods.removeAs("a"),
                 "eliminate one a");
    assertEquals("", 
                 SampleMethods.removeAs("aaaa"),
                 "eliminate many as");
    assertEquals("pin", 
                 SampleMethods.removeAs("pain"),
                 "eliminate one a, short string");
    assertEquals("lphbet", 
                 SampleMethods.removeAs("alphabet"),
                 "eliminate many as, medium string");
    assertEquals("BCDEFGHIJKLMNOPQ",
                 SampleMethods.removeAs("aBaaCDaaaEFGaaaaHIJKaaaaLMNaaaOPaaQa"),
                 "eliminate many as, silly string");
    assertEquals("bbb",
                 SampleMethods.removeAs("aaabbbaaa"),
                 "eliminate prefix and suffix as");
  } // testRemoveAs
  
    
} // class TestSampleMethods
