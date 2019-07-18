package com.rest.webservice.restfullwebservice.basicAuth;

public class AuthenticationBean {
    //Declare a variable
    private String message;

    @Override
    public String toString() {
        return "AuthenticationBean{" +
                "message ='" + message + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }


  /*  public void setMessage(String message) {
        this.message = message;
    }
    */


    public AuthenticationBean(String message) {
        this.message =message;

    }
}
