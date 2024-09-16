package se.tommy.PersonObjekt;

public class Person {
    //ATTRIBUT
    private String name;
    private int age;
    private String yrke;
//KONSTRUKTOR
    public Person(String name, int age, String yrke) {
        this.name = name;
        this.age = age;
        this.yrke = yrke;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getYrke() {
        return yrke;
    }

    public void setYrke(String yrke) {
        this.yrke = yrke;
    }

    public String info() {
         return "Name " + name + ", " + "Age " + age + ", " + "Yrke, " + yrke;
    }

    public void changeJob(String newJob) {
        this.yrke = newJob;
    }



}
