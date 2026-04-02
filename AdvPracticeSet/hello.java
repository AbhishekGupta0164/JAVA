import java.io.FileWriter;
import java.io.IOException;

class MyDeprecated {
    @Deprecated
    void meth1() {
        System.out.println("I am method 1");
    }
}

interface MyInt {
    void display();
}

public class hello {
    public static void main(String[] args) {
        // MyDeprecated d = new MyDeprecated();
        // d.meth1();
        // MyInt i = () -> System.out.println("I am display fn");

        int i = 19;
        String table = "";
        for (int j = 0; j <= 10; j++) {
            table += (i + "*" + (j + 1) + " = " + i * (j + 1));
            table += "\n";
        }

        // writing a table in a file
        try {
            FileWriter filewriter = new FileWriter("MultiplicationTable.txt");
            filewriter.write(table);
            filewriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
