package leverxhomeworks.homeworkone.dao;

import leverxhomeworks.homeworkone.entity.Commands;
import leverxhomeworks.homeworkone.utills.Writer;

public class CalculatorDao {

    private final Writer writer = new Writer();
    private int result;
    private String outputResult = null;

    public String calculate (String stringOperandA, String stringOperandB, Commands type) {
        int intOperandA = Integer.parseInt(stringOperandA);
        int intOperandB = Integer.parseInt(stringOperandB);

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
        String intResult = String.valueOf(result);
        if (!intResult.equals(outputResult)) {
            outputResult = intResult;
        }
        return outputResult;
    }
}