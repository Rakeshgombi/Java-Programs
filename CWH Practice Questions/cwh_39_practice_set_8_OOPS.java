/*
1)
Create a class Employee with the following properties and methods:
Salary (property) (int)
getSalary (method returning int)
name (property) (String)
getName (method returning String)
setName (method changing name)

*/

class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
}

/*
2)
Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.

*/

class cellPhone{
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void vibrating(){
        System.out.println("Vibrating...");
    }
    public void call(){
        System.out.println("Calling...");
    }
}

/*

3) Create a class Square with a method to initialize its side, calculating area, perimeter etc.

*/

class Square{
    int side;

    public int area(){
        return side * side;
    } 

    public int perimeter(){
        return side * 4;
    }
}

/** 4) Create a class Rectangle & problem 3. */
class Rectangle{
    int length;
    int breadth;

    public int area(){
        return length * breadth;
    } 

    public int perimeter(){
        return 2 * (length + breadth);
    }
}

/** 5) Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc.*/

class TommyVecetti{
    public void running(){
        System.out.println("Tommy is Running...");
    }
    public void firing(){
        System.out.println("Tommy is Firing...");
    }
    public void hitting(){
        System.out.println("Tommy is Hitting...");
    }
}

class Circle{
    int radius;

    public double area(){
        return 3.142 * radius * radius;
    }

    public double perimeter(){
        return 2 * 3.142 * radius;
    }
}

public class Program
{
    public static void main(String[] args) {

        /*
        
        Problem 1

		Employee rocky = new Employee();
        rocky.salary = 35000;
        rocky.setName("Rakesh Gombi");
        System.out.println(rocky.getName());
        System.out.println(rocky.getSalary());

        */

        /*
        
        Problem 2

        cellPhone asus = new cellPhone();
        asus.call();
        asus.ringing();
        asus.vibrating();

        */

        /* 
        
        Problem 3

        Square sq = new Square();
        sq.side = 3;
        System.out.println("Area of a Square is: " + sq.area());
        System.out.println("perimeter of a Square id: " + sq.perimeter());

        */

        /*

        Problem 4

        Rectangle re = new Rectangle();
        re.length = 2;
        re.breadth = 4;
        System.out.println("Area of a Rectangle is: " + re.area());
        System.out.println("perimeter of a Rectangle is: " + re.perimeter());
        
        */

        /*
        
        Problem 5
        TommyVecetti tommy = new TommyVecetti();
        tommy.running();
        tommy.hitting();
        tommy.firing();

        */

        /*

        Problem 6
        Circle ci = new Circle();
        ci.radius = 3;
        System.out.println("Area of a Circle is: " + ci.area());
        System.out.println("perimeter of a Circle is: " + ci.perimeter());

        */

	}
}
