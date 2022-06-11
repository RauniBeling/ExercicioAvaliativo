package model;




public class CalculadoraAssiduidade implements ICalculadoraBonus {
 
    @Override
    public void calcula(Funcionario F){
        F.setTipoBonus("Assiduidade");    
        if(F.getFaltas() == 0){
                F.setValorBonus(F.getValorBonus() + (F.getSalario()*1.1 - F.getSalario()));
            }
            else if (F.getFaltas() >= 1 || F.getFaltas() <= 3){
                F.setValorBonus(F.getValorBonus() + (F.getSalario()*1.05 - F.getSalario()));
            }
            else if (F.getFaltas() >= 4 || F.getFaltas() <= 5){
                F.setValorBonus(F.getValorBonus() + (F.getSalario()*1.01 - F.getSalario()));
            }            
            else if (F.getFaltas() >= 6){
                F.setValorBonus(F.getValorBonus() + (F.getSalario()*1.01 - F.getSalario()));
            }            
        }
    }

