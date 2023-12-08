package ArrayOfObjects;

public class Student
{
    private String Name;
    private String Class1;
    private int Roll;
    private int Age;

    public Student(String name, String class1, int roll, int age) 
    {
        this.Name = name;
        this.Class1 = class1;
        this.Roll = roll;
        this.Age = age;
    }

    public String toString() {
        return "Student [Name=" + Name + ", Class=" + Class1 + ", Roll=" + Roll + ", Age=" + Age + "]";
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getClass1() {
        return Class1;
    }

    public void setClass(String Class1) {
        this.Class1 = Class1;
    }

    public int getRoll() {
        return Roll;
    }

    public void setRoll(int Roll) {
        this.Roll = Roll;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    
    
}
