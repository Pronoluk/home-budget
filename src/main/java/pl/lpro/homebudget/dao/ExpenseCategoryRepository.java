package pl.lpro.homebudget.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.lpro.homebudget.domain.ExpenseCategory;

@Repository
public interface ExpenseCategoryRepository extends CrudRepository<ExpenseCategory, Long> {

}
