package LeverXHomeworks.homeworkOne.mainClass;

import LeverXHomeworks.homeworkOne.entityClasses.Commands;
import LeverXHomeworks.homeworkOne.serviceClasses.CalculateService;
import LeverXHomeworks.homeworkOne.utilClasses.IsDigit;
import LeverXHomeworks.homeworkOne.utilClasses.Reader;
import LeverXHomeworks.homeworkOne.utilClasses.Writer;

import java.util.Objects;

public class HomeworkClassOne {

    public static void main(String[] args) {

        Writer writer = new Writer();
        Reader reader = new Reader();
        IsDigit isDigit = new IsDigit();
        CalculateService calculate =  new CalculateService();
        Commands type = Commands.CONTINUE;
        String operandA;
        String operandB;
        String result = "";

        while (true) {
            writer.writeString("Input first int digit");
            operandA = reader.readString();
            if (isDigit.isDigit(operandA)) {
                writer.writeString("Input second digit");
                operandB = reader.readString();
                if (isDigit.isDigit(operandB)) {
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
