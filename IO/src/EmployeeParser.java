import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeParser {
    public static void main(String args[]) throws IOException{

        //retrieve all the records into a new array
        Scanner in = new Scanner(new FileInputStream("/Users/ymxing/non-work/JAVA_Practice/data/Employee.csv"), "UTF-8");
        ArrayList<Employee> staffs = readData(in);

    }

    private static ArrayList<Employee> readData(Scanner in) {
        ArrayList<Employee> staffs = new ArrayList<Employee>();
        while (in.hasNext()){
            String row = in.nextLine();
            String[] info = row.split("\\|");
            String name = info[0];
            Double salary = Double.parseDouble(info[1]);
            int year = Integer.parseInt(info[2]);
            int month = Integer.parseInt(info[3]);
            int day = Integer.parseInt(info[4]);
            staffs.add(new Employee(name, salary, year, month, day));
        }
        return staffs;
    }
}
