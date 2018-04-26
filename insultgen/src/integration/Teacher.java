package integration;

/**
 * subclass of the superclass "People" class.
 * sets the name and sex for the object Teacher.
 * @author Ryan McGuire
 *
 */
public class Teacher extends People {
  
  /**
   * constructor used to set the name and sex of the teacher.
   * @param name of the teacher.
   * @param sex of the teacher.
   */
  public Teacher(String name, String sex) {
    super(name, sex);
  }
  
  public void override() {
    System.out.println("The name of the teacher is Issac Newton");
  }
}
