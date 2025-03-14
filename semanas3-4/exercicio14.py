# Exercício 14. Utilizando for, crie um programa que imprime a tabuada de um número inteiro digitado pelo usuário.

numero = int(input("Por favor, digite um número inteiro: "))

for i in range (1, 11):
    print(f"{numero} x {i} = {numero * i}")