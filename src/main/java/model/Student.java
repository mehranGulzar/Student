package model;

public class Student {


    private String name;

    private int age;

    private String city;


    public Student(String name, int age, String city){
        this.name = name;
        this.age = age;
        this.city = city;
        System.out.println(toString());
    }

    public String toString(){
        return (name +" " + age +" " + city) ;
    }


    ////////////    SETTER METHODS
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCity(String city){
        this.city = city;
    }



    //////////////GETTER METHODS
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getCity(){
        return this.city;
    }


}
