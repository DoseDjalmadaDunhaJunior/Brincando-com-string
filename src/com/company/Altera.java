package com.company;

public class Altera {
    //converte tudo para maiusculo
    public String maiusculo(String aux) {
        return aux.toUpperCase();
    }

    //converte tudo para minusculo
    public String minusculo(String aux) {
        return aux.toLowerCase();
    }

    //converte apenas 1 letra para maiusculo
    public String umaLetraMaiusculo(String aux, int po) {
        converteChar(aux);
        try {
            po = po - 1;
            vet[po] = Character.toUpperCase(vet[po]);
            String oi = new String(vet);
            return oi;
            //return aux.replace('a','A');
            //}
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("posicao invalida");
        }
        return "";
    }

    //converte apenas 1 letra para minusculo
    public String umaLetraMinusculo(String aux, int po) {
        converteChar(aux);
        try {
            po = po - 1;
            vet[po] = Character.toLowerCase(vet[po]);
            String oi = new String(vet);
            return oi;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("posicao invalida");
        }
        return "";
    }

    //anda de acordo com a tabela ascii o numero de posicoes inserida pelo usuario
    public String criptografia(String aux, int num) {
        converteChar(aux);
        int i = 0;
        while (i < vet.length){
            vet[i] = (char) (vet[i] + num);
            i++;
        }
        return new String(vet);
    }
    
    //converte uma String em vetor Char
    public void converteChar(String txt){
        vet = txt.toCharArray();
    }

    //retorna o vetor Char
    public char[] getVet() {
        return vet;
    }

    private char[] vet;
}
