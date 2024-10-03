package model;

import java.time.LocalDate;

public class Expense {
    private double amount;
    private String description;
    private LocalDate date;
    private Category category;
    private static int numOfExpenses;
    private int id;
    public Expense( double amount, String description, Category category) {
        this.amount = amount;
        this.description = description;
        this.date = java.time.LocalDate.now();
        this.category = category;
        numOfExpenses++;
        id = numOfExpenses;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
