package compsci;

public class Diploma{
	protected String name;
	protected String course;
	
	public Diploma(String name, String course){
		this.name = name;
		this.course = course;
	}
	public String toString(){
		return "This certifies that " + name + "\n" + "has completed a course in " + course;
	}
	
}