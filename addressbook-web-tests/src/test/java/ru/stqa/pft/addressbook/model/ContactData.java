package ru.stqa.pft.addressbook.model;

public record ContactData(String name, String lastname, String phone, String email, String group) {

    public String getGroup() {
        return group;
    }
}
