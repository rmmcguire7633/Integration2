package integration;

public class teacher extends people {
  public teacher (String name, String sex){
    super(name, sex);
  }
  public void override() {
    System.out.println("The name of the teacher is Issac Newton");
  }

}
