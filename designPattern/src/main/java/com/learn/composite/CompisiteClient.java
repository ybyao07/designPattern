package com.learn.composite;

public class CompisiteClient {

	public static void main(String[] args) {
		AbstractFile folder1, folder2, folder3, txFile1, txFile2, imageFile1;
		folder1 = new FolderFile("Sunny的资料");
		folder2 = new FolderFile("文本文件夹");
		folder3 = new FolderFile("图片文件夹");
		
		txFile1 = new TextFile("文本1");
		txFile2 = new TextFile("文本2");
		
		imageFile1 = new ImageFile("图片1");
		folder2.add(txFile1);
		folder2.add(txFile2);
		folder3.add(imageFile1);
		
		folder1.add(folder2);
		folder1.add(folder3);
		
		folder1.killVirs();
	}
}
