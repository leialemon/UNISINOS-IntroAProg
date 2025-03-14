#Exercício 1. Crie um programa que recebe um inteiro pelo teclado e imprime se ele é par ou ímpar.
numeroAnalise = int(input("Digite um número inteiro: "))

resultado = numeroAnalise % 2

if resultado == 0:
    print(f"O número {numeroAnalise} é PAR!")
else:
    print(f"O número {numeroAnalise} é ÍMPAR!")