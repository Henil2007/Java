package string.immutable;

public class TestApp2 {
	
	public static void main(String[] args) {
		//  System.out.println("2. By String 'new' Keyword way  [RAM---->HEAP] :- ");
		//      System.out.println("-----------------------------------------------");

	    String name7 = new String("jay");
	    String name8 = new String("jay");
	    String name9 = new String("techno");
	    String name10 = name7;

	    System.out.println("Object Equality:- : ");
	    System.out.println("------------------------");

	    System.out.println("name7==name8   : " + (name7 == name8));
	    System.out.println("name7==name9   : " + (name7 == name9));
	    System.out.println("name7==name10  : " + (name7 == name10));
	    System.out.println("name8==name9   : " + (name8 == name9));
	    System.out.println("name8==name10  : " + (name8 == name10));
	    System.out.println("name9==name10  : " + (name9 == name10));
	    
	    System.out.println("valueBased(.equals()) : ");
	    System.out.println("-------------------------------");

	    System.out.println("name7.equals(name8)   : " + name7.equals(name8));
	    System.out.println("name7.equals(name9)   : " + name7.equals(name9));
	    System.out.println("name7.equals(name10)  : " + name7.equals(name10));
	    System.out.println("name8.equals(name9)   : " + name8.equals(name9));
	    System.out.println("name8.equals(name10)  : " + name8.equals(name10));
	    System.out.println("name9.equals(name10)  : " + name9.equals(name10));
	}
}
