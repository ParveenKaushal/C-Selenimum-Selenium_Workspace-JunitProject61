package selenium;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;




public class Testing3 {
	
	@Rule
	public ErrorCollector err =new ErrorCollector();
	

	@Test
	public void test6() {
		
		
		String expected ="abc";
		String actual="abc1";
		
		/*if(expected.equals(actual))
		{
			System.out.println("testpass");
		}
		else
		{
			System.out.println("testfail");
		}*/
		
	System.out.println("before assertion");
	try {
	Assert.assertEquals(expected, actual);
	}
	catch(Throwable t)
	{
		err.addError(t);
	System.out.println("i am in catch1");
	}
	System.out.println("after first assert");
	try {
	Assert.assertTrue("verify 2>3", 2>3);
	}
	catch(Throwable t)
	{
		err.addError(t);
	System.out.println("after assert2");
	}
	
	
	}
	

}
