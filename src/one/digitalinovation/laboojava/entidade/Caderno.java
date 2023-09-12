package one.digitalinovation.laboojava.entidade;

import one.digitalinovation.laboojava.entidade.constantes.Materia;

//classe que representa um caderno
public class Caderno extends Produto {

    private Materia materia;

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public double calcularFrete() {
        return (getPreco() * getQuantidade()) + (1 + materia.getFator());
    }

    public String toString() {
        return "Caderno{" +
                ", materias=" + materia + '\'' +
                ", codigo='" + getCodigo() + '\'' +
                ", preço='" + getPreco() + '\'' +
                '}';
    }
}

