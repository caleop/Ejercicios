package es.certificado.tema6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Generica {
	public static void main(String[] args) {
		File f = new File("src/file.txt");
		File f2 = new File("src/midirectorio");
		try {

			if (f.createNewFile()) {
				System.out.println("OK");
			} else {
				System.out.println("KO");
			}
			if (f2.mkdir()) {
				System.out.println("OK");
			} else {
				System.out.println("KO");
			}
			System.out.println(f.canRead());
			System.out.println(f.canWrite());
			System.out.println(f.exists());
			System.out.println(f2.exists());
			System.out.println(f.isFile());
			System.out.println(f2.isFile());
			System.out.println(f.isDirectory());
			System.out.println(f2.isDirectory());
			System.out.println(f.getName());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.getAbsoluteFile());
			System.out.println(f.getCanonicalPath());
			System.out.println(f.getCanonicalFile());
			//System.out.println(f.renameTo(new File("ile.txt")));
			//System.out.println(f.delete());
			System.out.println(f2.delete());
			FileReader fr = new FileReader(f);
			
			//Integer aux = fr.read();
			//System.out.println(aux.toString());
			BufferedReader bf = new BufferedReader(fr);
			FileWriter fw = new FileWriter(f);
			fw.write("tiriti");
			fw.flush();
			fw.close();
			Scanner sc = new Scanner(f);
			//System.out.println(bf.readLine());
			System.out.println(sc.next());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
