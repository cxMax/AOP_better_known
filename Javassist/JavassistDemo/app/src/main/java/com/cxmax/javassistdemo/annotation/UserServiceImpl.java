package com.cxmax.javassistdemo.annotation;

import java.io.File;
import java.io.FileOutputStream;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;

/**
 * @describe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 18-2-1.
 */

public class UserServiceImpl {

    public void updateUserAge(String username, int age) {
        System.out.println("==========>> update user set age = ? where username = ?");
        System.out.println("==========>> " + age + ", " + username);
    }

    @LogTime
    public void updateUserPassword(String username, String password) {
        System.out.println("==========>> update user set password = ? where username = ?");
        System.out.println("==========>> " + password + ", " + username);
    }


    public static void main(String[] args) throws Exception {
        ClassPool pool = ClassPool.getDefault();
        CtClass ctClass = pool.getCtClass("com.cxmax.javassistdemo.annotation.UserServiceImpl");
        for (CtMethod ctMethod: ctClass.getDeclaredMethods()) {
            try {
                LogTime logTime = (LogTime) ctMethod.getAnnotation(LogTime.class);
                if (logTime != null) {
                    ctMethod.insertBefore("{System.out.println(\"这是前置增强的代码，哈哈哈哈\");}");
//                    ctClass.writeFile();
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        new UserServiceImpl().updateUserAge("admin", 22);
        new UserServiceImpl().updateUserPassword("admin", "123456");
    }
}
