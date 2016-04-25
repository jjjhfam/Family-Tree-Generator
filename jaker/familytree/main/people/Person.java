package jaker.familytree.main;

import java.awt.Dimension;
import java.util.ArrayList;

public class Person {
	
	private final String firstName = null;
	private final String middleName = null;
	private final String lastName = null;
	private final Person father = null;
	private final Person mother = null;
	private final ArrayList<Person> sons = new ArrayList<Person>();
	private final ArrayList<Person> daughters = new ArrayList<Person>();
	
	private Dimension area;
	
	public Person() {
		
	}
	
	public Person(Person parent) {
		
	}
	
	public Person(Person parentOne, Person parentTwo) {
		this();
	}
}
