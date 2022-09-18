package com.xzz.project03.service;

import com.xzz.project03.domain.*;

import static com.xzz.project03.service.Data.*;

/**
 * @author 徐正洲
 * @date 2022/5/18-10:12
 * <p>
 * 负责将data中的数据封装到Employee[]数组中，提供相关操作数组的方法。
 */
public class NameListService {
    private Employee[] employees;


    //给employee 及数组元素初始化
    public NameListService() {
        employees = new Employee[EMPLOYEES.length];

        for (int i = 0; i < employees.length; i++) {
            //获取员工的类型
            int type = Integer.parseInt(EMPLOYEES[i][0]);
            //获取Employee的基本信息
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);
            Equipment equipment;
            double bonus;
            int stock;

            //当type等于各种职业的时候，就去创建各种职业的对象，封装到数组当中。
            switch (type) {
                case EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case PROGRAMMER:
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary, equipment);
                    break;
                case DESIGNER:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id, name, age, salary, equipment, bonus);
                    break;
                case ARCHITECT:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
                    break;
            }
        }

    }

    private Equipment createEquipment(int i) {
        int index = Integer.parseInt(EQUIPMENTS[i][0]);

        switch (index) {
            case PC://21
                return new PC(EQUIPMENTS[i][1], EQUIPMENTS[i][2]);
            case NOTEBOOK://22
                return new NoteBook(EQUIPMENTS[i][1], Double.parseDouble(EQUIPMENTS[i][2]));
            case PRINTER://23
                return new Printer(EQUIPMENTS[i][1], EQUIPMENTS[i][2]);
        }
        return null;
    }

    public Employee[] getAllEmployees() {
        return employees;

    }

    public Employee getEmployee(int id) throws TeamException {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() ==id) {
                return employees[i];
            }
        }
        throw new TeamException("没有找到该员工信息");
    }


}