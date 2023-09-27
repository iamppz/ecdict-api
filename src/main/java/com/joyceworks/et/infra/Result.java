package com.joyceworks.et.infra;

public class Result<T> {
    private Boolean success;
    private String message;
    private T data;
    private String status;

    public static <T> Result<T> of(Boolean success, String message, T data, String status) {
        Result<T> result = new Result<>();
        result.setSuccess(success);
        result.setMessage(message);
        result.setData(data);
        result.setStatus(status);
        return result;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
