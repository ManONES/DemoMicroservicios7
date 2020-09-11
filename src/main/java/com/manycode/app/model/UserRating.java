package com.manycode.app.model;

public class UserRating {

    private String userId;
    

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    public void initData(String userId) {
        this.setUserId(userId + " Bienvenido al mundo de los microservicios version uno");

    }
    
    public void initData2(String userId) {
        this.setUserId(userId + " Bienvenido al mundo de los microservicios version dos");

    }    
}
