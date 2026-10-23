package br.com.matheusakio.spring_boot_essentials_jpa.exception;

public class NotFoundEception extends RuntimeException {
    public NotFoundEception(String message) {
        super(message);
    }
}
