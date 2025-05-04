package com.example.journal.models;

public class UserDTO {

private String name;
private String age;

public UserDTO(String name, String age){
    this.age = age;
    this.name = name;
}


public String getName(){

    return this.name;
}

public void setName(String name){

    this.name = name;
}

public String getAge(){

    return this.age;
}

public void setAge(String age){

    this.age = age;
}
    
}
