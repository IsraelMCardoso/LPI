algoritmo "Calculo_Media_FATEC"

var
   P1, E1, E2, X, SUB, API, EXF: real
   base, diferenca, parte1, parteAPI, notaCalculada, notaFinal: real

inicio

   escreval("====================================")
   escreval("       CALCULO DE MEDIA FATEC")
   escreval("====================================")

   escreva("Digite a nota P1: ")
   leia(P1)

   escreva("Digite a nota E1: ")
   leia(E1)

   escreva("Digite a nota E2: ")
   leia(E2)

   escreva("Digite a nota X (Atividades Extras): ")
   leia(X)

   escreva("Digite a nota SUB (Substitutiva): ")
   leia(SUB)

   escreva("Digite a nota API: ")
   leia(API)

   // Calculo da base
   base <- (P1 * 0.5) + (E1 * 0.2) + (E2 * 0.3) + X + (SUB * 0.15)

   // Primeira parte da formula
   parte1 <- base * 0.5

   // Diferenca da aprovacao
   diferenca <- base - 5.9

   // Parte do API
   se diferenca > 0 entao
      parteAPI <- API * 0.5
   senao
      parteAPI <- 0
   fimse

   // Nota calculada antes do EXF
   notaCalculada <- parte1 + parteAPI
   escreval("Nota antes do exame final: ",notaCalculada:5:2)
   // Verifica aprovacao antes do EXF
   se notaCalculada >= 6.0 entao

      notaFinal <- notaCalculada

      escreval("Aluno aprovado sem Exame Final.")

   senao
      //precisa de media 4 para fazer o EXF
      se notaCalculada >= 4.0
         escreval("Aluno precisa realizar o Exame Final.")
         escreva("Digite a nota do EXF: ")
         leia(EXF)

         // EXF substitui a nota anterior
         notaFinal <- EXF
      senao
         //nao pode fazer EXF
         escreval("Aluno não atinge a nota mínima para exame final")
      fimse
   fimse

   // Resultado
   escreval("")
   escreval("====================================")
   escreval("Nota final: ", notaFinal:5:2)

   se notaFinal >= 6.0 entao
      escreval("STATUS: APROVADO")
   senao
      escreval("STATUS: REPROVADO")
   fimse

   escreval("====================================")

fimalgoritmo