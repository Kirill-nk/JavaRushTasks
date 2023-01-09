package com.javarush.task.pro.task06.task0616;

/* 
Учет работников
*/

public class Solution {
    public String name = "Amigo";
    private String position = "Java developer";
    public int salary = 10_000;

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.name + " " + solution.position + " " + solution.salary);
        solution.setPosition("Домохозяйка");
        solution.setSalary(5);
        System.out.println(solution.name + " " + solution.position + " " + solution.salary);
    }
}
