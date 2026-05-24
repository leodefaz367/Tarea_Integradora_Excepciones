package util;

import excepciones.DatoInvalidoException;

public class validador {
    public static void validarTexto(String texto)throws DatoInvalidoException{
        if(texto == null || texto.trim().isEmpty()){
            throw new DatoInvalidoException("Campo vacio");
        }
    }

    public static void validarEdad(int edad)throws DatoInvalidoException{
        if (edad<1||edad>150){
            throw new DatoInvalidoException("Edad invalida");
        }
    }

    public static void validarCorreo(String correo)throws DatoInvalidoException{
        if(!correo.contains("@")|| !correo.contains(".")){
            throw new DatoInvalidoException("Correo invalido");
        }
    }

    public static void validarNumeroPositivo(double numero)throws DatoInvalidoException{
        if (numero<=0){
            throw new DatoInvalidoException("Numero invalido");
        }
    }

}
