package org.example.Task3;

public class Car implements CarOwner, Mechanic {
    private String name;
    private int age;
    private String nameOfDetales;
    private String boxCondition;
    private String engineCondition;
    private Boolean recallCompany;
    private int oilLevel;
    private String exploitationArea;

    public Car(String name, int age, String nameOfDetales, String boxCondition, String engineCondition, Boolean recallCompany, int oilLevel, String exploitationArea) {
        this.name = name;
        this.age = age;
        this.nameOfDetales = nameOfDetales;
        this.boxCondition = boxCondition;
        this.engineCondition = engineCondition;
        this.recallCompany = recallCompany;
        this.oilLevel = oilLevel;
        this.exploitationArea = exploitationArea;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNameOfDetales() {
        return nameOfDetales;
    }

    public void setNameOfDetales(String nameOfDetales) {
        this.nameOfDetales = nameOfDetales;
    }

    public String getBoxCondition() {
        return boxCondition;
    }

    public void setBoxCondition(String boxCondition) {
        this.boxCondition = boxCondition;
    }

    public String getEngineCondition() {
        return engineCondition;
    }

    public void setEngineCondition(String engineCondition) {
        this.engineCondition = engineCondition;
    }

    public Boolean getRecallCompany() {
        return recallCompany;
    }

    public void setRecallCompany(Boolean recallCompany) {
        this.recallCompany = recallCompany;
    }

    @Override
    public int getOilLevel() {
        return oilLevel;
    }

    public void setOilLevel(int oilLevel) {
        this.oilLevel = oilLevel;
    }

    public String getExploitationArea() {
        return exploitationArea;
    }

    public void setExploitationArea(String exploitationArea) {
        this.exploitationArea = exploitationArea;
    }
}