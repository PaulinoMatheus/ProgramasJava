package apresentacaoingrid;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ApresentacaoIngrid {

    public static void main(String[] args) {
        int[] listaBaguncada = new int[50];// Cria uma lista de números de 50 posições.
        Random geradorNumeros = new Random();// biblioteca para gerar numeros aleatórios
        Scanner sc = new Scanner(System.in);// Dá a opção do usuario vai digitar

        for (int i = 0; i < listaBaguncada.length; i++) {
            listaBaguncada[i] = geradorNumeros.nextInt(101);//Passando um valor aleatório para a posição i da lista bagunçada com limite até 100
        }
        System.out.println("Lista Gerada: ");
        System.out.println(Arrays.toString(listaBaguncada));

        int[] listaInsertion = listaBaguncada.clone();// clona a lista bagunçada
        int[] listaBubble = listaBaguncada.clone();//Matheus L: clona a lista bagunçada para calcular o método bubble de ordenação
        int[] listaMerge = listaBaguncada.clone();// Lista para o Merge Sort - Kailaine

        int[] lista = listaBaguncada.clone();
        int[] lista3 = listaBaguncada.clone();

        long inicioInsertion = System.nanoTime();//método para armazenar o tempo em nano segundos no momento que for chamado.
        int comparacoesInsertion = insertionSort(listaInsertion);//Método que realiza a ordenação por inserção
        long fimInsertion = System.nanoTime();//Método para armazenar o tempo na hora que for chamado.
        long tempoExecucaoInsertion = fimInsertion - inicioInsertion;

        System.out.println("Digite o numero a ser pesquisado");
        int numeroASerPesquisado = sc.nextInt();// Vai receber um número digitado pelo usuário e guarda no numero a ser pesquisado

        long inicioLinear = System.nanoTime();
        int comparacoesLinear = linearSearch(listaInsertion, numeroASerPesquisado);// Método para pesquisar um numero na lista
        long fimLinear = System.nanoTime();
        long tempoExecucaoLinear = fimLinear - inicioLinear;

        long inicioBubble = System.nanoTime(); // Matheus L: Utilizado para registrar o momento de início do algoritmo BubbleSort
        int comparacoesBubble = bubbleSort(listaBubble); // Matheus L: Utiliza a variável de quantidade de comparacoes para saber quando tempo levou até estar concluida
        long fimBubble = System.nanoTime(); // Matheus L: Registra o momento que a ordenação BubbleSort termina
        long tempoExecucaoBubble = fimBubble - inicioBubble; // Matheus L: Subtrai os valores de início e fim para obter o tempo exato de duração do processo de ordenação

        // Merge Sort - Kailaine
        long inicioMerge = System.nanoTime();
        int comparacoesMerge = mergeSort(listaMerge, 0, listaMerge.length - 1 );
        long fimMerge = System.nanoTime();
        long tempoMerge = fimMerge - inicioMerge;


        System.out.println("============== RESULTADOS =============");
        System.out.println("Lista Baguncada: ");
        System.out.println(Arrays.toString(listaBaguncada));// Transforma a lista em texto e mostra na tela.
        System.out.println("Lista Ordenada (InsertionSort): ");
        System.out.println(Arrays.toString(listaInsertion));
        System.out.println("Lista Ordenada (BubbleSort): "); // Matheus L: Transforma a lista já ordenada com o BubbleSort em texto para exibir para o usuário
        System.out.println(Arrays.toString(listaBubble));
        System.out.println("Lista ordenada (MergeSort):");// Lista Ordenada
        System.out.println(Arrays.toString(listaMerge));


        System.out.println("========================================");
        System.out.println("RESULTADOS DAS BUSCAS: ");
        System.out.println("Item Buscado: " + numeroASerPesquisado);
        if (comparacoesLinear != -1 ) {
           System.out.println("O Numero " + numeroASerPesquisado + " foi encontrado com: ");
            System.out.println(comparacoesLinear + " comparacoes");

        } else {
            System.out.println("Nao encontrou");
            

        }
        
        System.out.println("======================================");
        System.out.println("algoritmo | tempo (ns) | tempo (ms)");// O algoritmo esta pegando o tempo de milli segundos para nano segundos
        System.out.printf("InsertionSort | %d  | %.3f %n", tempoExecucaoInsertion, tempoExecucaoInsertion / 1_000_000.0);//%d é um numero, %.3 é um numero float com 3 casas decimais 
        System.out.printf("LinearSearch | %d  | %.3f %n", tempoExecucaoLinear, tempoExecucaoLinear / 1_000_000.0);//%d é um numero, %.3 é um numero float com 3 casas decimais 
        System.out.printf("BubbleSort | %d | %.3f %n", tempoExecucaoBubble, tempoExecucaoBubble/1_000_000.0);//Matheus L: %d é um número, %3 é um número float com 3 casas decimais
        // Tempo de execução
        System.out.printf("Merge Sort | %d | %.3f %n", tempoMerge, tempoMerge / 1_000_000.0);

        
        System.out.println("=========================================");
        System.out.println("algoritmo | comparacoes");
        System.out.printf("InsertionSort | %d %n", comparacoesInsertion);
        System.out.printf("BubbleSort | %d %n", comparacoesBubble);
        System.out.printf("LinearSearch | %d %n", comparacoesLinear); //Matheus L: Indica o algoritmo e a quantidade de iterações que precisaram ser feitas para concluir a ordenação
        // Tabela de comparações
        System.out.printf("Merge Sort | %d %n", comparacoesMerge);

    }

    public static int insertionSort(int[] lista) {
        int tamanhoLista = lista.length;
        int verificacoesComp = 0;

        for (int i = 1; i < tamanhoLista; i++) {
            int chave = lista[i];//chave = número que está na lista na posição i
            int j = i - 1;// j = número do índice i - 1,representando o número anterior a posição i
            while (j >= 0 && lista[j] > chave) {// tem que da 2 truee para continuar
                verificacoesComp++;
                lista[j + 1] = lista[j];// lista valor de jota + 1, lista [j]posição j
                j--;//Decrementa 1

            }
            lista[j + 1] = chave;// j + 1 recebe a chave
        }
        return verificacoesComp;

    }

    public static int linearSearch(int[] lista, int alvo) {
        int tamanhoLista = lista.length;
        int verificacoesComp = 0;

        for (int i = 0; i < tamanhoLista; i++) {
            verificacoesComp++;
            if (lista[i] == alvo) {
                return verificacoesComp;
            }
        }
        return -1;

    }
    public static int bubbleSort(int[] lista) {
        int tamanhoLista = lista.length;
        int verificacoesComp = 0;

        for(int i = 1; i < tamanhoLista; i++){ //Matheus L: Verifica se a condicional i percorreu todas as posições da lista
            verificacoesComp++; //Matheus L: Registra o número de iterações feitas durante o processo de ordenação
            int chave = lista [i];//Matheus L: Chave para armazenar o valor que será trocado na ordenação
            int j = i-1; //Matheus L: reduz o valor do índice em 1 para selecionar a posição anterior

            while (j >= 0  && lista[j] > chave) { //Matheus L: verifica se o valor de j é menor que 0 (indicando que encerrou a verificação) e se o valor na posição de j é menor que o valor armazenado na chave, indicando que é necessário realizar a substituição
                lista [j+1] = lista [j]; // Matheus L: Caso as condições anteriores sejam verdadeiras, realiza a substituição do valor na tabela
                j--; //Matheus L: Realiza o decremento do valor de j para seguir com a analise da próxima posição
            }
            lista[j+1] = chave; //Matheus L: Armazena a chave para que possa realizar a substituição
        }
        return verificacoesComp; //Matheus L: armazena o número de iterações feitas dentro do código e armazena para exibir ao usuário ao final do processo


    }
    // Merge Sort - Kailaine
public static int mergeSort (int[] array, int inicio, int fim){
    int comparacoes = 0;

    // Caso base: se o inicio for maior ou igual que o fim, significa que a lista tem 0 ou 1 elemento (já ordenada)
    if (inicio < fim) {
        // Pega o meio, ele irá ser o pivô da divisão.
        int meio = (inicio + fim) / 2;

        // Divide a lista no meio (soma e armazena as comparações feitas)
        comparacoes += mergeSort(array, inicio, meio);
        comparacoes += mergeSort(array,meio + 1, fim);

        // Depois de divida, junta as duas metades (soma e armazena as comparações feitas)
        comparacoes += merge(array, inicio,meio, fim);
    }
    // Retorna as comparações feitas no algoritmo
    return comparacoes;
}

public static int merge(int[] array, int inicio, int meio, int fim){
    int comparacoes = 0;
    // Define o tamanho das metades
    int tamanhoEsq = meio - inicio + 1;
    int tamanhoDir = fim - meio;

    // Define os arrays das metades
    int [] arrayEsq = new int[tamanhoEsq];
    int [] arrayDir = new int[tamanhoDir];

    // Popula o array esquerdo com os valores correspondente do lado esquerdo da lista
    for (int i = 0; i< tamanhoEsq;++i){
        arrayEsq[i] = array[inicio + i];
    }
    // Popula o array direito com os valores correspondente do lado direito da lista
    for (int j = 0; j < tamanhoDir; ++j){
        arrayDir[j] = array[meio + 1 + j];
    }
    int i = 0, j = 0;
    int k = inicio;
    // Enquanto houver elementos em ambas as metades, compara e copia o menor (incrementa a variavel comparacoes)
    while (i < tamanhoEsq && j < tamanhoDir) {
        comparacoes++;

        if (arrayEsq[i] <= arrayDir[j]){
            array[k] = arrayEsq[i];
            i++;
        } else {
            array[k]= arrayDir[j];
            j++;
        }
        k++;
    }
    // copia os elementos restantes (não incrementa comparacoes por que não vericamos os elementos dentro dos loops)
    while (i < tamanhoEsq){
        array[k]= arrayEsq[i];
        i++;
        k++;
}
    while (j < tamanhoDir){
        array[k]= arrayDir[j];
        j++;
        k++;
    }
    return comparacoes;
}


}
