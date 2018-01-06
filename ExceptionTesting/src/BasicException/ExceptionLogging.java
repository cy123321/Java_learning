package BasicException;

import java.io.*;
import java.util.logging.*;

class ExceptionsLogging extends Exception{
    private static Logger logger = Logger.getLogger("LoggingException");
    public ExceptionsLogging (){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class ExceptionLogging {
    public static void main(String[] args) {
        try {
            throw new ExceptionsLogging();
        } catch (ExceptionsLogging e) {
            System.err.println("Caught " + e);
        }
    }
}