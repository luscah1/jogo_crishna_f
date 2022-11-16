package com.mycompany.jogo_crishna;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import javax.swing.JOptionPane;

public class conecta_mongo {
    
    public void insertNome(){
        entradaDados player = new entradaDados();
        
        player.setNome(JOptionPane.showInputDialog("Qual será o seu nome nessa jornada ?"));
        System.out.println(player.getNome());
        
    }
}
