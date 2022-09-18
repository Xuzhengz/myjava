package com.xzz.project03.service;


import com.xzz.project03.domain.Architect;
import com.xzz.project03.domain.Designer;
import com.xzz.project03.domain.Employee;
import com.xzz.project03.domain.Programmer;

/**
 * @author 徐正洲
 * @date 2022/5/18-19:28
 * <p>
 * 关于开发团队成员的管理、添加、删除等。
 */
public class TeamService {
    private static int counter = 1;  //给memberId赋值用。
    private final int MAX_MEMBER = 5; //限制开发团员的人数
    private Programmer[] programmers = new Programmer[MAX_MEMBER];//初始化数组长度
    private int total;//记录开发团队实际的人数

    public TeamService() {

    }

    //获取开发团队中所有的成员
    public Programmer[] getProgrammers() {
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < team.length; i++) {
            team[i] = programmers[i];
        }
        return team;
    }

    //将指定的员工添加到开发团队中
    public void addMember(Employee employee) throws TeamException {
        if (total >= MAX_MEMBER) {
            throw new TeamException("成员已满,无法添加");
        }
        if (!(employee instanceof Programmer)) {
            throw new TeamException("该成员不是开发人员,无法添加");
        }
        if (isExist(employee)) {
            throw new TeamException("该成员已在团队中,无法添加");
        }

        Programmer p = (Programmer) employee;
        if ("BUSY".equalsIgnoreCase(p.getStatus().getNAME())) {
            throw new TeamException("该成员已在别的团队中,无法添加");
        }
        if ("VOCATION".equalsIgnoreCase(p.getStatus().getNAME())) {
            throw new TeamException("该成员已在度假中,无法添加");
        }


        //获取已有成员的各职业情况

        int numOfArch = 0, numbOfDes = 0, numOfPro = 0;
        for (int i = 0; i < total; i++) {
            if (programmers[i] instanceof Architect) {
                numOfArch++;
            } else if (programmers[i] instanceof Designer) {
                numbOfDes++;
            } else if (programmers[i] instanceof Programmer) {
                numOfPro++;
            }
        }

        if (p instanceof Architect) {
            if (numOfArch >= 1) {
                throw new TeamException("团队最多只能有一个架构师,无法添加");
            }
        }
        if (p instanceof Designer) {
            if (numbOfDes >= 2) {
                throw new TeamException("团队最多只能有二个设计师,无法添加");
            }
        }
        if (p instanceof Programmer) {
            if (numOfPro >= 3) {
                throw new TeamException("团队最多只能有三个程序员,无法添加");
            }
        }

        //将p(e) 添加到现有的team中
        programmers[total++] = p;
        //p的属性赋值
        p.setStatus(Status.BUSY);
        p.setMemberId(counter++);


    }

    //判断成员是否已在团队中
    private boolean isExist(Employee employee) {
        for (int i = 0; i < total; i++) {
            if (programmers[i].getId() == employee.getId()) {
                return true;
            }
        }
        return false;


    }

    public void removeMember(int memberId) throws TeamException {
        int i = 0;
        for (; i < total; i++) {
            if (programmers[i].getMemberId() == memberId) {
                programmers[i].setStatus(Status.FREE);
                break;
            }
        }

        if (i == total) {
            throw new TeamException("找不到指定memberId的员工，删除失败");
        }

        for (; i < total - 1; i++) {
            programmers[i] = programmers[i + 1];
        }
        programmers[--total] = null;


    }

}