package models;

public class Formation {
	
	private String title;
	private String program;
	private int nbStudent;
	
	/**constructor of a formation
	 * 
	 * @param title title of formation
	 * @param program program of formation
	 * @param nbStudent number of admitted student
	 */
	public Formation(String title, String program, int nbStudent) {
		this.setTitle (title);
		this.setProgram (program);
		this.setNbStudent (nbStudent);
	}

	//getters & setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getNbStudent() {
		return nbStudent;
	}

	public void setNbStudent(int nbStudent) {
		this.nbStudent = nbStudent;
	}
	
	
}
