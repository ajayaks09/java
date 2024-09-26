package student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;
import java.lang.reflect.Array;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

public class upload{
public int age=20;
public static String name="ajay";
	public static void main(String ar[]) {
		StringBuffer buf=new StringBuffer("ajay kumar");
		System.out.println(buf.reverse());
		int a[]=new int[10];
		a[0]=10;
		a[1]=20;
		List d=new ArrayList();
		d.add(20);
		d.add(10);
		d.forEach((get)->{
			System.out.println(get);
		});
		System.out.println(a[1]);
		int b[][]= {{1,2,3,4,45,5},{4,23,4,5,56,3,455,63,32,55,35,33,5}};
		System.out.println(b[0][4]);
		System.out.println(b[1].length); 
		ak();
		upload c=new upload();
		System.out.println("enter:");
		Scanner s=new Scanner(System.in);
		String ak=s.nextLine();
	
	}
	public static List<upload> run(){
		List<upload> up=new ArrayList<upload>();
		upload a=new upload();
		a.name="Akshaya";
		a.age=17;
		up.add(a);
		return up;
		
	}
public static String ak() {
	String a="Akshaya";
	return a;
}
public upload(){
	System.out.println("hi");
	String a="akshaya";
	int b=a.length();
	for(int c=1;c<=b;c++) {
		int d=b-c;
		System.out.print(a.charAt(d));
	}
}
}
class task{
	public static void main(String ar[]) {
		leftRotate();
	}
	public static void swap(int a,int b){
		int c=b;
		b=a;
		a=c;
		System.out.println("a is:"+a);
		System.out.println("b is:"+b);
		System.out.println(5/2);
	}
	public static void binary(int a) {
		int[] b=new int[1000];
		int i=0;
		while(a>0) {
			b[i]=a%2;
			a=a/2;
			i++;
		}
		   for (int j = i-1 ; j >=0; j--) {
	            System.out.print(b[j]);
		   }
	}
	public static void factorial(int a) {
		int i,n=1;
		for(i=2;i<=a;i++) {
			n*=i;
		}
		System.out.println("Factorial is:   "+n);
	}
public static void evenAdd(int a) {
	int c=a%2;
	if(c==0&&a>0) {
		System.out.println("Even number");
	}
	else {
		System.out.println("Add number");
	}
}
public static void largeNumber(int a,int b,int c) {
	int ans=a>(b>c?b:c)?a:(b>c?b:c);
	System.out.println("Large Number Between This Three is :  "+ans);
}
public static void LeapYear(int a){
	if(a%4==0&&a%100!=0||a%400==0)
		System.out.println("Leap Year");
	else
		System.out.println("Not Leap Year");
}
public static void leftRotate() {
  Scanner s=new Scanner(System.in);
//	int get=0;
//	int b=10;
//	int div=get/b;
//	System.out.println(div);
  int i=0;
  int b=0;
  int a[]=new int[5];
  System.out.println("Enter Number To Add Into Array:");
 for( i=0;s.hasNext();i++) {
	 b=s.nextInt();
	 if(b!=0) {
	 a[i]=b;
	 }
	 else {
		 break;
	 }
 }
 for(int c:a) {
	 if(c!=0) {
	 System.out.print("        "+c);
	 }
 }
 System.out.println("\nhow many numbers you want to left rotate:");
 int leftShift=s.nextInt();
 if(leftShift!=0) {
	 ArrayList list=new ArrayList();
	 for(int j=0;j<a.length;j++) {
		 if(a[j]!=0) {
	 list.add(a[j]);
		 }
	 }
	 int d=0;
	 ArrayList list1=new ArrayList();
	 while(d<leftShift) {
		list1.add(list.getFirst());
		list.removeFirst();
		list.addLast(list1.getFirst());
		list1.removeFirst();
		d++;
	 }
	 System.out.println(list);
 }
}
}