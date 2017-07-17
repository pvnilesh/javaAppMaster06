package com.devops.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.devops.code.MyClass;

public class MyClassTest
{ 
  @Test
  public void testingGetStr(){
	  MyClass ob = new MyClass();
	  
	  assertEquals("return value of getStr must be Hello","Hello", ob.getStr());
  }

}