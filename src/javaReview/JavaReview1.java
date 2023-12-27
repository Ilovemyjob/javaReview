package javaReview;

import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaReview1 {
	
	
	int secret =5;         // primitive type-sadece 8 tane var(stack memory)
							// alttaki reference type, yani baska clasin referansidir,asil degeri clasin icinde 
							//(stack=start referense degeri,heap memory= Date())  
	Date reference= new Date(); // ilk Date data type, new'le start objesi icin yer acilir hafizada, nerede Date classinda 
							// start objesi Date classinin ornegidir,instansidir
	
	static int secret2= 5; 
	static int a = 4;
	static int b = 2;
	static String string1= "String"; 
	static String string2= "String"; 
	
	
	
	
public static void main(String[] args) {
	System.out.println("1");//system class-out field - println method
	
	name("2");//void demek codu baska yere koymak ve cagirmak demek
	
	//ARRAY
	//1.way
	int[] reference2= new int[3];
	reference2[0] = 1;
	reference2[1] = 1;
	reference2[2] = 1;
	//2.way
	Integer[] reference3 = {2,2,2};
	String [] reference4 = {"a", "b", "c"};
	
	System.out.println(reference3.length);
	//1,way
	for (int i = 0; i < reference3.length; i++) {
		System.out.println(reference3[i]);
	}
	//2,way
	System.out.println(Arrays.toString(reference3));//
	
	System.out.println("-------");
	//ArrayList
	ArrayList<String> arrayList= new ArrayList<String>();//==List<String> list3 = new ArrayList<>();= resizable
	arrayList.add("2");
	
	// Array convert to List
	List<Integer> arrayList2= Arrays.asList(reference3);
	System.out.println(arrayList2.toString());
	
	
	System.out.println(arrayList);
	System.out.println("-----");
	
	//Operation
	secret2++;// secret2= secret2+1
	secret2--;
	secret2=secret2+2; //
	
	int Modulus = a%b;// remainder
	System.out.println(Modulus);
	
	//Concetination
	System.out.println(string1+string2);
	
	//Operation signs & If
	if (a==b) {    // == comparison for primitive
	
	}if (a!=b) {
		
	}if (a>=b) {
		
	}if (a<b && a==0) {
	}if (a<b & a==0) {// 2 times
		
	}if (a<b || a==0) {//or
		
	}if (string1.equals("string")) {//equal() for string
		
	}if (a!=3) {
		
		
	}
	//Ternary
	String message = a==4 ? "true" : "false";
	System.out.println(message);
	
	//Switch
	switch (a) {
	case 3:
		
		break;

	default:
		break;
	}
	//For
	for (int i = 0; i < reference4.length; i++) {
		
	}
	
//	Scanner​ ​scanner​ = ​new​ ​Scanner​(​System​.​in​);
//	​int​ ​secretNumber​ = ​1​ + (​int​) (​Math​.​random​() * ​10​);
//	​int​ ​guess​ = ​0​;
//	​while​ (​guess​ != ​secretNumber​) {
//	​guess​ = ​scanner​.​nextInt​();
//	}
	

	

	
	
	
	
	
}
public static void name(String name) {
	System.out.println(name);
	
}
}
