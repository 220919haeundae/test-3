package com.kh.practice;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IO05_DataInputStream {

	public static void main(String[] args) {
		File f = new File("./resources", "DataSample");
		
		DataInputStream dis = null;
		
		try {
			dis = new DataInputStream(
					new BufferedInputStream(
							new FileInputStream(f)
							)
					);
			System.out.println("[1]" + dis.read());
			System.out.println("[2]" + dis.readBoolean());
			System.out.println("[3]" + dis.readChar());
			System.out.println("[4]" + dis.readInt());
			System.out.println("[5]" + dis.readDouble());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			
		}
		
		
	}

}
