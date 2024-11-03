package com.study.creational.builder;

import java.time.LocalDate;

/**
 * Abstract Builder
 */
public interface UserDTOBuilder {

    UserDTOBuilder withFirstName(String firstName);
    UserDTOBuilder withLastName(String lastName);
    UserDTOBuilder withBirthday(LocalDate birthday);
    UserDTOBuilder withAddress(Address address);

    /**
     * method to assemble final product
     */
    UserDTO build();

    /**
     * Optional method to fetch already built object
     */
    UserDTO getUserDTO();

}
