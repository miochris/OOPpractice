package com.fdmgroup.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Register {

	static String fileAddress = "/Users/Ludovic/Desktop/info.txt";

	public static void main(String[] args) throws IOException {
		File file = new File(fileAddress);
		System.out.print("Please input your name: ");

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

//		FileWriter f = new FileWriter(new File(fileAddress));
		FileWriter f = new FileWriter(file,true);
		PrintWriter p = new PrintWriter(f);
		p.write("\n");
		p.append(str);
		

		System.out.print("Please input your address: ");
		String str2 = sc.nextLine();
		p.append(", ");
		p.append(str2);

		
		System.out.print("Please input your email: ");
		String str3 = sc.nextLine();
		p.append(", ");
		p.append(str3);

		
		sc.close();
		p.close();
	}

}
