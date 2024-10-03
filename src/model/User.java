package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class User {
    private String name;
    private String email;
    private ArrayList<Expense> expenses = new ArrayList<>();

    public User(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public void addExpense(Expense expense) {
        this.expenses.add(expense);
    }

    public void removeExpense(Expense expense) {
        this.expenses.remove(expense);
    }

    public void updateExpense (String description, double amount, Category category, LocalDate date, int id) {

        for (Expense expense : expenses) {
            if(expense.getId() == id){
            expense.setDescription(description);
            expense.setAmount(amount);
            expense.setCategory(category);
            expense.setDate(date);
            return;
            }
        }

    }
}
