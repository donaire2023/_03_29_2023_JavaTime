package com.hedima.presentacion;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;



public class ProbarJavaTime {
    public static void main(String[] args) {
        /*Primera forma de armar fecha*/
        LocalDate date = LocalDate.of(1992,8,30);
        System.out.println("fecha -> " + date);
        /*Segunda forma de armar fecha*/
        LocalDate date2 = LocalDate.of(1998,Month.AUGUST,30);
        System.out.println("fecha -> " + date2);
        /*Tercera forma de armar fecha*/
        LocalDate date3 = LocalDate.parse("1992-08-30");
        System.out.println("fecha -> " + date3);


        System.out.println(date.plusDays(2));
        System.out.println(date.plusMonths(1));
        System.out.println(date.plusYears(1));
        System.out.println(date.minusDays(2));
        System.out.println(date.minusMonths(1));
        System.out.println(date.minusYears(1));

        LocalDate date4 = LocalDate.of(2007,Month.JULY,7);
        System.out.println(date2.isBefore(date4));
        System.out.println(date2.isAfter(date4));
        System.out.println(LocalDate.now());
        System.out.println(Period.between(date2, date4).getYears());
        System.out.println(Period.between(date2, LocalDate.now()).getYears());

        //        Primera forma de armar tiempos


      /*         Primera forma de armar tiempos*/

        LocalTime horaInicio = LocalTime.of(12,0);
        System.out.println("horaInicio -> " + horaInicio);
        LocalTime horaFin = LocalTime.parse("12:00:00.001");
        System.out.println(horaFin);

        System.out.println(horaInicio.plusHours(1));
        System.out.println(horaInicio.minusMinutes(1));
        System.out.println(horaInicio.isBefore(horaFin));

      /*  definir un fecha de fabricacion y una fecha de expiracion
        Calcular los dias, meses, años para que caduque*/

      /*  LocalDate fabricacion = LocalDate.of(2019,Month.MARCH, 1;
        LocalDate fabricacion = LocalDate.of(2019,Month.MARCH, 1;
        LocalDate expiracion = fabricacion.plusYears(1);
        System.out.println(expiracion);
        System.out.println(fabricacion.until(expiracion));
        System.out.println(expiracion.until(fabricacion));*/
        LocalDate fecha_fabric= LocalDate.of(2015,Month.MARCH, 1);
        LocalDate fecha_expira= LocalDate.of(2019,Month.MARCH, 1);
        System.out.println((Period.between(fecha_fabric, fecha_expira).getYears())+" año,"+(Period.between(fecha_fabric, fecha_expira).getMonths())+" meses y "+(Period.between(fecha_fabric, fecha_expira).getDays())+" días");


    }
}
