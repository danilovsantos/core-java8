package com.java.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ReadFileInJava7 {
	
	public static void main(String[]args){
		
		try {
			
			System.out.println(Calendar.getInstance().getTimeInMillis());
			System.out.println(Runtime.getRuntime().totalMemory());
			
			Path path = FileSystems.getDefault().getPath("C:/Users/dvsantos1/Desktop/mockdata.csv");
			InputStream is = Files.newInputStream(path);
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			List<String> lines = new ArrayList<String>();
			
			String line = null;
			
			while((line = br.readLine()) != null){
				lines.add(line);
			}
			
			System.out.println(Calendar.getInstance().getTimeInMillis());
			System.out.println(Runtime.getRuntime().totalMemory());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
