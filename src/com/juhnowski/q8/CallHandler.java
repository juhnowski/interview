package com.juhnowski.q8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CallHandler {
    static final int LEVELS = 3; // три уровня сотрудников
    static final int NUM_FRESHERS = 5; // количество фрешеров

    ArrayList<Employee>[] employeeLevels = new ArrayList[LEVELS];

    Queue<Call>[] callQueues = new LinkedList[LEVELS];

    public CallHandler() {
        System.out.println("Звонок обработан");
    }

    Employee getCallHandler(Call call) {
        for (int level = call.rank; level < LEVELS - 1; level++) {
            ArrayList<Employee> employeeLevel = employeeLevels[level];
            for (Employee emp : employeeLevel) {
                if (emp.free) {
                    return emp;
                }
            }
        }
         return null;
    }

    void getNextCall(Employee e) {
        System.out.println("getNextCall");
    }

    void dispatchCall(Call call) {
        Employee emp = getCallHandler(call);
        if (emp != null) {
            emp.ReceiveCall(call);
            } else {
             callQueues[call.rank].add(call);
            }
        }
}
