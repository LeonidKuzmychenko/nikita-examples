package project9;

import java.util.ArrayList;
import java.util.List;

import static project9.Constants.MIN_GRADE_BUDGET;
import static project9.Constants.MIN_GRADE_CONTRACT;


public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new BudgetStudent("John", 5));
        list.add(new BudgetStudent("Ivan", 3));
        list.add(new ContractStudent("Sara", 4));
        list.add(new ContractStudent("Nick", 2));

        List<Student> passedList = new ArrayList<>();
        List<Student> notPassedList = new ArrayList<>();

        for (Student student : list) {
            if (student instanceof BudgetStudent bs && bs.getGrade() >= MIN_GRADE_BUDGET) {
                passedList.add(student);
                continue;
            }

            if (student instanceof ContractStudent cs && cs.getGrade() >= MIN_GRADE_CONTRACT) {
                passedList.add(student);
                continue;
            }

            notPassedList.add(student);
        }

        System.out.println("Passed list:" + passedList);
        System.out.println("Not Passed list:" + notPassedList);

    }

}
