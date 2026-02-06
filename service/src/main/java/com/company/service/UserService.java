package com.company.service;

import com.company.common.AppUtil;

public class UserService {
    public String getMessage() {
        return "Welcome to " + AppUtil.getAppName();
    }
}
