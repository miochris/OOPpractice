package com.fdmgroup.io;

import java.io.IOException;

public class test {
	public static void main(String[] args) throws IOException {
		CountChar cc = new CountChar("/Users/Ludovic/Desktop/testword.txt");

		cc.readFile('a');

		// System.out.println(cc.getChuf().toString());

	}

}
