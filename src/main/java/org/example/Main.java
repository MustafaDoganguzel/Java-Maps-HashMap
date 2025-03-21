package org.example;


import org.example.entity.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new LinkedList<>();
        employeeList.add(new Employee(1, "mustafa", "Doganguzel"));
        employeeList.add(new Employee(1, "mustafa", "Doganguzel"));
        employeeList.add(new Employee(2, "Bilge", "Doganguzel"));
        employeeList.add(new Employee(3, "Peri", "Doganguzel"));
    }

  public static List<Employee> findDuplicates(List<Employee> employeeList){
        Set<Employee> uniques = new HashSet<>(); // hashSet unique olmayanlarin disinda eleman tutmaz
        List<Employee> duplicates = new ArrayList<>(); //

        for(Employee e : employeeList){
            if(!uniques.add(e)){
                duplicates.add(e);
            }
        } return duplicates;
  }

  public static Map<Integer, Employee> findUniques(List<Employee> employeeList){
        Map<Integer, Employee> uniqueMap = new HashMap<>();
        for (Employee emp : employeeList){
            if(emp != null ) {
                uniqueMap.put(emp.getId(),emp);
            }
        } return uniqueMap;
  }
//  public static List<Employee> findUniques(List<Employee> employeeList){
//        Set<Employee> uniqueSet = new HashSet<>();
//        List<Employee> notUnique = new ArrayList<>();
//
//        for (Employee e : employeeList){
//            if (uniqueSet.add(e)){
//                notUnique.add(e);
//            }
//            return notUnique;
//        }
//  }
//public static List<Employee> removeDuplicates(List<Employee> employeeList){
//        List<Employee> uniqueList = new ArrayList<>();
//
//        for (Employee e : employeeList){
//            if (e != null && Collections.frequency(employeeList,e) == 1 ){
//                uniqueList.add(e);
//            }
//        } return uniqueList;
//}
public static List<Employee> removeDuplicates(List<Employee> employeeList){
        Set<Employee> uniqueSet = new HashSet<>();
        Set<Employee> duplicates = new HashSet<>();
        List<Employee> unique = new ArrayList<>();

        for (Employee e : employeeList){
            if (e != null && !uniqueSet.add(e) ){
                duplicates.add(e);
            }
        }

        for (Employee e : employeeList){
            if (e != null && !duplicates.contains(e)){
                unique.add(e);
            }
        }
                return unique;
}



}
