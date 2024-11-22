package Bai14;

import java.util.Scanner;

public class Person {
    protected String name, ns, place;

    public Person() {
    }

    public Person(String name, String ns, String place) {
        this.name = name;
        this.ns = ns;
        this.place = place;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNs() {
        return ns;
    }

    public void setNs(String ns) {
        this.ns = ns;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    
    public void nhap()
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("nhap ten : ");
    	name = sc.nextLine();
    	System.out.println("nhap ns : ");
    	ns= sc.nextLine();
    	System.out.println("dia chi : ");
    	place = sc.nextLine();
    }
    public void in()
    {
    	System.out.println(" ten : " + name);
    	System.out.println("ns : " + ns);
    	System.out.println("dia chi : " + place);
    }
@Override
	public String toString() {
		return "Person [name=" + name + ", ns=" + ns + ", place=" + place + "]";
	}
}