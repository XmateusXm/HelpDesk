package com.helpdesk.excepions;

public class ChamadoNaoEncontradoException  extends RuntimeException{
     public ChamadoNaoEncontradoException(String message){
         super(message);
     }
}
