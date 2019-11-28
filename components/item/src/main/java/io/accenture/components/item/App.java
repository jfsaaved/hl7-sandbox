package io.accenture.components.item;

import io.accenture.components.item.repository.InMemoryItemRepository;
import io.accenture.components.item.repository.ItemRepository;
import io.accenture.components.item.repository.JdbcItemRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
public class App {

    @Bean
    public ItemRepository itemRepository(DataSource dataSource){
        return new JdbcItemRepository(dataSource);
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
