package jaker.familytree.main.people;

import java.awt.Dimension;
import java.util.ArrayList;

public class Person {
	
	private final String firstName = null;
	private final String middleName = null;
	private final String lastName = null;
	private Male father = null;
	private Female mother = null;
	private final ArrayList<Male> sons = new ArrayList<Male>();
	private final ArrayList<Female> daughters = new ArrayList<Female>();
	
	public Person() {
		
	}
	
	public Person(Male father) {
		this.father = father;
	}
	
	public Person(Female mother) {
		this.mother = mother;
	}
	
	public Person(Male father, Female mother) {
		this();
		
		this.father = father;
		this.mother = mother;
		
		
	}
}
