import java.util.Scanner;

public class io {
    public static void main(String[] args) {
       System.out.println("Taking input from the user!");

      //TO TAKE INPUT FROM THE USER 
     Scanner sc = new Scanner(System.in);
         // System.out.println("Enter number 1:");
         // int a = sc.nextInt();
       float a = sc.nextFloat();
          // System.out.println("Enter number 2:");
          // int b = sc.nextInt();
       float b = sc.nextFloat();
          // int sum = a+b;
        float sum = a + b;
     System.out.println("The sum of the numbers is: " + sum);


             //   TO CHECK NEXT VALUE IS INT OR NOT 
    //    boolean b1 = sc.hasNextInt();
    //    System.out.println(b1);


             //TO CHECK FOR STRING INPUT 
         String str = sc.nextLine();    // FOR FULL LINE STRING OR text READ we use nextline() & IF ONLY NEXT USED IT READ ONLY 1ST WORD
         System.out.println(str);
    }
}
