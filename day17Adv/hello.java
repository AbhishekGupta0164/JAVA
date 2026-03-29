/*   
@author Abhishek 
@version 0.1
@see <a href="https="https://docs.oracle.com/javase/8/docs/api/java/lang/System.html">System</a>
 */
public class hello {
    /**
     * @param a
     * @param b
     * @return
     */
    public void add(int a, int b) {
        System.out.println("the sum is:  " + a + b);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        hello obj = new hello();
        obj.add(5, 7);
        System.out.println("Main");
    }
}