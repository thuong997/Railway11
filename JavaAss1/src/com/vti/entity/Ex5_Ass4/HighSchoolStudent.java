package com.vti.entity.Ex5_Ass4;

public class HighSchoolStudent extends Student {
	private String clazz;
	private String desiredUniversity;
		
	public HighSchoolStudent(String name, int id) {
		super(name, id);
		
	}
	

	public HighSchoolStudent(int id, String name, String clazz, String desiredUniversity) {
		super(name, id);
		this.clazz = clazz;
		this.desiredUniversity = desiredUniversity;
	}

	@Override
	public String toString() {
		return "HighSchoolStudent [clazz=" + clazz + ", desiredUniversity=" + desiredUniversity + ", id=" + id
				+ ", name=" + name + "]";
	}

}
