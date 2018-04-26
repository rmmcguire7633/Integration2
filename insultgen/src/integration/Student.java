package integration;

/**
 * using inheritance where class is the subclass and people is the super class.
 * Sharing the private variables from class people to class student.
 * @author Ryan McGuire
 *
 */
class Student extends People { 
  /**
   * constructor to set the student name and sex.
   * @param name of the student.
   * @param sex of the student.
   */
  public Student(String name, String sex) {
     super(name, sex);
  }
  
  public void override() {
    System.out.println("The name of the student is Bill Nye");
  }

}
