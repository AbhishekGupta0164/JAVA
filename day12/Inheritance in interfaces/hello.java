// Inheritance in Interface 
// we can inherit parent interface in derived interface in only like 
// interface_childInterfaceName_extends_baseinterfaceName 
// we cannot create class in place of interface it doesnot allowes

interface sampleInterface {
    void meth1();

    void meth2();
}

interface childSampleInterface extends sampleInterface {

    void meth3();

    void meth4();
}

class SampleClass implements childSampleInterface {
    public void meth1() {
        System.out.println("meth1");
    }

    public void meth2() {
        System.out.println("meth2");
    }

    public void meth3() {
        System.out.println("meth3");
    }

    public void meth4() {
        System.out.println("meth4");
    }
}

public class hello {
    public static void main(String[] args) {
        SampleClass sc = new SampleClass();
        sc.meth1();
        sc.meth2();
        sc.meth3();
        sc.meth4();
    }
}
