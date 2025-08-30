package com.lms._ae.modules.student.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class APIResponse {
    public String message;
    private Boolean status;
}
