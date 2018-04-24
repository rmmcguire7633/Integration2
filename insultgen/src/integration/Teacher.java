package integration;

public class Teacher extends People {
  
  public Teacher(String name, String sex) {
    super(name, sex);
  }
  
  public void override() {
    System.out.println("The name of the teacher is Issac Newton");
  }
}
