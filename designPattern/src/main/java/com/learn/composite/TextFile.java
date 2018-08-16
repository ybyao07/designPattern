package com.learn.composite;

public class TextFile extends AbstractFile {

	private String name;
	public TextFile(String name) {
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
		System.out.println("******* kill text file " + name + "杀毒");
	}

}
