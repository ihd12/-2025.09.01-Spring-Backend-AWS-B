package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.Part;

public class FileUtil {
	public static String uploadFile(HttpServletRequest req,String sDirectory) 
		throws ServletException, IOException{
		// Part : 파일 데이터를 사용하기 위한 변수 생성
		Part part = req.getPart("ofile");
		// partHeader=form-data;name="ofile";filename="파일이름.확장자"
		// 위의 문자열을 partHeader 변수에 저장 
		String partHeader = part.getHeader("content-disposition");
		// 파일이 여러개인 경우 배열에 파일이름 저장
		String[] phArr = partHeader.split("filename=");
//		"파일이름.확장자" 에 있는 큰따움표 삭제 후 파일이름 저장
		String originalFileName = phArr[1].trim().replace("\"", "");
		if(!originalFileName.isEmpty()) {
			part.write(sDirectory + File.separator + originalFileName);
		}
		return originalFileName;
	}
	public static String renameFile(String sDirectory, String fileName) {
		String ext = fileName.substring(fileName.lastIndexOf("."));
		String now = new SimpleDateFormat("yyyyMMdd_HmsS").format(new Date());
		String newFileName = now + ext;
		File oldFile = new File(sDirectory + File.separator + fileName);
		File newFile = new File(sDirectory + File.separator + newFileName);
		oldFile.renameTo(newFile);
		return newFileName;
		
	}
}









