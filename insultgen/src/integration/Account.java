package integration;

/**
 * Stores the name, age and wealth value of a person.
 * @author Ryan McGuire
 *
 */
class Account {
  private String name;

  /**
   * Sets the name of the person.
   * @param name of the person.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Get the name of the person.
   * @return name of person.
   */
  public String getName() {
    return name;
  }
  
  private String userName;
  private int age;
  private double wealthValue;
  
  /**
   * gets the user name.
   * @return the user name.
   */
  public String getUserName() {
    return userName;
  }
  
  /**
   * get the age of the user.
   * @return the age of the user.
   */
  public int getAge() {
    return age;
  }
  
  /**
   * get the wealth value of the user.
   * @return the wealth value of the user.
   */
  public double getWealthValue() {
    return wealthValue;
  }
  
  /**
   * blank constructor holder.
   */
  Account(){}
  
  /**
   * Constructor used to set user name.
   * @param userName to set the user name.
   */
  Account(String userName) {
    this.userName = userName;
  }
  
  /**
   * constructor used to set user name and user age.
   * @param userName to set the user name.
   * @param age to set the user age.
   */
  Account(String userName, int age) {
    this.userName = userName;
    this.age = age; 
  }
  
  /**
   * constructor used to set user name, age, and wealth value.
   * @param userName to set the user name.
   * @param age to set the user age.
   * @param wealthValue to set the user wealth value.
   */
  Account(String userName, int age, double wealthValue) {
    this.userName = userName;
    this.age = age;
    this. wealthValue = wealthValue;
  } 
}