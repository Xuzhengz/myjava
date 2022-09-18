package com.xzz.project03.service;

/**
 * @author 徐正洲
 * @date 2022/5/18-19:24
 */
public class TeamException extends Exception {
    static final long serialVersionUID = -7034897190745766939L;

    public TeamException(){

    }

    public TeamException(String message) {
        super(message);
    }

}