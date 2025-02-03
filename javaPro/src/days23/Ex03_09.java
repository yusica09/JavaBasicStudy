package days23;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import util.FileUtil;

/**
 * @author yusica
 * @data 2025. 1. 31. - 오후 3:16:57
 * @subject
 * @content
 */
public class Ex03_09 {
	
	public static void main(String[] args) {
		
		String parent = ".\\src\\days23";
		String child = "2. 시간표(20241223 KDT_AWS).pdf";
		
		File f = new File(parent, child);
		
		// > 파일크기 : 115902(bytes)
		// System.out.println("> 파일 크기 : " + f.length() + "(bytes)");
		
		// 10kb = 10*1024
		// 2. 시간표(20241223 KDT_AWS)_1.pdf
		// 2. 시간표(20241223 KDT_AWS)_2.pdf
		// 2. 시간표(20241223 KDT_AWS)_3.pdf
		// 						:
		// 2. 시간표(20241223 KDT_AWS)_12.pdf
		
		String baseName = FileUtil.getBaseName(child);
		String ext = FileUtil.getExtension(child);
		
		final int VOLUME = 10 * 1024; //10kb
		int data = 0;
		int i = 0; // _1.pdf
		int index = 0;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try(
				FileInputStream fis = new FileInputStream(f);
				BufferedInputStream bis = new BufferedInputStream(fis);
				){
			while ((data = bis.read()) != -1) {
				if(i%VOLUME == 0) {
					if(i != 0 ) bos.close(); //bos.flush()
					
					child = String.format("%s_%d%s", baseName, ++index, ext);
					System.out.println(child);
					
					File temp = new File(parent, child);
					fos = new FileOutputStream(temp);
				bos = new BufferedOutputStream(fos);
				}
			    bos.write(data);
	            i++;	
			} // while
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(" end ");
	}//main

}
