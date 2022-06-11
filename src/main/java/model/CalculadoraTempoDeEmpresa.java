package model;




public class CalculadoraTempoDeEmpresa implements ICalculadoraBonus {
 
    @Override
    public void calcula(Funcionario F){            
        if(F.getTempoDeEmpresa() == 0){
                F.setValorBonus(F.getValorBonus());
            }
            else if (F.getTempoDeEmpresa() >= 1 || F.getTempoDeEmpresa() <= 5){
                F.setValorBonus(F.getValorBonus() + (F.getSalario()*1.02 - F.getSalario()));
                F.setTipoBonus("Tempo de Empresa");
            }
            else if (F.getTempoDeEmpresa() >= 6 || F.getTempoDeEmpresa() <= 10){
                F.setValorBonus(F.getValorBonus() + (F.getSalario()*1.03 - F.getSalario()));
                F.setTipoBonus("Tempo de Empresa");
            }            
            else if (F.getTempoDeEmpresa() >= 11 || F.getTempoDeEmpresa() <= 15){
                F.setValorBonus(F.getValorBonus() + (F.getSalario()*1.08 - F.getSalario()));
                F.setTipoBonus("Tempo de Empresa");
            }
            else if (F.getTempoDeEmpresa() >= 16 || F.getTempoDeEmpresa() <= 20){
                F.setValorBonus(F.getValorBonus() + (F.getSalario()*1.1 - F.getSalario()));
                F.setTipoBonus("Tempo de Empresa");
            }
            else if (F.getTempoDeEmpresa() > 20){
                F.setValorBonus(F.getValorBonus() + (F.getSalario()*1.15 - F.getSalario()));
                F.setTipoBonus("Tempo de Empresa");
            }            
        }
    }

