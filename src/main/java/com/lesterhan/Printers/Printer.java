package com.lesterhan.Printers;

import java.io.PrintStream;

public class Printer {

    private String str;
    private PrintStream printer;

    public Printer(String str, PrintStream printer) {
        this.str = str;
        this.printer = printer;
    }

    public void println() {
        printer.println(str);
    }
}
