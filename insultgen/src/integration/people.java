//Ryan McGuire
//This is my superclass
package integration;

class people {
  private static String name;
  private String sex;
  
 public people (String name, String sex) {
   setName(name);
   setSex(sex);
 }
 public void setName (String name) {
   this.name = name;
 }
 public String getName() {
   return name;
 }
 public void setSex(String sex) {
   this.sex = sex;
 }
 public String getSex() {
   return sex;
 }
 public void override() {
   System.out.println("The of the person is ");
 }
  
  

}
