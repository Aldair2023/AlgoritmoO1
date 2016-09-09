/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import javax.swing.JOptionPane;

/**
 *
 * @author aldair
 */
public class Fraccionario {
  private int Numerador;
  private int Denominador;
  
  
  public Fraccionario(int Numerador, int Denominador) throws DenominadorCeroException{
      this.Numerador = Numerador;
      this.Denominador = Denominador;
      
      if(Denominador == 0){
            throw new DenominadorCeroException();
      }
  }

    public int getNumerador() {
        return Numerador;
    }

    public void setNumerador(int Numerador) {
        this.Numerador = Numerador;
    }

    public int getDenominador() {
        return Denominador;
    }

    public void setDenominador(int Denominador) {
        this.Denominador = Denominador;
    }

  public Fraccionario sumar(Fraccionario f2) throws DenominadorCeroException{
        Fraccionario f;
        int num, den;
        
        num = this.Numerador * f2.Denominador + this.Denominador * f2.Numerador;
        den = this.Denominador * f2.Denominador;
        
        f = new Fraccionario(num, den);
        return f;
    }
    
    public Fraccionario restar(Fraccionario f2) throws DenominadorCeroException{
        Fraccionario f;
        int num, den;
        
        num = this.Numerador * f2.Denominador - this.Denominador * f2.Numerador;
        den = this.Denominador * f2.Denominador;
        
        f = new Fraccionario(num, den);
        return f;
    }
    
    public Fraccionario multiplicar(Fraccionario f2) throws DenominadorCeroException{
        Fraccionario f;
        int num, den;
        
        num = this.Numerador * f2.Numerador;
        den = this.Denominador * f2.Denominador;
        
        f = new Fraccionario(num, den);
        return f;
    }
    
    public Fraccionario division(Fraccionario f2) throws DenominadorCeroException{
        Fraccionario f;
        int num, den;
        
        num = this.Numerador * f2.Denominador;
        den = this.Denominador * f2.Numerador;
        
        f = new Fraccionario(num, den);
        return f;
    }

}


