package main.java.com.network;

public class Person {
    String name = "undefined"; // Name of person
    Page page; //Page of person

    Person(){}

    public Person(String name){
        this.name=name;
        this.page = new Page();
    }

    public Person(String name, int color){
        this.name = name;
        this.page=new Page(color);
    }

    public String getName(){
        return name;
    }

    public int getColor(){ return page.color; }
}
