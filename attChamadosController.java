/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabchamdospoo;

import java.util.ArrayList;

/**
 *
 * @author Samuel
 */
public class attChamadosController {
    
    private static ArrayList<attChamados> listaChamados = new ArrayList<>();
     
     public boolean salvar(attChamados chamado) {
         if (chamado != null) {
             listaChamados.add(chamado);
             return true;
         } else {
             return false;
         }
     }

     public ArrayList<attChamados> listar() {
         return listaChamados;
     }
     
     public boolean atualizar(int index, attChamados chamadoAtualizado) {
         if (index >= 0 && index < listaChamados.size() && chamadoAtualizado != null) {
             listaChamados.set(index, chamadoAtualizado);
             return true;
         } else {
             return false;
         }
     }  
     
     public boolean excluir(int index) {
         if (index >= 0 && index < listaChamados.size()) {
             listaChamados.remove(index);
             return true;
         } else {
             return false;
         }
     }
     
     public ArrayList<attChamados> pesquisar(String termo){
            ArrayList<attChamados> resultados = new ArrayList<>();
            for (attChamados chamado : listaChamados) {
                if (chamado.getUsuario().contains(termo.toLowerCase())){
                    resultados.add(chamado);
                }
            }
            return resultados;

     }

    
}
