package com.hh.common.time;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class DateRange {
    LocalDate startDate;
    LocalDate endDate;
}
