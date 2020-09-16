package com.tfswufe.springboot;

import com.tfswufe.ssm.mapper.UserMapper;
import com.tfswufe.ssm.pojo.Bill;
import com.tfswufe.ssm.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        getUserByNameAndPwd();

    }
    //查询用户所有信息
    public static void getAllUser(){
        //加载mybatis的配置文件--
        //1 获取mybatis-config.xml的输入流
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //2.创建SqlSessionFactory对象，完成对配置文件的读取
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
        //3.创建SqlSession
        SqlSession sqlSession = build.openSession();
        //4 调用mapper文件来对数据进行操作，必须先把mapper文件引入到mybatis-config.xml中
        //通过session得到有mybatis框架生成的mapper接口实现类
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //mapper对象由mybatis框架来初始化
        //后期交给spring来管理
        //直接调用
        ArrayList<User> allUser = mapper.getAllUser();
        //输出
        for (User user:allUser) {
            System.out.println(user);
        }
    }
    //根据id查询用户信息
    public static void getUserById(){
        //加载mybatis的配置文件--
        //1 获取mybatis-config.xml的输入流
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //2.创建SqlSessionFactory对象，完成对配置文件的读取
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
        //3.创建SqlSession
        SqlSession sqlSession = build.openSession();
        //4 调用mapper文件来对数据进行操作，必须先把mapper文件引入到mybatis-config.xml中
        //通过session得到有mybatis框架生成的mapper接口实现类
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //mapper对象由mybatis框架来初始化
        //后期交给spring来管理
        //直接调用
        ArrayList<User> allUser = mapper.getUserById(1);
        //输出
        for (User user:allUser) {
            System.out.println(user);
        }
    }
    //根据id查询商品信息
    public static void getBillById(){
        //加载mybatis的配置文件--
        //1 获取mybatis-config.xml的输入流
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //2.创建SqlSessionFactory对象，完成对配置文件的读取
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
        //3.创建SqlSession
        SqlSession sqlSession = build.openSession();
        //4 调用mapper文件来对数据进行操作，必须先把mapper文件引入到mybatis-config.xml中
        //通过session得到有mybatis框架生成的mapper接口实现类
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //mapper对象由mybatis框架来初始化
        //后期交给spring来管理
        //直接调用
        ArrayList<Bill> billlist = mapper.getBillById(5);
        //输出
        for (Bill bill:billlist) {
            System.out.println(bill);
        }
    }
    //根据内容模糊查询商品信息
    public static void getBillByNotice(){
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = build.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        ArrayList<Bill> billNotice = mapper.getBillByNotice("辣条");
        for (Bill bill:billNotice) {
            System.out.println(bill);
        }
    }
    //查询用户男女各多少人
    public static void getCountBySex(){
        //加载mybatis的配置文件--
        //1 获取mybatis-config.xml的输入流
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //2.创建SqlSessionFactory对象，完成对配置文件的读取
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
        //3.创建SqlSession
        SqlSession sqlSession = build.openSession();
        //4 调用mapper文件来对数据进行操作，必须先把mapper文件引入到mybatis-config.xml中
        //通过session得到有mybatis框架生成的mapper接口实现类
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //mapper对象由mybatis框架来初始化
        //后期交给spring来管理
        //直接调用
        String count = mapper.getCountBySex();
        //输出
        System.out.println(count);
    }
    //通过用户名和密码查询用户信息
    public static void getUserByNameAndPwd(){
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = build.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String name = scanner.next();
        System.out.print("请输入密码：");
        String pwd = scanner.next();
        User user = new User();
        user.setName(name);
        user.setPwd(pwd);
        User user1 = mapper.getUserByNameAndPwd(user);
        System.out.println(user1);
    }
}
