package com.hongying.bean;

/**
 * CREATE TABLE student(
	id int primary key not null auto_increment,
	name varchar(10),
	age int,
	score int,
	clsId int --所属班级ID
	)
 * @author Administrator
 *
 */
public class student {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getClsId() {
		return clsId;
	}
	public void setClsId(int clsId) {
		this.clsId = clsId;
	}
	private String name;
	private int age;
	private int score;
	private int clsId;
	
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("==================={");
		sb.append(String.format("id:%s,name:%s,age:%s,score:%s,clsId:%s", id,name,age,score,clsId));
		sb.append("}===================");
		return sb.toString();
	}
}
