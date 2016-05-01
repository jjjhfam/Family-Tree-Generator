package jaker.familytree.main.people;

import java.util.ArrayList;

public class Person {
	
	private String firstName = null;
	private String middleName = null;
	private String lastName = null;
	private Male father = null;
	private Female mother = null;
	private Person spouse = null;
	private ArrayList<Male> sons = new ArrayList<Male>();
	private ArrayList<Female> daughters = new ArrayList<Female>();
	
	public Person() {
		
	}
	
	public Person(Male father) {
		this.father = father;
	}
	
	public Person(Female mother) {
		this.mother = mother;
	}
	
	public Person(Male father, Female mother) {
		this.father = father;
		this.mother = mother;
	}
	
	public void setName(String first, String last) {
		
	}
	
	public void setName(String first, String middle, String last) {
		
	}
	
	public void addSon(Male son) {
		sons.add(son);
	}
	
	public void addDaughter(Female daughter) {
		daughters.add(daughter);
	}
}
