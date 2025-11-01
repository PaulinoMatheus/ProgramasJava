<h1>Projeto Métodos de Ordenação e Pesquisa - Tecnicas de Programação <img width="40" height="40" alt="image" src="https://github.com/user-attachments/assets/ab8ff325-b8b7-410c-9b80-f92ed3ee778b" /> </h1> 

<p>Este projeto foi desenvolvido em conjunto como atividade da disciplina de Técnicas de Programação ministrada pela Professora  <strong> Ingrid Barbosa.</strong></p>
<p> O projeto foi desenvolvido pelos alunos: Bruno Souza Santos, Kailaiane Borges, Maria das Dores e Matheus Lucena.</p>
<h2>
  Método InsertionSort <img width="30" height="30" alt="image" src="https://github.com/user-attachments/assets/9ec6753b-51f6-450a-a614-c4a25a0f5113" />
</h2>
<p> O método InsertionSort é um método de ordenação que percorre uma lista, um item de cada vez, e insere cada elemento em sua posição correta na sublista já ordenada. </p>
<Ol><li> <strong>Iteração: </strong> O algoritmo começa do segundo elemento, pois o primeiro elemento é considerado uma sublista já ordenada (tamanho 1).</li>
<li> <strong>Comparação e Deslocamento: </strong>Para cada elemento não ordenado, ele é comparado com os elementos da sublista ordenada à sua esquerda. Se um elemento à esquerda for maior, ele é deslocado uma posição para a direita.</li>
<li> <strong>Inserção: </strong>Esse processo de comparação e deslocamento continua até que a posição correta para o elemento atual seja encontrada (ou seja, quando um elemento menor ou o início da sublista é alcançado). O elemento atual é então inserido nesse espaço.</li>
<li> <strong>Repetição: </strong>O processo se repete para o próximo elemento não ordenado, até que toda a lista esteja percorrida e ordenada. </li>
</Ol>
<h2>
  Método BubbleSort <img width="30" height="30" alt="image" src="https://github.com/user-attachments/assets/7736145f-cabe-440d-8614-33e9b646af0e" />
</h2>
<p>O Bubble Sort, ou método de bolha é um método de ordenação que consiste em ordenar uma lista da seguinte forma: </p>
<ol><li><strong>Comparação Adjacente:</strong> O algoritmo começa no início da lista e compara o primeiro elemento com o segundo.</li>
<li><strong>Troca: </strong> Se eles estiverem na ordem errada (por exemplo, o primeiro é maior que o segundo em uma ordenação crescente), suas posições são trocadas.</li>
<li><strong>Iteração Contínua: </strong> O processo se move para o próximo par de elementos adjacentes (o segundo e o terceiro, e assim por diante) e continua a comparar e trocar, se necessário, até o final da lista.</li>
<li><strong>"Borbulhamento": </strong> Ao final de cada passagem completa pela lista, o maior elemento não ordenado estará garantidamente em sua posição final correta.</li>
<li><strong>Repetição do Processo: </strong> O algoritmo repete essas passagens várias vezes, mas a cada nova passagem, ele pode ignorar os elementos que já estão em suas posições finais ordenadas (pois já "borbulharam" para o lugar certo).</li>
<li><strong>Conclusão: </strong> O processo termina quando nenhuma troca é necessária durante uma passagem inteira pela lista, indicando que ela está completamente ordenada.</li> </ol>
<h2>
  Método Merge Sort  <img width="30" height="30" alt="image" src="https://github.com/user-attachments/assets/c67c73ff-eb9f-43ae-b3e4-b6159fdb66d4" />
</h2>
<ol><li>Duas sublistas já ordenadas são comparadas elemento por elemento.</li>
<li>O menor elemento de cada sublista é selecionado e colocado em uma nova lista temporária.</li>
<li>Esse processo é repetido até que todos os elementos das duas sublistas tenham sido movidos para a lista temporária.</li>
<li>A lista temporária, agora ordenada, substitui as duas sublistas originais. </li></ol>
<h2>
  Método Linear Search <img width="30" height="30" alt="image" src="https://github.com/user-attachments/assets/ed844925-6d95-4c25-b706-a61782f49e89" />
