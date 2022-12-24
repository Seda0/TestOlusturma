package Test;

import java.util.Scanner;

public class Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Teste Hos Geldiniz");
    String soru1;
    String soru2;
    String soru3;
    String soru4;
    String soru5;
    
    Scanner sc =new Scanner(System.in);
    System.out.println("Hangi ulke en cok sera gazi yaymaktadir?");
    String sls[]={"A-Cin","B-Hindistan","C-Amerika","D-Japonya"};
    for(int counter=0;counter<sls.length;counter++) {
    System.out.println(sls[counter]);
    }
    System.out.print("cevabinizi giriniz..");
    String s1 = sc.nextLine();
    Object sl = null;
	if (sl.equals("A")) 
	{
    	System.out.print("dogru");
    }
	else {
		System.out.print("yanlis");
				}
	
	 Scanner sc1 =new Scanner(System.in);
	    System.out.println("Hangi gezegenin atmosferi küresel ısınma ile yok edilmektedir?");
	    String sls1[]={"A-Jüpiter","B-Venüs","C-Mars","D-Merkür"};
	    for(int counter=0;counter<sls1.length;counter++) {
	    System.out.println(sls1[counter]);
	    }
	    System.out.print("cevabinizi giriniz..");
	    String s2 = sc1.nextLine();
	    if (sl.equals("B")) 
		{
	    	System.out.print("dogru");
	    }
		else {
			System.out.print("yanlis");
					}
	    Scanner sc11= new Scanner(System.in);
		System.out.println("Hangi tür ampul en az enerjiyi tüketir?");
	    String sls11[]={"A-Akkor Ampul","B-Halojen Ampul","C-Kompakt Florasan Ampul","D-Ampul"};
	    for(int counter=0;counter<sls11.length;counter++) {
	    System.out.println(sls11[counter]);
	    }
	    System.out.print("cevabinizi giriniz..");
	    String s21 = sc11.nextLine();
	    if (sl.equals("c")) 
		{
	    	System.out.print("dogru");
	    }
		else {
			System.out.print("yanlis");
	
	
    
    }
    
    
    
    
	    Scanner sc111= new Scanner(System.in);
		System.out.println("");
	    String sls111[]={"A-Akkor Ampul","B-Halojen Ampul","C-Kompakt Florasan Ampul","D-Ampul"};
	    for(int counter=0;counter<sls111.length;counter++) {
	    System.out.println(sls111[counter]);
	    }
	    System.out.print("cevabinizi giriniz..");
	    String s211 = sc111.nextLine();
	    if (sl.equals("c")) 
		{
	    	System.out.print("dogru");
	    }
		else {
			System.out.print("yanlis");
    
    
    
		
	
   
	
	}
	}}
