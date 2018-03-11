package org.ey.bpm.recruit.lord.model;

import java.util.UUID;

public class CandidateData {
	
	private String id = UUID.randomUUID().toString();
	
	private String name;
	private String skills;
	private String level;
	private String yearsOfExp;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getYearsOfExp() {
		return yearsOfExp;
	}
	public void setYearsOfExp(String yearsOfExp) {
		this.yearsOfExp = yearsOfExp;
	}

}
