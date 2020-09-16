package com.tfswufe.ssm.pojo;

public class User {
    private static final long serialVersionUID = 1L;

    //属性---与数据库中表字段   对应
    private int id; //id
    private String name; //用户名称
    private String sex;  //性别
    private int age;  //出生日期
    private Long tel;   //电话
    private String address; //地址
    private String  role;    //用户角色
    private String pwd; //用户密码

    public User() {
    }

    public User(int id, String name, String sex, int age, Long tel, String address, String role, String pwd) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.tel = tel;
        this.address = address;
        this.role = role;
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", tel=" + tel +
                ", address='" + address + '\'' +
                ", role='" + role + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
