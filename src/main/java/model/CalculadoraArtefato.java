package model;




public class CalculadoraArtefato implements ICalculadoraBonus {

    @Override
    public void calcula(Funcionario F){

        if(F.getArtefato() >= 5){
                F.setValorBonus(F.getValorBonus() + 100); 
                F.setTipoBonus("Artefato");
            }
            else if (F.getArtefato() >= 4 ){
                F.setValorBonus(F.getValorBonus() + 75);
                F.setTipoBonus("Artefato");
            }
            else if (F.getArtefato() >= 3){
                F.setValorBonus(F.getValorBonus() + 50);
                F.setTipoBonus("Artefato");
            }
            else if (F.getArtefato() >= 2){
                F.setValorBonus((F.getValorBonus()));
            }
    }
}
