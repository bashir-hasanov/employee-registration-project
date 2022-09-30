package com.cydeo.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

    //@NotNull  //accepts everything except null, FE this empty String -> ""
    //@NotEmpty // accepts everything except null and empty String, FE a space blank -> " "
    //@NotBlank  // accepts everything except null, empty String and space blank -> null, "", " " not accepted
    @NotBlank
    @Size(max = 12, min = 2)
    private String firstName;
    private String lastName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;




}
