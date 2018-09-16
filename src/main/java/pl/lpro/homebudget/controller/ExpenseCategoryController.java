package pl.lpro.homebudget.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.lpro.homebudget.domain.ExpenseCategory;

public interface ExpenseCategoryController {

    String allCategories(Model categories);

    String addCategory(Model category);
}
