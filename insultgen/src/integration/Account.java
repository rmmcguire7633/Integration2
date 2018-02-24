//Ryan McGuire
package integration;

public class Account {
  private String name;

  // method header. The parameter is String name.
  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
  private String userName;
  private int age;
  private double wealthValue;
  public String getUserName() {
    return userName;
  }
  public int getAge() {
    return age;
  }
  public double getWealthValue() {
    return wealthValue;
  }
  Account (){
    
  }
  Account (String userName){
    this.userName =userName;
  }
  Account (String userName, int age){
    this.userName = userName;
    this.age = age; 
  }
  Account (String userName, int age, double wealthValue){
    this.userName = userName;
    this.age = age;
    this. wealthValue = wealthValue;
  } 
 }
