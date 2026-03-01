//  using access modifiers - private , public with real world example
// GetName --> returns data
// SetName --> sets data ( assign the value ) 
class MyEmployee {
    private int id;
    private String name;

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

public class Access_modifier {
    public static void main(String[] args) {
        MyEmployee abhi = new MyEmployee();
        // abhi.id = 90;
        // abhi.name = "abhi ram"; --> these throws an error due to private access
        // modifier
        abhi.setName("Abhi Ram");
        System.out.println(abhi.getName());
        abhi.setId(9211);
        System.out.println(abhi.getId());
    }
}
