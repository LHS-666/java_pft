package ru.stqa.pft.addressbook.model;

public class ContactData {
    private String name;
    private String lastname;
    private String phone;
    private String email;
    private String group;


    public ContactData(String name, String lastname, String phone, String email, String group) {

        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.email = email;
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public String name() {
        return name;
    }

    public String lastname() {
        return lastname;
    }

    public String phone() {
        return phone;
    }

    public String email() {
        return email;
    }
}
