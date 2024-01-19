package Ejercicio02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CamelCaseTest {

    @Test
    void Test1() {
        assertEquals("elGuerreroSigiloso", CamelCase.camelCase("el-guerrero-sigiloso"));
    }

    @Test
    void Test2() {
        assertEquals("ElGuerreroSigiloso", CamelCase.camelCase("El-guerrero_Sigiloso"));
    }

    @Test
    void Test3() {
        assertEquals("ElGuerreroSigiloso", CamelCase.camelCase("El_Guerrero_Sigiloso"));
    }







    @Test
    void Test4() {
        assertEquals("", CamelCase.camelCase(""));
    }

    @Test
    void uniqueWord() {
        assertEquals("el", CamelCase.camelCase("el"));
        assertEquals("El", CamelCase.camelCase("El"));
    }

    @Test
    void dobleUnderScore(){
        assertEquals("el", CamelCase.camelCase("el__"));
        assertEquals("elGuerreroSigiloso", CamelCase.camelCase("elGuerrero__Sigiloso"));
    }
}