package application;

import service.QuoteService;

public class Main {
    static QuoteService service = new QuoteService();

    public static void main(String[] args) {
        service.execute();
    }
}
