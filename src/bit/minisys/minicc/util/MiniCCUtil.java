package bit.minisys.minicc.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class MiniCCUtil {

	public static boolean checkFile(String filePath){
		File file = new File(filePath);
		if(!file.exists()){
			System.out.println("file " + file + " does not exist:");
			return false;
		}
		return true;
	}
	
	public static void createAndWriteFile(String file, String content){
		FileWriter fw;
		try {
			fw = new FileWriter(file, false);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
