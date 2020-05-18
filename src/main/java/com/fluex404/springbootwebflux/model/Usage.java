package com.fluex404.springbootwebflux.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usage {
    private int cpuUsage;
    private int memoryUsage;
    private Date date;
}
