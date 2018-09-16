package pl.lpro.homebudget.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.lpro.homebudget.dao.ExpenseCategoryRepository;
import pl.lpro.homebudget.domain.ExpenseCategory;
import pl.lpro.homebudget.service.ExpenseCategoryService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class ExpenseCategoryServiceImpl implements ExpenseCategoryService {

    private static final Logger logger = LoggerFactory.getLogger(ExpenseCategoryServiceImpl.class);

    private ExpenseCategoryRepository dataRepository;

    @Autowired
    public ExpenseCategoryServiceImpl(ExpenseCategoryRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @Override
    public List<ExpenseCategory> readAllExpenseCategories() {

        List<ExpenseCategory> result = (List<ExpenseCategory>) dataRepository.findAll();

        logger.info("Expense categories read from dao: {}", result);
        return result;
    }

    @Override
    public boolean saveCategory(ExpenseCategory expenseCategory) {
        ExpenseCategory savedCategory = dataRepository.save(expenseCategory);
        return null != savedCategory.getId();
    }
}