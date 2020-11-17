package com.thoughtworks.capability.gtb;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 对任意日期获取下一个工作日, 不考虑节假日
 *
 * @author itutry
 * @create 2020-05-15_17:20
 */
public class Practice2 {

  public static LocalDate getNextWorkDate(LocalDate date) {
    int plusDay = 0;
    if (date.getDayOfWeek() == DayOfWeek.FRIDAY) {
      plusDay = 3;
    } else if (date.getDayOfWeek() == DayOfWeek.SATURDAY) {
      plusDay = 2;
    } else {
      plusDay = 1;
    }
    LocalDate tmp = date.plusDays(plusDay);
    return tmp;
  }
}
