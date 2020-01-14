package com.example.demo;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;
import org.apache.shiro.crypto.hash.Sha384Hash;
import sun.security.provider.MD5;

public class MyMatcher extends SimpleCredentialsMatcher {
    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
        String pwd = encrypt(String.valueOf(usernamePasswordToken.getPassword()));
        String mysqlpwd = (String) info.getCredentials();
        return this.equals(pwd, mysqlpwd);

    }
    private String encrypt(String data){
        String sha384Hex=new Sha384Hash(data).toBase64();
        return sha384Hex;


    }


}
