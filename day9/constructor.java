class MyMainEmployee {
    private int id;
    private String name;

    public MyMainEmployee() { // method 1 --> when no argument is given myname, myid
        id = 50;
        name = "1st name";
    }

    public MyMainEmployee(String myName, int myId) { // method 2 --> when argument is given
        id = myId;
        name = myName;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() { // returns value
        return id;
    }
}

public class constructor {
    public static void main(String[] args) {
        MyMainEmployee Abhi = new MyMainEmployee("abhi", 35); // return abhi,35

        // MyMainEmployee Abhi = new MyMainEmployee();
        /*
         * if no argument is passed then
         * it directly call 1st method
         * where value is assigned
         * return 1st name , 50
         */

        // Abhi.setName("Abhi");
        // Abhi.setId(90);

        System.out.println(Abhi.getId());
        System.out.println(Abhi.getName());
    }
}
