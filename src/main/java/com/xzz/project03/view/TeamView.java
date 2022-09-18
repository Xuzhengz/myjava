package com.xzz.project03.view;

import com.xzz.project03.domain.Employee;
import com.xzz.project03.domain.Programmer;
import com.xzz.project03.service.NameListService;
import com.xzz.project03.service.TeamException;
import com.xzz.project03.service.TeamService;


/**
 * @author 徐正洲
 * @date 2022/5/18-21:06
 */
public class TeamView {
    private NameListService nameListService = new NameListService();
    private TeamService teamService = new TeamService();

    public void enterMainMenu() {
        char selection = 0;
        boolean isFlag = true;
        while (isFlag) {
            if (selection != '1') {
                listAllEmployees();
            }
            System.out.print("1-团队列表 2-添加团队成员 3-删除团队成员 4-退出 请选择(1-4)：");
            selection = TSUtility.readMenuSelection();
            switch (selection) {
                case '1':
                    getTeam();
                    break;
                case '2':
                    addMember();
                    break;
                case '3':
                    deleteMember();
                    break;
                case '4':
                    System.out.print("是否退出(Y/N)：");
                    char isExit = TSUtility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;
                    }
            }
        }


    }

    private void listAllEmployees() {
        System.out.println("---------------------------开发团队调度软件---------------------------");
        Employee[] allEmployees = nameListService.getAllEmployees();
        System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
        for (int i = 0; i < allEmployees.length; i++) {
            System.out.println(allEmployees[i]);
        }
        System.out.println("-----------------------------------------------------------------\n");

    }

    private void getTeam() {
        Programmer[] programmers = teamService.getProgrammers();
        if (programmers == null || programmers.length == 0) {
            System.out.println("开发团队目前没有成员");
        } else {
            System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票");
            for (int i = 0; i < programmers.length; i++) {
                System.out.println(programmers[i].getDetailForTeam());
            }
        }

    }

    private void addMember() {
        System.out.print("请输入需要添加的员工ID：");
        int id = TSUtility.readInt();
        try {
            Employee employee = nameListService.getEmployee(id);
            teamService.addMember(employee);
            System.out.println("添加成功");
        } catch (TeamException e) {
            System.out.println("添加失败，原因：" + e.getMessage());
        }
        TSUtility.readReturn();

    }

    private void deleteMember() {
        System.out.print("请输入需要删除的员工ID：");
        int id = TSUtility.readInt();
        System.out.print("是否确认删除(Y/N):");
        char isDelete = TSUtility.readConfirmSelection();
        if (isDelete == 'N') {
            return;
        }
        try {
            teamService.removeMember(id);
            System.out.println("删除成功");
        } catch (TeamException e) {
            System.out.println("添加失败，原因：" + e.getMessage());
        }
        TSUtility.readReturn();

    }

    public static void main(String[] args) {
        TeamView teamView = new TeamView();
        teamView.enterMainMenu();

    }
}