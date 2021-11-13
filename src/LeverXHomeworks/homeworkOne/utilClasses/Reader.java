package LeverXHomeworks.homeworkOne.utilClasses;

import java.util.Scanner;

public class Reader {

    Scanner scanner =  new Scanner(System.in);
    Writer writer = new Writer();

    public String readString () {
        return scanner.next();
    }

    public int readInt () {
        return scanner.nextInt();
    }
}
