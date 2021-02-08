package com.feiyangedu.sample;

public class Main {

	public static void main(String[] args) throws Exception {
		Class cls =null;
		if(true){
			cls = Class.forName("com.feiyangedu.sample.Student");
		}else{
			cls = Class.forName("com.feiyangedu.sample.Teacher");
		}
		System.out.println("class name: " + cls.getName());
		System.out.println("class simple name: " + cls.getSimpleName());
		System.out.println("package name: " + cls.getPackage().getName());
		System.out.println("is interface? " + cls.isInterface());
		// Student s = new Student();
		Hello s = (Hello) cls.newInstance();
		s.hello();
	}

}
