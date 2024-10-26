package empresa;
/**
 *
 * @author Lucas
 */
public enum Categoria {
    ALIMENTICIOS(0), FERRAMENTAS(1), ELETRODOMESTICOS(2), ELETRONICOS(3), PEÇAS(4), ROUPAS(5), MAQUIAGENS(6), ACESSORIOS(7), JOIAS(8), BRINQUEDOS(9);
    
    Integer indice;
    Categoria(Integer indice){
        this.indice=indice;
    }
}
  