/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: PasswordUtils.java
 * Author:   zhangdanji
 * Date:     2017年08月23日
 * Description:   
 */
package com.mychebao.java;

import java.util.List;

/**
 * @author zhangdanji
 */
public class PasswordUtils {

    @UseCase(id = 47,description = "Passwords must contain at least one numeric")
    public boolean validatePassword(String password){
        return (password.matches("\\w*\\d\\w*"));
    }

    @UseCase(id=48)
    public String encryptPassword(String password){
        return new StringBuilder(password).reverse().toString();
    }

    @UseCase(id = 49,description = "New passwords can't equal previously used ones")
    public boolean checkForNewPassword(List<String> prevPasswords,String password){
        return !prevPasswords.contains(password);
    }
}
