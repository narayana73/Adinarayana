package com.cog.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="findMemberByName", query="select m from Member m where m.name =:name")
public class Member {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Member(String name) {
		super();
		this.name = name;
	}
	
	public Member(){
		
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}

}
