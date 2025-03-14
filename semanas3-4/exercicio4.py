# Crie um programa que recebe a nota do Grau A e a nota do Grau B pelo teclado e imprime na tela se será necessário ou não realizar o Grau C 
# (considere o sistema de avaliação da Unisinos, sendo o GA valendo 30% e o GB valendo 70%). 
# Caso algum valor informado seja negativo, informe uma mensagem de erro e não realize o cálculo.

notaGrauA = float(input("Por favor, digite a nota do Grau A: "))
notaGrauB = float(input("Por favor, digite a nota do Grau B: "))

if notaGrauA < 0 or notaGrauB < 0:
    print("Nota inválida!")
else:
    notaFinal = (notaGrauA * 0.3) + (notaGrauB * 0.7)
    if notaFinal >= 6.0:
        print("Não será necessária a realização do grau C!")
    else:
        print("Será necessária a realização do grau C!")