import java.util.*;
class Calculate{
	public static void main(String[] args){
		int a , b;
		boolean check = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ������ ������� ����� ����� ");
        a = sc.nextInt();
        System.out.println("������� �������� + , - , * , / ");
        String oper = sc.next();
        check = checkOper(oper);
		System.out.println(check);
		
		
		//  javac Calculate.java
		//  java Calculate 2 3
	}
    private static void checkOper(String oper) {
      if(!(oper.equals("+")
         |oper.equals("-")
         |oper.equals("*")  
         |oper.equals("/"))
        )System.out.println("������������ ��������");
    }
    private static boolean checkOper(String oper) {
      if(!(oper.equals("+")
         |oper.equals("-")
         |oper.equals("*")  
         |oper.equals("/"))
        )return false;
		else return true;	
    }	
}