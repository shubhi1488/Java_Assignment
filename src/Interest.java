import java.util.Objects;
import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter gender ");
        String gender=sc.nextLine();
        System.out.println("enter age");
        int age=sc.nextInt();
        if(Objects.equals(gender, "Female") && age>=1 && age<=58){
            System.out.println("percentage of interest is:8.2%");

        }
        else if(Objects.equals(gender, "Female") && age>=59 && age<=100){
            System.out.println("percentage of interest is:9.2%");
        }
        else if(Objects.equals(gender, "Male") && age>=1 && age<=58 ){
            System.out.println("percentage of interest is:8.4%");
        }
        else if(Objects.equals(gender, "Male") && age>=59 && age<=100){
            System.out.println("percentage of interest is:10.5%");
        }



    }
}
