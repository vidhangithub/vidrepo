package com.vidhan.classruntimetest;

public class VidhanMain {

	public static void main(String[] args) throws Exception{
		vidhanInterface vi = (vidhanClassOne)Class.forName(args[0]).newInstance();
		vi.testMe();

	}

}
