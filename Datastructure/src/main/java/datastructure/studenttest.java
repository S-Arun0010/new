package datastructure;
import java.util.*;
import java.util.logging.Logger;
class student {
     String name;
     int age;
     double gpa;
    public student()
    {
        name = null;
        age = 0;
        gpa = 0.0;
    }
    public void setValue(String n,int a,double g)
    {
        this.name = n;
        this.age = a;
        this.gpa = g;
    }
    public String toString()
    {
        return  "Name :" + name + " |Age :" + age +" |Gpa :" + gpa;
    }
    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return this.age;
    }
    public double getGpa()
    {
        return this.gpa;
    }
}
public class studenttest {
    public static void main(String args[])
    {   
    	
    	Logger l =Logger.getLogger("com.api.jar");
        ArrayList<student> list = new ArrayList<>();
        student a = new student();
        student b = new student();
        student c = new student();
        student d = new student();
        student e = new student();
        student f = new student();
        a.setValue("Arun  ",21,8.72);
        b.setValue("Aksh  ",20,8.73);
        c.setValue("Prabu ",20,9.11);
        d.setValue("Partha",22,9.01);
        e.setValue("shiv  ",23,7.99);
        f.setValue("Naruto",20,8.92);
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        list.add(f);
        for(int i=0;i<list.size();i++)
        {
             System.out.println(list.get(i));
        } 
        Comparator<student> compareBygpa = new Comparator<student>()
        {
     	       public int compare(student o1, student o2) 
     	         {
	                Double obj1 = new Double(o1.getGpa());
                    Double obj2 = new Double(o2.getGpa());
		            return (obj2.compareTo(obj1));
	             }
        };

        Collections.sort(list,compareBygpa);
        for(int i=0;i<list.size();i++)
        {   
        	 l.info("Name : " + list.get(i).getName()+ " " +"|Gpa : "+ list.get(i).getGpa());
        } 
    }
}