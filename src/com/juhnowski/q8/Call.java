package com.juhnowski.q8;

public class Call {
    int rank = 0; //минимальный уровень сотрудника котрый может обработать этот звонок
    public void reply(String message) { System.out.println("Ответить"); }
    public void disconnect() { System.out.println("Положить трубку"); }
}