</h2>
<ol><li><strong>Início na Primeira Posição:</strong> A busca começa verificando o primeiro elemento da lista (índice 0).</li>
<li><strong>Comparação Sequencial:</strong> O algoritmo compara o elemento atual com o valor alvo (o item que se está procurando).</li>
<li><strong>Sucesso: </strong>Se o elemento atual for igual ao valor alvo, a busca é concluída com sucesso e o índice (posição) do elemento é retornado. Neste caso o processo é interrompido imediatamente</li>
<li><strong> Item Não encontrado:</strong> Se o elemento atual não for igual ao valor alvo, a busca avança para o próximo elemento da lista.</li>
<li><strong> Fim da lista (Item ausente): </strong> Se todos os elementos da lista forem verificados e o valor alvo não for encontrado, a busca é concluída sem sucesso. Geralmente, um valor especial (como -1 ou <code>null</code>, dependendo da linguagem de programação) é retornado para indicar que o item não está presente na lista. </li>
</ol>
<h2>Método Binary Search <img width="30" height="30" alt="image" src="https://github.com/user-attachments/assets/9eb6d210-55c7-4d4b-bb31-06faaac6b21a" />


</h2>
<p><strong>Observação: </strong> Para prosseguir com a utilização do Método Binary Search, a lista já deve estar ordenada.</p>
<ol><li><strong>Comparação Central: </strong>O algoritmo começa examinando o elemento do meio da lista.</li>
<li><strong>Divisão: </strong>Se o elemento do meio for igual ao valor procurado, a busca é concluída com sucesso.</li>
  <ul type="disc"><li><strong>Divisão menor: </strong> Se o valor procurado for menor que o elemento do meio, o algoritmo ignora a metade direita da lista e continua a busca apenas na metade esquerda.</li>
  <li><strong> Divisão Menor: </strong> Se o valor procurado for maior que o elemento do meio, o algoritmo ignora a metade esquerda da lista e continua a busca apenas na metade direita.</li>
  </ul>
<li><strong>Repetição: </strong> Esse processo de divisão e comparação é repetido recursivamente (ou iterativamente) na sublista restante, até que o elemento desejado seja encontrado ou até que o intervalo de busca se torne vazio (indicando que o item não está na lista). </li>
</ol>
<h1>Comparação de valores de tempo e desempenho </h1>
<p><div align="center"><img width="298" height="224" alt="DesempenhoTempo_AVC_III" src="https://github.com/user-attachments/assets/c7905e24-3a2c-46f9-8883-f895a05b5d35" /></div></p>
<p>Os valores acima se referem a pesquisa realizada na lista para encontrar o número 10, encontrado na segunda posição da lista. <code>Lista[1]</code></p>
<h2>Analise de desempenho e tempo: </h2>
<p>A diferença fundamental está em como o tempo de execução do algoritmo cresce em 
relação ao tamanho da entrada (n). Para grandes valores de n, O(n log n) é 
significativamente mais rápido e eficiente que O(n^2) porque (log n) cresce muito mais 
lentamente que n.</p>
<p>Para selecionar um algoritmo em um sistema real, o critério de escolha é um equilíbrio 
entre a eficiência assintótica e os recursos disponíveis. Em sistemas com grandes 
volumes de dados, a escalabilidade é fundamental, priorizando algoritmos com 
complexidade de tempo superior, como O(n log n) para ordenação. Se a memória for 
um recurso limitado, a complexidade de espaço (preferindo algoritmos in-place) torna-se crucial. Por fim, a simplicidade de implementação, a estabilidade do algoritmo e a 
natureza dos dados de entrada (ordenados ou desordenados) também influenciam a 
decisão para garantir que a solução seja prática, fácil de manter e otimizada para o 
cenário específico do sistema</p>
