package leverxhomeworks.homeworkone.service;

import leverxhomeworks.homeworkone.dao.CalculatorDao;
import leverxhomeworks.homeworkone.entity.Commands;

public class CalculatorService {

    private final CalculatorDao calculatorDao = new CalculatorDao();

    public String calculate(String operandA, String operandB, Commands type) {
        return (String.valueOf(calculatorDao.calculate(operandA, operandB, type)));
    }
}
