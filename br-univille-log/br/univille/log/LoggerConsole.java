package br.univille.log;

class LoggerConsole implements Logger {
    private static final String RESET = "\u001B[0m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String RED = "\u001B[31m";

    @Override
    public void log(Level level, String message) {
        String color = switch (level) {
            case DEBUG -> GREEN;
            case WARNING -> YELLOW;
            case ERROR -> RED;
        };
        System.out.println(color + "[" + level + "] " + message + RESET);
    }
}
