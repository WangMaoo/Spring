package com.wmq.ssm.pojo;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年08月03日 09:58:00
 * @Description: TODO
 */
public class ProjectException extends Exception {

    private String message;
    private String code;

    public ProjectException(String message, String code) {
        this.message = message;
        this.code = code;
    }

    @Override
    public String toString() {
        return "ProjectException{" +
                "message='" + message + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
