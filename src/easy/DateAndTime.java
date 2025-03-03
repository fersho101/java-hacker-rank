package easy;

import java.time.LocalDate;
import java.util.Scanner;

/*
 * The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

You are given a date. You just need to write the method, , which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.

Example



The method should return  as the day on that date.

image

Function Description

Complete the findDay function in the editor below.

findDay has the following parameters:

int: month
int: day
int: year
Returns

string: the day of the week in capital letters
Input Format

A single line of input containing the space separated month, day and year, respectively, in    format.

Constraints

Sample Input

08 05 2015
Sample Output

WEDNESDAY
Explanation

The day on August th  was WEDNESDAY.
 */

public class DateAndTime {
    int month;
    int day;
    int year;

    public static String findDay(int month, int day, int year) {
        LocalDate fecha = LocalDate.of(year, month, day);
        return fecha.getDayOfWeek().toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite dia: ");
        int day = s.nextInt();
        System.out.print("Digite mes: ");
        int month = s.nextInt();
        System.out.print("Digite año: ");
        int year = s.nextInt();
        s.close();
        System.out.println(findDay(month, day, year));

    }

}
