package com.vti.ultis;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.MalformedInputException;
import java.nio.file.Files;
import java.util.List;

public class FileUltis {
	public static boolean isFileExist(String pathFile) {
		File file = new File(pathFile);

		return file.exists();
	}

	public static boolean createNewFile(String pathFile) {
		if (isFileExist(pathFile)) {
			return false;
		} else {
			File file = new File(pathFile);

			try {
				return file.createNewFile();
			} catch (IOException e) {

				return false;
			}

		}

	}

	public static boolean isFolder(String path) {
		File file = new File(path);
		return file.isDirectory();
	}

	public static void isFolderOrFile(String pathFile) {
		File file = new File(pathFile);

		if (file.isDirectory()) {
			System.out.println("đây là folder");
		} else if (file.isFile()) {
			System.out.println("đây là file");
		} else {
			System.out.println("đây không phải đường dẫn nào");
		}

	}

	public static boolean deleteFile(String pathFile) {
		File file = new File(pathFile);
		file.delete();
		return file.exists();
	}

	// show danh sách file
	public static void getAllFileName(String path) {// Question6 EX3
		File file = new File(path);
		if (file.isDirectory()) {
			System.out.println("Danh sách file:");
			for (String fileName : file.list()) {

				System.out.println(fileName);
			}
		}
	}

	// copy file sang folder mới--- vẫn đang lỗi
	public static void copyFile(String sourceFile, String distinationPath, String newName) throws Exception {
		try {
			if (isFileExist(sourceFile)) {
				FileInputStream file = new FileInputStream(sourceFile);
				String contentAll = readFile(sourceFile);
				System.out.println(contentAll);
				System.out.println(distinationPath + newName);
				file.close();
				// kiểm tra thư mục muốn copy file là new name đã tồn tại chưa
				if (!isFileExist(distinationPath + newName)) {
					//
					writeFile(distinationPath + newName, contentAll);
				}
			}
		} catch (Exception e) {

		}

	}

	// vẫn đang lỗi
	public static void moveFile(String sourceFile, String destinationPath) throws Exception {
		try {
			if (isFileExist(sourceFile)) {
				File file1 = new File(sourceFile);
				System.out.println(file1.getName());
				
				FileInputStream file = new FileInputStream(sourceFile);
				String contentAll = readFile(sourceFile);
				System.out.println(contentAll);
				System.out.println(destinationPath + file1.getName());
				file.close();
				// kiểm tra thư mục muốn copy file là new name đã tồn tại chưa
				if (!isFileExist(destinationPath + file1.getName())) {
					//
					writeFile(destinationPath + file1.getName(), contentAll);
					file1.delete();
				}else {
					System.out.println("tên file đã tồn tại bạn k thể di chuyển tới folder này" );
				}
			}
		} catch (Exception e) {

		}
	}

	// đổi tên file
	public static void renameFile(String pathFile, String newName) throws Exception {
		if (isFileExist(pathFile) == false) {
			throw new Exception("file không tồn tại ");
		}
		if (isFileExist(newName)) {
			throw new Exception("tập tin mới tồn tại");
		}
		File oldFile = new File(pathFile);
		File newFile = new File(newName);
		oldFile.renameTo(newFile);
	}

	// tạo mới folder
	public static void createNewFolder(String newPathFolder) throws Exception {
		if (isFolder(newPathFolder) == true) {
			throw new Exception("folder này đã tồn tại");
		} else if (isFolder(newPathFolder) == false) {
			new File(newPathFolder).mkdir();
		}
	}

//	public boolean downloadFile(String link, String folderSave) throws MalformedInputException, IOException {
//		//kiểm tra folder đã tồn tại chưa
//		File folder = new File(folderSave);
//		if (!folder.exists() || !folder.isDirectory()) {
//			System.out.println("folder not exist or not folder");
//
//		}
//		return false;
//		// nếu tệp tin đã tồn tại thì lấy tên tệp
//		String[] s = link.split("/");
//		String name = s[s.length - 1];
//		folderSave = folderSave + "/" + name;
//		//create connection to URL
//		URL url = new URL(link);
//		//open connection
//		URLConnection connection = url.openConnection();
//		//lấy kích thước của tệp
//		int size = connection.getContentLength();
//		//
//
//	}

	// EX4 IO Stream
	// Đọc dữ liệu trong file theo số ký tự chỉ định trong byte[]
	public static String readFile(String pathFile) {
		try {
			FileInputStream fileInputStream = new FileInputStream(pathFile);
			if (isFileExist(pathFile)) {
				byte[] b = new byte[10];

				int length = fileInputStream.read(b);
				// System.out.println(length);
				String contentAll = "";
				while (length > -1) {
					String content = new String(b, 0, length);
					contentAll += content;
					// contentAll = contentAll + content;
					length = fileInputStream.read(b);
				}
				System.out.println(contentAll);
				fileInputStream.close();
				return contentAll;
			}
		} catch (Exception e) {

		}
		return "";

	}

	// chèn dữ liệu vào file
	public static void writeFile(String pathFile, String content) {
		try {
			FileOutputStream file = new FileOutputStream(pathFile, true);
			// true thì sẽ ghi vào cuối chuỗi
			// false thì sẽ xóa hết dữ liệu cũ vào trèn dữ liệu mới
			if (isFileExist(pathFile)) {
				file.write(content.getBytes());
			}
		} catch (Exception e) {

		}

	}

	public static void writeObject(Object object, String path, String fileName) throws Exception {
		if (isFileExist(path) == false) {
			throw new Exception("file chưa tồn tại");
		} else if (isFileExist(path) == true) {
			System.out.println("nhập file name: ");
			fileName = ScannerUltils.inputString();
			path = path + "\\" + fileName;
			FileOutputStream out = new FileOutputStream(path);
			ObjectOutputStream objectOut = new ObjectOutputStream(out);
			objectOut.writeObject(object);
			out.close();
			objectOut.close();
			System.out.println("compelete");
		}

	}
}
