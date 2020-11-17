package com.thoughtworks.capability.gtb;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

  public static long getDaysBetweenNextLaborDay(LocalDate date) {
    int year = date.getYear();
    int month = date.getMonthValue();
    LocalDate dateTmp;
    if (month > 5) {
      dateTmp = LocalDate.of(year + 1, 5 ,1);
    } else {
      dateTmp = LocalDate.of(year, 5, 1);
    }
    return date.until(dateTmp, ChronoUnit.DAYS);
  }
}
