package br.com.phelto.githubactions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClasseTesteTest {

    @Test
    @DisplayName("teste inicial")
    void deveGerarClasseCorretamente(){

        ClasseTeste teste = new ClasseTeste();
        teste.setApelido("Apelido");
        teste.setNome("Nome Completo");
        teste.setIdade(10);

        Assertions.assertEquals("Apelido",teste.getApelido());
        Assertions.assertEquals("Nome Completo",teste.getNome());
        Assertions.assertEquals(10,teste.getIdade());

    }

}