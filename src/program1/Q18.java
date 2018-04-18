package program1;

public class Q18 {

	public static void main(String[] args)
	{
String s1="hello";
String s2="hi";

if(s1.length()==s2.length())
{
	System.out.println(s1.concat(s2));
}
else if(s1.length()> s2.length())
	{
		s1=s1.substring(s1.length()/2,s1.length());
		System.out.println(s1.concat(s2));
	}
	else
	{
		s2=s2.substring(s2.length()/2,s2.length());
		System.out.println(s1.concat(s2));
}

}

}
