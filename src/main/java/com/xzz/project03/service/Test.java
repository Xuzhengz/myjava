package com.xzz.project03.service;

import com.xzz.project03.domain.Employee;

/**
 * @author 徐正洲
 * @date 2022/5/18-20:16
 */
public class Test {
    public static void main(String[] args) {
        NameListService nameListService = new NameListService();
//        Employee[] allEmployees = nameListService.getAllEmployees();
//        for (int i = 0; i < nameListService.getAllEmployees().length; i++) {
//            System.out.println(allEmployees[i]);
//        }
        try {
            Employee employee = nameListService.getEmployee(100);
            System.out.println(employee);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
    }

}