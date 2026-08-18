package string.immutable;

public class TestApp1 {
	public static void main(String[] args) {
		
		String name1 = "henil";
		String name2 = "patel";
		String name3 = "cnpsale";
		String name4 = "henil";
		String name5 = name1;
		String name6 = name1.concat(name5);
		
		
		System.out.println(name1 == name2);//true  
        System.out.println(name1 == name3);//false
        System.out.println(name1 == name4);//false
        System.out.println(name1 == name5);//true
        System.out.println(name1 == name6);//false
        System.out.println(name2 == name3);//false
        System.out.println(name2 == name4);//false
        System.out.println(name2 == name5);//true
        System.out.println(name2 == name6);//false
        System.out.println(name3 == name4);//false
        System.out.println(name3 == name5);//false
        System.out.println(name3 == name6);//false
        System.out.println(name4 == name5);//false
        System.out.println(name4 == name6);//false
        System.out.println(name5 == name6);//false        
        
//        valueBased(.equals())
        System.out.println('\n');
        System.out.println(name1.equals(name2));//true
        System.out.println(name1.equals(name3));//false
        System.out.println(name1.equals(name4));//false
        System.out.println(name1.equals(name5));//true
        System.out.println(name1.equals(name6));//false
        System.out.println(name2.equals(name3));//false
        System.out.println(name2.equals(name4));//false
        System.out.println(name2.equals(name5));//true
        System.out.println(name2.equals(name6));//false
        System.out.println(name3.equals(name4));//false
        System.out.println(name3.equals(name5));//false
        System.out.println(name3.equals(name6));//false
        System.out.println(name4.equals(name5));//false
        System.out.println(name4.equals(name6));//true
        System.out.println(name5.equals(name6));//false
	}
}
