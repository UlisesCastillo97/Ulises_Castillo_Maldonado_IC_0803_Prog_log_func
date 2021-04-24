package com.banco;

import com.banco.Cliente.persona;

public final class Persona {
    private String nombre;
    private char sexo;
    private double saldo;
    private double domicilio;
    private boolean ocupado;
    private Cliente persona;

    public Persona(String nombre, char sexo, double saldo, double domicilio, double ocupado){
        this.setTodosDatos(nombre, sexo, saldo, domicilio, ocupado);
    
    Cliente(Cliente cliente){
        this.setTodosDatos(persona);
    }

    private void setTodosDatos(){
        this.nombre = null;
        this.sexo = ' ';
        this.saldo = 0.0;
        this.ocupado = false;
        this.domicilio = null;
    }
public void setTodosDatos(String nombre, char sexo, double saldo, double domicilio, boolean ocupado){
        this.nombre = nombre;
        this.validarSexo(sexo);
        this.validarSaldo(saldo);
        this.setOcupado();
        this.domicilio = domicilio;
    }

    public void setTodosDatos(Cliente cliente){
        this.nombre = cliente.getNombre();
        this.validarSexo(cliente.getSexo());
        this.validarSaldo(cliente.getSaldo());
        this.setOcupado();
        this.domicilio = cliente.getdomicilio();
    }

    /*public Cliente getTodosDatos(){
        Cliente temporal = new Cliente();
        temporal.nombre = this.getNombre();
        temporal.sexo = this.getSexo();
        temporal.saldo = this.getSaldo();
        temporal.ocupado = this.isOcupado();
        temporal.domicilio = this.isDomicilio();
        return temporal;
    }*/

    private void validarSexo(char sexo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void validarSaldo(double saldo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setOcupado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setTodosDatos(String nombre, char sexo, double saldo, double domicilio, double ocupado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    }
}