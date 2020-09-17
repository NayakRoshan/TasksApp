package com.example.mytaskapp.entity;

public class PersonEntity {

    private Integer id;
    private String name;
    private String phone;
    private String age;

    public PersonEntity(Integer id, String name, String phone, String age) {
        setId(id);
        setName(name);
        setPhone(phone);
        setAge(age);
    }

    public Integer getId() { return id; }
    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getAge() { return age; }

    public void setId(Integer id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setAge(String age) { this.age = age; }

}
