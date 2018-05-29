package com.juhnowski.q8;

public class Employee {
    CallHandler callHandler;
    int rank; // 0- fresher, 1 - technical lead, 2 - product manager
    boolean free;

    public Employee(int rank) {
        this.rank = rank;
    }

    void ReceiveCall(Call call) {
        System.out.println("Принял звонок");
    }

    void CallHandled(Call call) {
        System.out.println("Звонок обработан");
    }

    /**
     * Эскалируем звонок
     */
    void CannotHandle(Call call) {
        call.rank = rank + 1;
        callHandler.dispatchCall(call);
        free = true;
        callHandler.getNextCall(this); // принимаем следующий входящий звонок
    }
}
