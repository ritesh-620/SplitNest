package in.ritesh.splitnest.entity;

import java.time.LocalDate;

public class Expense {
    private Long id;
    private String title;
    private Double amount;
    private ExpenseCategory category;
    private LocalDate expenseDate;
    private Long paidBy;
    private Long groupid;
}
