package br.com.danielndrade.git.examples.springbatch;

import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class BatchItemWriter implements ItemWriter<String> {

    @Override
    public void write(List<? extends String> messages) throws Exception {
        for (String msg : messages) {
            System.out.println("Writing the data using batch writer: " + msg);
        }
    }

}
