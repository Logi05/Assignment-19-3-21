package test4;

import org.w3c.dom.Text;

public class StringsHand {
public static void main(String args[]) {
	String s1=null;
	String s2="Logi";
	String s4="";
	String s5="Shiva Gopal";
	
	if(s4.isEmpty())
	{
		System.out.println("Empty String:"+s4);
	}
	else
	{
		System.out.println("Not an Empty String");
	}
	if(s2.isEmpty())
	{
		System.out.println("Empty String");
	}
	else
	{
		System.out.println("Not an Empty String:"+s2);
	}
	if(s5.contains("gopal"))
	{
		System.out.println("String present:"+s5);
	}
	else
	{
		System.out.println("String not present");
	}
	if(s5.contains("Gopal"))
	{
		System.out.println("String present:"+s5);
	}
	else
	{
		System.out.println("String not present");
	}
	if(s1.isEmpty())
	{
		System.out.println("Empty String");
	}
	else
	{
		System.out.println("Not an Empty String");
	}
	
	/*if(s2.isEmpty())
	{
		System.out.println("Empty String");
	}
	else
	{
		System.out.println(s2);
	}*/
	
}
}
