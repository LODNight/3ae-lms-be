package com.lms._ae.admin.dto.response;


public class ResponseError extends ResponseData{
    public ResponseError(int status, String message){
        super(status,message);
    }
}
