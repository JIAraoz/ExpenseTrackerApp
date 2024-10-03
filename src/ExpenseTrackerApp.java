import model.Category;
import model.Expense;

public class ExpenseTrackerApp {

    public static void main(String[] args) {
        Category category1 = new Category("Gastos de prueba","gastos para pruebas");
        Expense expensa1 = new Expense(2,"Prueba 1", category1);
        Expense expensa2 = new Expense(2.9,"Prueba 2", category1);
        System.out.println(expensa1.getId());
        System.out.println(expensa2.getId());

}
}