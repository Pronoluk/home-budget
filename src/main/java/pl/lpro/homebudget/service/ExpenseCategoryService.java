package pl.lpro.homebudget.service;


import pl.lpro.homebudget.domain.ExpenseCategory;

import java.util.List;

public interface ExpenseCategoryService {


    List<ExpenseCategory> readAllExpenseCategories();


    boolean saveCategory(ExpenseCategory expenseCategory);


}
