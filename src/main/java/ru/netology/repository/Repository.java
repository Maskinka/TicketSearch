package ru.netology.repository;

import ru.netology.domain.Ticket;

public class Repository {
    private Ticket[] tickets = new Ticket[0];

    public void addTicket(Ticket ticket) {
        int length = tickets.length + 1;
        Ticket[] tmp = new Ticket[length];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];
        }
        int newTicket = tmp.length - 1;
        tmp[newTicket] = ticket;
        tickets = tmp;
    }

    public void removeById(int id) {
        int length = tickets.length - 1;
        Ticket[] tmp = new Ticket[length];
        int copy = 0;
        for (Ticket product : tickets) {
            if (product.getId() != id) {
                tmp[copy] = product;
                copy++;
            }
        }
        tickets = tmp;
    }

    public Ticket[] findAllTickets() {
        return tickets;
    }
}
