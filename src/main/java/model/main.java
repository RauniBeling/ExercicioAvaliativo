package model;

import java.util.ArrayList;
import java.util.logging.Logger;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.logging.Level;
import logger.Log;


        
public class main {

    public static void main(String[] args) {       
        try{
        BufferedWriter bw = new BufferedWriter(new FileWriter("funcionario.txt", true));
        Log my_log = new Log("log.txt");
        my_log.logger.setLevel(Level.ALL);
        Funcionario F = new Funcionario("José", 1000, 25, "Programador", 4, 0, "Superior", 5, "Generoso");
        bw.append("\nNome: José\nSalário: 1000\nIdade: 25\nCargo: Programador\nArtefatos: 4\nFaltas: 0\nGraduação: Superior\nTempo de Empresa: 5\nTipo de Bonus: Generoso\nBonus Recebidos: ");
        
        ArrayList<ICalculadoraBonus> CalculadoraBonus = new ArrayList<>();
        CalculadoraBonus.add(new CalculadoraAssiduidade());
        CalculadoraBonus.add(new CalculadoraArtefato());
        CalculadoraBonus.add(new CalculadoraGraduacao());
        CalculadoraBonus.add(new CalculadoraTempoDeEmpresa()); 
        CalculadoraBonus.forEach(ICalculadoraBonus -> {try {
            ICalculadoraBonus.calcula(F); System.out.println(F.getTipoBonus()); bw.append(F.getTipoBonus() + ", ");
            } catch (IOException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
});        
        bw.append("\nValor Total: " + F.getValorBonus());
        System.out.println(F.getValorBonus());
        
        
        bw.close();
        }
        catch (Exception e){
             System.out.println("mensagem de erro");
        }
    }
    
}
