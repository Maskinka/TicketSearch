package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Ticket;
import ru.netology.domain.TicketByPriceAscComparator;
import ru.netology.repository.Repository;

import static org.junit.jupiter.api.Assertions.*;

public class ComparatorTest {
    Repository repository = new Repository();
    Manager manager = new Manager(repository);
    TicketByPriceAscComparator comparator = new TicketByPriceAscComparator();

    Ticket ticket1 = new Ticket(1, 2000, "Moscow", "USA", 12);
    Ticket ticket2 = new Ticket(2, 5000, "Moscow", "USA", 8);
    Ticket ticket3 = new Ticket(3, 5000, "London", "China", 10);
    Ticket ticket4 = new Ticket(4, 6000, "Australia", "Canada", 5);

    @BeforeEach
    public void add() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
    }

    @Test
    public void findTwoTicketFastTime() {
        Ticket[] actual = manager.findAllTickets("Moscow", "USA", comparator);
        Ticket[] expected = {ticket2, ticket1};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void NotFoundTicket() {
        Ticket[] actual = manager.findAllTickets("NY", "Russia", comparator);
        Ticket[] expected = new Ticket[0];

        assertArrayEquals(expected, actual);
    }
}
