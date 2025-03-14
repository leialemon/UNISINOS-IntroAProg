# Exercício 15. Crie um programa que permita que o usuário crie sua lista de compras. 
# Primeiramente, solicite que ele informe quantos produtos serão adicionados na lista. 
# Depois disto, peça para que o usuário digite os produtos que ele vai comprar, e armazene em uma lista. 
# Ao final, imprima a lista de compras do usuário.

quantidade = int(input("Por favor, informe quantos produtos serão armazenados na lista: "))
produtos = []

i = 0
while i < quantidade:
    produto = input("Digite o nome do produto que você deseja adicionar à lista: ")
    produtos.append(produto)
    i += 1
print("Aqui está sua lista de compras:")
for i in produtos:
    print(i)