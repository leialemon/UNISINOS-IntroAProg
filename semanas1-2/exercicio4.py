nomeUsuario = input("Qual o seu nome? ")
print("Por favor, preencha os campos abaixo de acordo com seu endereço.")
endereco = ("Rua", "Número", "Complemento", "Bairro", "CEP", "Cidade", "Estado")
enderecoDicionario = {"País": "Brasil"}

for i in endereco:
    dadoUsuario = input(f"{i}: ")
    enderecoDicionario[i] = dadoUsuario

output = f"""Aqui está o endereço completo da/o usuária/o {nomeUsuario}: 
Rua: {enderecoDicionario["Rua"]} - {enderecoDicionario["Número"]}
Complemento: {enderecoDicionario["Complemento"]}
Bairro: {enderecoDicionario["Bairro"]} CEP: {enderecoDicionario["CEP"]}
{enderecoDicionario["Cidade"]} - {enderecoDicionario["Estado"]}
"""

print(output)
