package br.edu.insper.calculadoradehonorarios;

import java.util.ArrayList;

/**
 * Created by Rafael on 5/20/2016.
 */
public class Categoria {
    private String nome;
    private int posicao;
    private int numeroDeSubcategorias;
    private ArrayList<Subcategoria> subcategorias;

    public Categoria (String categoria, int posicao) {
        nome = categoria.substring(0, categoria.indexOf("("));
        char tirar = '"';
        if (nome.charAt(0) == tirar) {
            nome = nome.substring(1);
        }
        this.posicao = posicao;
        numeroDeSubcategorias = 0;
        subcategorias = new ArrayList<>();
    }

    public void criarSubcategoria (Subcategoria subcategoria) {
        subcategorias.add(subcategoria);
    }

    public String retornaNomeDaCategoria () {
        return nome;
    }

    public ArrayList<Subcategoria> retornaSubcategorias () {
        return subcategorias;
    }

    public boolean temSubcategoria (Subcategoria subcategoria) {
        boolean temSubcategoria = subcategorias.contains(subcategoria);
        return temSubcategoria;
    }

    public Subcategoria retornaUltimaSubcategoria () {
        try {
            return subcategorias.get(subcategorias.size()-1);
        }
        catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return null;
        }
    }
}
