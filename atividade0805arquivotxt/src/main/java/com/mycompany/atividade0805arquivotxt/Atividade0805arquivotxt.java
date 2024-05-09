/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade0805arquivotxt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author DELL
 */
public class Atividade0805arquivotxt {

    public static void main(String[] args) {
         // Passo 1: Criação de um arquivo de texto
        File pasta = new File("MeusArquivos");
        pasta.mkdir();
        File arquivo = new File(pasta, "tabuada.txt");
        try {
            arquivo.createNewFile();
            System.out.println("Arquivo criado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao criar o arquivo");
            e.printStackTrace();
        }

        // Passo 2: Escrevendo a tabuada do 9 no arquivo
        try {
            FileWriter fileWriter = new FileWriter(arquivo);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (int i = 1; i <= 10; i++) {
                int resultado = 9 * i;
                String linha = "9 x " + i + " = " + resultado;
                bufferedWriter.write(linha);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            fileWriter.close();

            System.out.println("Tabuada escrita no arquivo com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao escrever a tabuada no arquivo");
            e.printStackTrace();
        }

        // Passo 3: Leitura do arquivo e impressão no console
        try {
            FileReader fileReader = new FileReader(arquivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }

            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo");
            e.printStackTrace();
        }

        // Passo 4: Exclusão do arquivo
        if (arquivo.delete()) {
            System.out.println("Arquivo excluído com sucesso!");
        } else {
            System.out.println("Erro ao excluir o arquivo");
        }
     }
}
