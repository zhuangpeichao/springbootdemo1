package cn.bdqn.springbootdemo.bean;


import java.io.Serializable;

public class User implements Serializable {
    private Integer userId;
    private String realName;
    private String userName;
    private String userPwd;

    public User() {
    }

    private Role role;

    public User(Integer userId, String realName, String userName, String userPwd, Role role) {
        this.userId = userId;
        this.realName = realName;
        this.userName = userName;
        this.userPwd = userPwd;
        this.role = role;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getRealName() {
        return realName;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public Role getRole() {
        return role;
    }
}
