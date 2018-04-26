package integration;

/**
 * Used as a superclass for Student and Teacher class.
 * @author Ryan McGuire
 *
 */

class People {
  private String name;
  private String sex;
  
  /**
   * constructor to set name and sex of person.
   * @param name of the person.
   * @param sex of the person (male, female or what ever they identify with).
   */
  public People(String name, String sex) {
    setName(name);
    setSex(sex);
  }
 
  /**
   * sets the of the person.
   * @param name of the person.
   */
  public void setName(String name) {
    this.name = name;
  }
 
  /**
   * gets the name of the person.
   * @return the name of the person.
   */
  public String getName() {
    return name;
  }
 
  /**
   * sets the sex of the person.
   * @param sex of the person.
   */
  public void setSex(String sex) {
    this.sex = sex;
  }
 
  /**
   * gets the sex of the person.
   * @return the sex of the person.
   */
  public String getSex() {
    return sex;
  }
 
  /**
   * displays the name the person.
   */
  public void override() {
    System.out.println("The name of the person is " + getName());
  }
}
