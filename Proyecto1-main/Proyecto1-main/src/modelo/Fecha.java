package modelo;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Fecha 
{
    //Atributos

    private LocalDate fechaInit;
    private LocalDate fechaFinit;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    //Generador
    public Fecha(int diaInit, int mesInit, int anoInit, int diaFinit, int mesFinit, int anoFinit)
    {
        this.fechaInit = LocalDate.of(anoInit, mesInit, diaInit);
        this.fechaFinit = LocalDate.of(anoFinit, mesFinit, diaFinit);
    }

    //Getters and Setters
    public LocalDate getFechaInit() {
        return fechaInit;
    }

    public void setFechaInit(LocalDate fechaInit) {
        this.fechaInit = fechaInit;
    }

    public LocalDate getFechaFinit() {
        return fechaFinit;
    }

    public void setFechaFinit(LocalDate fechaFinit) {
        this.fechaFinit = fechaFinit;
    }
    
    public String getInicio() {
        String fechaStr = fechaInit.format(formatter);
        return fechaStr;
    }
    
    public String getFinal() {
        String fechaStr = fechaFinit.format(formatter);
        return fechaStr;
    }

    //Metodos
    public LocalDate toLocalDate(String fechaStr) {
        LocalDate fechaDate = LocalDate.parse(fechaStr, formatter);
        return fechaDate;
    }
}
