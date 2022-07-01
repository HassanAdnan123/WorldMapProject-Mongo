package com.worldmap.commons.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BaseResponse <T> {
    private T body;
    private String message;
    private boolean success;
    private T errors;
}
