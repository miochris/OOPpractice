package com.fdmgroup.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class CountChar {
	// private String toString;
	private File file;
	// private String fileAddress;

	public CountChar(String fileAddress) {
		this.file = new File(fileAddress);

	}

	char[] chuf = null;

	public char[] getChuf() {
		return chuf;
	}

	private static int count = 0;

	public void readFile(char letter) throws IOException {
		BufferedReader in = null;

		// String line =null;
		// StringBuilder stringBuilder = new StringBuilder();

		try {
			// bis = new BufferedInputStream(new FileInputStream(file));
			in = new BufferedReader(new FileReader(file));
			int ch;
			while ((ch = in.read()) >= 0) {
				// System.out.println(in.read());
				if (ch == (int) letter) {

					// char character = (char) ch;
					count += 1;
				}

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			if (in != null) {
				in.close();
			}
		}
		System.out.println("letter " + letter + " appears " + count + " times");

	}

	// public String getToString() {
	// return toString;
	// }

}
