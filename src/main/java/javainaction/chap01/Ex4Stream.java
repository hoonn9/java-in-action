package javainaction.chap01;

import java.util.Arrays;
import java.util.List;

public class Ex4Stream {

    public static void main(String... args) {
        Transaction tx1 = new Transaction();
        tx1.setPrice(100);
        Transaction tx2 = new Transaction();
        tx2.setPrice(200);
        Transaction tx3 = new Transaction();
        tx3.setPrice(300);

        List<Transaction> list = Arrays.asList(tx1, tx2, tx3);

        list.stream().filter((transaction -> transaction.getPrice() >= 200)).forEach(transaction -> {
            System.out.println((transaction.getPrice()));
        });

    }
}



class Transaction {
    private Integer Price;

    public Integer getPrice() {
        return Price;
    }

    public void setPrice(Integer price) {
        Price = price;
    }
}