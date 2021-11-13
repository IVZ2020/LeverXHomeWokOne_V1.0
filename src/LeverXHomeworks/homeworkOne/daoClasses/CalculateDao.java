package LeverXHomeworks.homeworkOne.daoClasses;

import LeverXHomeworks.homeworkOne.entityClasses.Commands;
import LeverXHomeworks.homeworkOne.utilClasses.Writer;

public class CalculateDao {

    Writer writer = new Writer();
    int result;
    String intResult = null;
    String outputResult = null;

    public String calculate(String stringOperandA, String stringOperandB, Commands type) {
        int intOperandA;
        intOperandA = Integer.parseInt(stringOperandA);
        int intOperandB;
        intOperandB = Integer.parseInt(stringOperandB);

        switch (type) {
            case DIV -> {
                try {
                    result = intOperandA / intOperandB;
                } catch (ArithmeticException e) {
                    writer.writeString("Operand B can't be ZERO");
                    return null;
                }
            }
            case MINUS -> result = intOperandA - intOperandB;
            case MULTIPLY -> result = intOperandA * intOperandB;
            case PLUS -> result = intOperandA + intOperandB;
            default -> outputResult = "Something wrong. Starting again";
        }
        intResult = String.valueOf(result);
        if (!intResult.equals(outputResult)) {
            outputResult = intResult;
        }
        return outputResult;
    }
}