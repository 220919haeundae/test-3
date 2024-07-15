package com.kh.chap01_beforeVSafter.before.model.vo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.stream.Stream;

public class Run {

	public static void main(String[] args) {

		
		
		Tv t = new Tv("LG", "LG-s13", "LGTv", 300, 55);
		
		System.out.println(t.information());
		
		Desktop d = new Desktop("삼성", "SS-01", "삼성데스크탑", 200, true);
		
		System.out.println(d.information());
		
		SmartPhone sp = new SmartPhone();
		
		System.out.println(sp.information());
		
		String str = "123456789";
		
		Socket s = new Socket();
		
	}

}
