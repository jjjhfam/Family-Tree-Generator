package jaker.familytree.main.people;

import java.util.ArrayList;

public class Person {
	
	private String firstName = null;
	private String middleName = null;
	private String lastName = null;
	
	private Male father = null;
	private Female mother = null;
	
	private ArrayList<Male> sons = new ArrayList<Male>();
	private ArrayList<Female> daughters = new ArrayList<Female>();
	private ArrayList<Person> spouses = new ArrayList<Person>();

	private int generation;
	private static int numberOfPeople = 0;
	// Constructors are based on names
	
	public Person() {
		numberOfPeople++;
	}
	
	public Person(final String firstName, final String lastName) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Person(final String firstName, final String middleName, final String lastName) {
		this(firstName, lastName);
		this.middleName = middleName;
	}
	
	// Set parents
	
	public void setFather(final Male father) {
		this.father = father;
	}
	
	public void setMother(final Female mother) {
		this.mother = mother;
	}
	
	public void setParents(final Male father, final Female mother) {
		setFather(father);
		setMother(mother);
	}
	
	// Add children
	
	public void addSon(final Male son) {
		this.sons.add(son);
	}
	
	public void addDaughter(final Female daughter) {
		this.daughters.add(daughter);
	}
	
	// Add spouse(s)
	
	public void addSpouse(final Person spouse) {
		this.spouses.add(spouse);
	}
}
