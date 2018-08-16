package com.learn.composite;

public class ImageFile extends AbstractFile {

	private String name;
	
	public ImageFile(String name) {
		this.name = name;
	}

	@Override
	public void add(AbstractFile file) {
		// TODO Auto-generated method stub
		System.out.println("不支持此操作");
	}

	@Override
	public void remove(AbstractFile file) {
		// TODO Auto-generated method stub
		System.out.println("不支持此操作");
	}

	@Override
	public AbstractFile get(int i) {
		// TODO Auto-generated method stub
		System.out.println("不支持此操作");
		return null;
	}

	@Override
	public void killVirs() {
		// TODO Auto-generated method stub
		System.out.println("******* kill image file " + name + "杀毒");
	}

}
