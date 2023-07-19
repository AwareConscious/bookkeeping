package org.bookkeeping;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        if (args[0].equals("help")) {
            System.out.println("" +
                    "bookkeeping [OPTIONS] COMMAND\n\n" +
                    "Commands:\n" +
                    "add    :adds new employee to employee registry\n" +
                    "delete :deletes employee from employee registry\n" +
                    "edit   :edits existed employee\n" +
                    "list   :lists all employees in registry\n" +
                    "help   :shows this help message");
        }

        if (args[0].equals("add")) {

            employee.setId(1);
            System.out.println("Enter employee first name: ");
            employee.setFirstName(scanner.nextLine());
            System.out.println("Enter employee second name: ");
            employee.setSecondName(scanner.nextLine());
            System.out.println("Enter employee last name: ");
            employee.setLastName(scanner.nextLine());
            System.out.println("Enter employee salary: ");
            employee.setSalary(new BigDecimal(scanner.nextLine()));
            System.out.println("Enter employee permanent premium: ");
            employee.setPermanentPremium(new BigDecimal(scanner.nextLine()));
            System.out.println("Is employee has residence of Kazakhstan (y/n): ");
            employee.setResidentOfKazakhstan(scanner.nextLine().equals("y"));
            System.out.println("Enter employee employment date in format dd.mm.yyyy: ");
            String date = scanner.nextLine();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            try {
                //Parsing the String
                Date date2 = dateFormat.parse(date);
                employee.setEmploymentDate(date2);
            } catch (ParseException e) {
                System.out.println("ERROR: Date parsing failed ");
                e.printStackTrace();
            }
            System.out.println("" +
                    "Employee: " + employee.getFirstName() + " " + employee.getSecondName() + " " +
                    employee.getLastName() + " successfully added to registry");
        }

        if (args[0].equals("list")) {
            System.out.println(employee.getFirstName() + " " + employee.getSecondName() + " " +
                    employee.getLastName() + " " + employee.getId() + " " + employee.getSalary() +
                    " " + employee.getPermanentPremium() + employee.isResidentOfKazakhstan() + " " +
                    employee.getEmploymentDate());
        }
    }
}
