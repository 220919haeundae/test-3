package com.kh.practice.score.model.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ScoreDAO {
	File file = new File("./resources", "studentInfo.txt");
	
	public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(file, true)
							)
					);
			dos.writeChars(name);
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(math);
			dos.writeInt(sum);
			dos.writeDouble(avg);
			dos.flush();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				dos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	public DataInputStream readScore() throws FileNotFoundException, IOException {
		File file = new File("./resources", "studentInfo.txt");
		
		return new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
		
		
		
	}

}
