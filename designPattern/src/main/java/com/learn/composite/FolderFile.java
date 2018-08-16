package com.learn.composite;

import java.util.ArrayList;

public class FolderFile extends AbstractFile {

	private String name;
	private ArrayList<AbstractFile> files = new ArrayList<AbstractFile>();
	
	public FolderFile(String name) {
		this.name = name;
	}

	@Override
	public void add(AbstractFile file) {
		// TODO Auto-generated method stub
		files.add(file);
	}

	@Override
	public void remove(AbstractFile file) {
		// TODO Auto-generated method stub
		files.remove(file);
	}

	@Override
	public AbstractFile get(int i) {
		// TODO Auto-generated method stub
		return files.get(i);
	}

	@Override
	public void killVirs() {
		// TODO Auto-generated method stub
        System.out.println("****对文件夹'" + name + "'进行杀毒");  //模拟杀毒  
		for (AbstractFile abstractFile : files) {
			abstractFile.killVirs();
		}
	}

}
