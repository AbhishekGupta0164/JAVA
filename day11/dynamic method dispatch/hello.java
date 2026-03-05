
class Phone {
    public void showTime() {
        System.out.println("Good Morning, it's 8 A.M");
    }

    public void on() {
        System.out.println("Turning on Phone");
    }
}

class SmartPhone extends Phone {
    public void music() {
        System.out.println("Swag se karege sabka swagat");
    }

    public void on() { // overridden
        System.out.println("Turning on SmartPhone");
    }
}

public class hello {
    public static void main(String[] args) {
        // Phone obj = new Phone(); // allowed t create this object
        // SmartPhone sobj = new SmartPhone(); //allowed to create this object
        // sobj.music();

        // reference of superclass = obj of sub class
        Phone obj = new SmartPhone(); // It is allowed, super class to derived class object creation on run time
                                      // (polymorphism)
        obj.showTime();
        obj.on(); // this function run on sub class because object is of sub class(Smartphone)

        // SmartPhone obj2 = new Phone(); // Not allowed, derived class to super class
        // object creation

        // JISKA OBJECT USKE METHOD SE RUN HOGA
    }
}
