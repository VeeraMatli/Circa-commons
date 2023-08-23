package com.circa.project.circacommons.Response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LoginResponse extends BaseResponse{

    private String userFirstName;

    private String userLastName;

    private String userLocation;

    private Integer userProfileId;
}
