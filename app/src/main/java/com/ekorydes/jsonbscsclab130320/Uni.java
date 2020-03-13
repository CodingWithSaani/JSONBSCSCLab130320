package com.ekorydes.jsonbscsclab130320;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Uni {

    @SerializedName("name")
    @Expose (serialize = true)
    private String nameOfUni;

    @SerializedName("year")
    @Expose (serialize = true)
    private int yearOfDevelopment;

    private ArrayList<Department> department;

    public Uni(String nameOfUni, int yearOfDevelopment, ArrayList<Department> department) {
        this.nameOfUni = nameOfUni;
        this.yearOfDevelopment = yearOfDevelopment;
        this.department = department;
    }
}
