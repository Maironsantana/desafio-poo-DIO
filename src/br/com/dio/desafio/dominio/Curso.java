package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargahoraria = 8;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargahoraria;
    }

    public Curso(String titulo, String descricao, int cargahoraria ) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.cargahoraria = cargahoraria;
    }


    public int getCargahoraria(int i) {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    @Override
    public String toString() {
        return  getTitulo() + '\n' +
                getDescricao() + '\n' +
                "Carga Horaria: " + cargahoraria + " horas";
    }
}
