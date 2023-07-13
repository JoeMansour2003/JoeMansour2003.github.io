//save question 
import java.io.*;
import java.util.Scanner;
public class Savequestion extends Savequestion2
{

	public static void main(String args[])throws IOException
	{
		int i=0;
		String q="";
		char ch;
		FileWriter f1= new FileWriter("./Answer.txt",true);// file object for answer file(change the file location where you want to save the file)
		BufferedWriter bf1=new BufferedWriter(f1);
		FileWriter f2= new FileWriter("./CO.txt",true);//file object for question file (change the file location where you want to save the file)
		BufferedWriter bf2=new BufferedWriter(f2);
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the question");
		Savequestion2.doStuff("",sc.nextLine());
		System.out.println("Enter option (a)");
		Savequestion2.doStuff("(a) ",sc.nextLine());
		System.out.println("Enter option (b)");
		Savequestion2.doStuff("(b) ",sc.nextLine());
		System.out.println("Enter option (c)");
		Savequestion2.doStuff("(c) ",sc.nextLine());
		System.out.println("Enter option (d)");
		Savequestion2.doStuff("(d) ",sc.nextLine());

		
		System.out.println("Enter CO of the question(1,2,3,4)");
		q=sc.nextLine();//taking option d as input
		bf2.write("CO");
		bf2.write(q);//writing to the question file
		bf2.write("\n");
		
		System.out.println("Enter the correct option (a,b,c,d)");
		ch=sc.next().charAt(0);//taking answer as input
		bf1.write("\n");
		bf1.write(ch);//writing to the answer file


		bf1.close();//closing answer file
		bf2.close();//closing the CO file
	}
}