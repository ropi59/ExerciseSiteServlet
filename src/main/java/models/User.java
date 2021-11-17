package models;

public class User {

	private String name;
	private String firstname;
	private int age;
	private int note;
	private String formation;
	
	/**constructor of a user
	 * 
	 * @param name name of user
	 * @param firstname firstname of user
	 * @param age age of user
	 */
	public User(String name, String firstname, int age, int note, String formation) {
		this.setName(name);
		this.setFirstname (firstname);
		this.setAge (age);
		this.setNote(note);
		this.setFormation(formation);
	}


	//getters & setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}
	
	public String getFormation() {
		return formation;
	}

	public void setFormation(String formation) {
		this.formation = formation;
	}
}
