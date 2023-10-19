package com.tns.accessspecifiers;

import com.tns.demo.Student;

public class StudentAchievements extends Student {
	private String achievement;

	public String getAchievement() {
		return achievement;
	}

	public void setAchievement(String achievement) {
		this.achievement = achievement;
	}

	public StudentAchievements(String achievement) {
		this.achievement = achievement;
	}

	public StudentAchievements() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentAchievements(int id, String name, float per, String achievement) {
		super(id, name, per);
		this.achievement=achievement;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		//id - private can't accessible
		name="Pankaja";// - protected accessible within subclass def within another package
		//per - default not accessible within subclass def within another package
		return "StudentAchievements [achievement=" + achievement + ", name=" + name + ", per=" + getPer() + ", id="
				+ getId() + "]";
	}
	
}
