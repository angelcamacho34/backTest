package com.intercam.test.payload;

import lombok.Data;
import java.util.Optional;

@Data
public class SuccessPayload {
    private String status;
    private Optional<Object> data;

    public SuccessPayload(String status){
        this.status = "success";
    }

    public void setData(Object data) {
        this.data = Optional.ofNullable(data);
    }
}
