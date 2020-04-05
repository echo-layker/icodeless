package com.icodeless.example.user.entity;

/**
 * @author layker
 * @description 用户信息实体
 */
public class UserEntity {
    /**
     * @primaryKey
     */
    private Long id;
    /**
     * @description 用户姓名
     * @notNull
     */
    private String userName;
    /**
     * @description 用户密码
     * @typeHandler RsaEncryptHandler
     */
    private String userPwd;
    /**
     * @description 性别
     * @default com.icodeless.example.user.entity.Sex#UNKNOWN
     */
    private Sex sex;
    /**
     * @description 年纪
     * @max 100
     * @min 0
     */
    private Integer age;
    /**
     * @description 手机号
     * @length 11
     */
    private String phoneNum;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (!id.equals(that.id)) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (userPwd != null ? !userPwd.equals(that.userPwd) : that.userPwd != null) return false;
        if (sex != that.sex) return false;
        if (age != null ? !age.equals(that.age) : that.age != null) return false;
        return phoneNum != null ? phoneNum.equals(that.phoneNum) : that.phoneNum == null;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userPwd != null ? userPwd.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (phoneNum != null ? phoneNum.hashCode() : 0);
        return result;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
