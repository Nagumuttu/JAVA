package loops_in_java;

public class LoopsPractice {
public static void main(String[] args) {
	
	
	System.out.println("for loop");
	
	for(int i = 1; i<=10; i++ ) {
	System.out.println(i);
}
	for (int i = 5; i<=50; i+=5) {
		System.out.println(i);
	} 
	
	
	
	System.out.println("while loop");
	
	int i = 1;
	while(i<=10) {
		System.out.println(i);
		i++;
		}
	int j = 2;
	while(j<=10) {
		System.out.println(j);
		j+=2;
	}
	
	
	
	System.out.println("do while");
	
	 int i1 = 1;
	 do {
		 System.out.println(i1);
		 i1++;
	 } while(i1<=10);
	 
	 
	 int i2=11;
	 do {
		 System.out.println(i2);
		 i2+=2;
	 } while(i2<21);
	 }
		
	}
