package com.xzz.project02;

/**
 * @author 徐正洲
 * @date 2022/5/3-19:13
 */
public class CustomerView {
    CustomerList customerList = new CustomerList(10);
    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }

    //显示界面方法
    public void enterMainMenu() {
        boolean isFlag = true;
        while (isFlag) {
            System.out.println("---------------客户信息管理软件---------------\n");
            System.out.println("                1 添加客户");
            System.out.println("                2 修改客户");
            System.out.println("                3 删除客户");
            System.out.println("                4 客户列表");
            System.out.println("                5 退 出\n");
            System.out.print("                请选择(1-5)：");
            //读取选择项
            char readMenu = CMUtility.readMenuSelection();
            switch (readMenu) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.print("是否确认退出（Y/N）：");
                    char isExit = CMUtility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;
                    }
            }
        }
    }

    //添加客户方法
    private void addNewCustomer() {
        Customer customer = new Customer();
        System.out.println("-----------添加客户操作------------");
        System.out.print("姓名：");
        String setName = CMUtility.readString(10);
        customer.setName(setName);

        System.out.print("性别：");
        char setSex = CMUtility.readChar();
        customer.setGender(setSex);

        System.out.print("年龄：");
        int setAge = CMUtility.readInt();
        customer.setAge(setAge);

        System.out.print("电话：");
        String setPhone = CMUtility.readString(13);
        customer.setPhone(setPhone);

        System.out.print("邮箱：");
        String setMail = CMUtility.readString(20);
        customer.setEmail(setMail);
        boolean result = customerList.addCustomer(customer);
        if (result == true) {
            System.out.println("添加客户成功！！！");
        } else {
            System.out.println("添加客户失败！！！");
        }

    }

    //修改客户方法
    private void modifyCustomer() {
        System.out.println("-----------修改客户操作------------");
        Customer customer;
        int number;
        //查找指定客户信息是否存在
        for (; ; ) {
            System.out.print("请选择待修改客户编号(-1退出):");
            number = CMUtility.readInt();
            if (number == -1) {
                return;
            }
            customer = customerList.getCustomer(number - 1);
            if (customer == null) {
                System.out.println("无法找到指定的客户");
            } else {
                break;
            }
        }
        //修改客户信息
        System.out.print("姓名(" + customer.getName() + "):");
        String name = CMUtility.readString(10, customer.getName());

        System.out.print("性别(" + customer.getGender() + "):");
        char sex = CMUtility.readChar(customer.getGender());

        System.out.print("年龄(" + customer.getAge() + "):");
        int age = CMUtility.readInt(customer.getAge());

        System.out.print("电话(" + customer.getPhone() + "):");
        String phone = CMUtility.readString(13, customer.getPhone());

        System.out.print("邮箱(" + customer.getEmail() + "):");
        String mail = CMUtility.readString(30, customer.getEmail());

        Customer newCustomer = new Customer(name, sex, age, phone, mail);

        boolean result = customerList.replaceCustomer(number - 1, newCustomer);
        if (result) {
            System.out.println("---------------修改完成---------------");
        }
    }

    //删除客户方法
    private void deleteCustomer() {
        System.out.println("-----------删除客户操作------------");
        Customer customer;
        int number;
        //查找指定客户信息是否存在
        for (; ; ) {
            System.out.print("请选择待删除客户编号(-1退出):");
            number = CMUtility.readInt();
            if (number == -1) {
                return;
            }
            customer = customerList.getCustomer(number - 1);
            if (customer == null) {
                System.out.println("无法找到指定的客户");
            } else {
                break;
            }
        }
        //删除操作
        System.out.print("是否确认要删除(Y/N)：");
        char isDelete = CMUtility.readConfirmSelection();
        if (isDelete == 'Y') {
            boolean result = customerList.deleteCustomer(number - 1);
            if (result) {
                System.out.println("-----------删除成功-----------");
            }
        } else {
            return;
        }
    }

    //显示客户方法
    private void listAllCustomers() {
        System.out.println("-----------客户列表-----------");
        if (customerList.getTotal() == 0) {
            System.out.println("没有客户信息！！！");
        } else {
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t邮箱\n");
            Customer[] allCustomers = customerList.getAllCustomers();
            for (int i = 0; i < allCustomers.length; i++) {
                Customer customer = allCustomers[i];
                System.out.println((i + 1) + "\t" + customer.getName() + "\t" + customer.getGender() + "\t" +
                        customer.getAge() + "\t" + customer.getPhone() + "\t" + customer.getEmail());
            }
        }
        System.out.println("-----------客户列表完成-----------");
    }


}