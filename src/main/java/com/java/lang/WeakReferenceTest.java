package com.java.lang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class WeakReferenceTest {

	public static void main(String[] args) {
				
		try {

			System.out.println(Runtime.getRuntime().totalMemory());

			Path path = FileSystems.getDefault().getPath("C:/Users/dvsantos1/Desktop/mockaroo-data.csv");
			InputStream is = Files.newInputStream(path);
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			List<WeakReference<String>> lines = new ArrayList<WeakReference<String>>();
			
			String line = null;
			
			while((line = br.readLine()) != null){
				lines.add(new WeakReference<String>(line));
			}

			System.out.println(Runtime.getRuntime().totalMemory());

		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
