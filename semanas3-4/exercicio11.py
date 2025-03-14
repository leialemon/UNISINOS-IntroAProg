# Exercício 11. Utilizando while, crie um programa que solicita para o usuário que ele digite 10 valores inteiros. 
# Ao final, imprima a soma de todos os valores digitados. 

i = 0
listaDeNumeros = []
while i < 10:
    numero = int(input("Por favor, digite um número inteiro: "))
    listaDeNumeros.append(numero)
    i += 1

total = 0
for i in listaDeNumeros:
    total += i
print(f"A soma de todos os números informados é: {total}")