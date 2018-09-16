package pl.lpro.homebudget.controller.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.lpro.homebudget.controller.ExpenseCategoryController;
import pl.lpro.homebudget.domain.ExpenseCategory;
import pl.lpro.homebudget.service.ExpenseCategoryService;

import java.util.Collections;
import java.util.List;

@Controller
public class ExpenseCategoryControllerImpl implements ExpenseCategoryController {

    private static final Logger logger = LoggerFactory.getLogger(ExpenseCategoryControllerImpl.class); //logger

    private ExpenseCategoryService categoryService;

    @Autowired
    public ExpenseCategoryControllerImpl(ExpenseCategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/category/all")
    @Override
    public String allCategories(Model categories) {
        logger.info("allCategories()"); //logger

        List<ExpenseCategory> expenseCategories = categoryService.readAllExpenseCategories();
        categories.addAttribute("categories", expenseCategories); //mapa

        return "category/categories-all";
    }

    @PostMapping("/category/save")
    public String saveCategory(@ModelAttribute ExpenseCategory expenseCategory,
                               @RequestParam (name="pressed-button")String pushedButton) {

        logger.info("saveCategory(), expenseCategory: {}, pushedButton: {}",expenseCategory, pushedButton);

        if ("save".equalsIgnoreCase((pushedButton))) {
            categoryService.saveCategory(expenseCategory);
        }

        return "redirect:/category/all";
    }

    @GetMapping("/category/add")
    @Override
    public String addCategory(Model category) {
        logger.info("addCategory()"); //logger

        category.addAttribute("category", new ExpenseCategory());

        return "category/new-category";
    }


}