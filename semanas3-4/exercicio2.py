# Exercício 2: Crie um programa que recebe dois valores inteiros A e B pelo teclado e imprime o valor de A dividido por B. Entretanto, se o valor de B for 0, imprima uma mensagem de erro e não faça a divisão.
a = int(input("Digite um número inteiro: "))
b = int(input("Digite um número inteiro diferente de zero: "))

if b == 0:
    print("Não é possível dividir por 0!")
else:
    print(f"O valor de {a} dividido por {b} é: {a/b}")