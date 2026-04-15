package com.boda.xy;
import java.time.LocalDate;

public record Employee(int id, String name, LocalDate birthday, double salary)
        implements Comparable<Employee>{
    @Override
    public int compareTo(Employee employee){
        if(id() > employee.id())
            return 1;
        else if (id() < employee.id())
            return -1;
        else
            return 0;
    }
}

