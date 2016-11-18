package com.lesterhan.Printers;

import com.lesterhan.Printers.Printer;
import org.junit.Test;

import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class PrinterTest {

    @Test
    public void talkShouldEvokePrintln() {
        PrintStream mockPrintStream = mock(PrintStream.class);
        String printString = "hello";
        Printer printer = new Printer(printString, mockPrintStream);

        printer.println();

        verify(mockPrintStream).println(printString);
        assertThat(1).isEqualTo(0);
    }
}