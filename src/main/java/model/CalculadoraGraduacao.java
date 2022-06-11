package model;




public class CalculadoraGraduacao implements ICalculadoraBonus {

    @Override
    public void calcula(Funcionario F){
        F.setTipoBonus("Graduação");        
        if(F.getGraduacao().equals("Médio")){
                F.setValorBonus(F.getValorBonus());
            }
            else if (F.getGraduacao().equals("Superior")){
                F.setValorBonus(F.getValorBonus() + (F.getSalario()*1.1 - F.getSalario()));
            }
            else if (F.getGraduacao().equals("Mestrado")){
                F.setValorBonus(F.getValorBonus() + (F.getSalario()*1.15 - F.getSalario()));
            }
            else if (F.getGraduacao().equals("Doutorado")){
                F.setValorBonus(F.getValorBonus() + (F.getSalario()*1.2 - F.getSalario()));
            }
    }
}
