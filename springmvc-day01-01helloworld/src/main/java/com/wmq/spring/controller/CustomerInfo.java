package com.wmq.spring.controller;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年08月01日 08:12:00
 * @Description: TODO
 */
public class CustomerInfo {
    private String school;
    private String level;

    @Override
    public String toString() {
        return "CustomerInfo{" +
                "school='" + school + '\'' +
                ", level='" + level + '\'' +
                '}';
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
