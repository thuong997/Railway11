package com.vti.backend;

import java.io.File;

import com.vti.ultis.FileUltis;

public class Ex3 {
	public static void question1() {
		System.out.println(FileUltis.isFileExist("C:\\assigment7\\lesson7.txt"));
	}

	public static void question2() {
		System.out.println(FileUltis.createNewFile("C:\\assigment7\\test7.txt"));
	}

	public static void question4() {
		File file = new File("C:\\assigment7.txt\\test7.txt");
		System.out.println(FileUltis.isFileExist("C:\\assigment7.txt\\test7.txt"));
		file.delete();
	}

	public static void question5() {
		System.out.println(FileUltis.isFolder("C:\\assigment7.txt"));

	}

	public static void question6() {
		FileUltis.getAllFileName("C:\\assigment7");
	}
	public static void question7() throws Exception {
		FileUltis.copyFile("C:\\assigment7\\lesson7.txt", "C:\\ass7\\", "test7.txt");
	}
	public static void question8() throws Exception {
		FileUltis.moveFile("C:\\assigment7\\noname.txt", "C:\\ass7\\");
	}

	public static void question9() throws Exception {
		FileUltis.renameFile("C:\\assigment7\\hihi.txt", "C:\\assigment7\\noname.txt");
	}

	public static void question10() throws Exception {
		FileUltis.createNewFolder("C:\\newAssigment7");
	}
}
