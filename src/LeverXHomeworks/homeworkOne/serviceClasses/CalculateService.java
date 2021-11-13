package LeverXHomeworks.homeworkOne.serviceClasses;

import LeverXHomeworks.homeworkOne.daoClasses.CalculateDao;
import LeverXHomeworks.homeworkOne.entityClasses.Commands;

public class CalculateService {

    CalculateDao calculation = new CalculateDao();

    public String calculate (String operandA, String operandB, Commands type) {
        return (String.valueOf(calculation.calculate(operandA, operandB, type)));
    }
}
