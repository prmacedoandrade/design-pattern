package com.study.creational.builder;

import java.time.LocalDate;
import java.time.Period;

/**
 *  The concrete builder for UserWebDTO
 *
 */
public class UserWebDTOBuilder implements UserDTOBuilder {

    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserWebDTO dto;

    @Override
    public UserDTOBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate birthday) {
        Period ageInYears = Period.between(birthday, LocalDate.now());
        this.age = Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address =  this.address = address.getHouseNumber() + ", " + address.getStreet()
                + "\n" + address.getCity() + "\n" + address.getState() + " " + address.getZipcode();
        return this;
    }

    @Override
    public UserDTO build() {
        dto = new UserWebDTO(firstName+" "+lastName, age, address);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }
}
