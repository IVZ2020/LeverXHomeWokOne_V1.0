package leverxhomeworks.homeworkone.main;

import leverxhomeworks.homeworkone.entity.Commands;
import leverxhomeworks.homeworkone.service.CalculatorService;
import leverxhomeworks.homeworkone.utills.IsDigitValidator;
import leverxhomeworks.homeworkone.utills.Reader;
import leverxhomeworks.homeworkone.utills.Writer;

import java.util.Objects;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {

        final Writer writer = new Writer();
        final Reader reader = new Reader();
        final IsDigitValidator isDigit = new IsDigitValidator();
        final CalculatorService calculate =  new CalculatorService();
        Commands type = Commands.CONTINUE;
        String operandA;
        String operandB;
        String result = "";

        while (true) {
            writer.writeString("Input first int digit");
            operandA = reader.readString();
            if (isDigit.CheckNumberIfItDigit(operandA)) {
                writer.writeString("Input second digit");
                operandB = reader.readString();
                if (isDigit.CheckNumberIfItDigit(operandB)) {
                    writer.writeString("Input command: PLUS, MINUS, MULTIPLY, DIV or type EXIT");
                    try {
                        type = Commands.valueOf(reader.readString());
                        if (type == Commands.EXIT) {
                            break;
                        }
                    }
                    catch (IllegalArgumentException e) {
                        writer.writeString("Input correct information");
                    }
                    result = calculate.calculate(operandA, operandB, type);
                }
            }
            writer.writeString(Objects.requireNonNullElse(result, "Result is null"));
        }
    }
}
