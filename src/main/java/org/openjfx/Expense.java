package org.openjfx;

import java.time.LocalDate;
import java.util.Calendar;

public class Expense {

    Integer PrimaryKey;
    String Name;
    Integer Amount;
    LocalDate DayOfAdd;

    public Expense(Integer primaryKey, String name, Integer amount, LocalDate dayOfAdd) {
        PrimaryKey = primaryKey;
        Name = name;
        Amount = amount;
        DayOfAdd = dayOfAdd;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getPrimaryKey() {
        return PrimaryKey;
    }

    public void setPrimaryKey(Integer primaryKey) {
        PrimaryKey = primaryKey;
    }

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer amount) {
        Amount = amount;
    }

    public LocalDate getDayOfAdd() {
        return DayOfAdd;
    }

    public void setDayOfAdd(LocalDate dayOfAdd) {
        DayOfAdd = dayOfAdd;
    }
}
