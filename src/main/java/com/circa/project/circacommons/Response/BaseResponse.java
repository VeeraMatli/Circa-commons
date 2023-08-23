package com.circa.project.circacommons.Response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BaseResponse {

    private String responseCode;

    private String responseMessage;

    private String responseErrorMessage;
}
