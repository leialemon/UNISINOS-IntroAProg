# Crie um programa que recebe um valor inteiro referente a um determinado ano. Imprima na tela se o ano informado é bissexto ou não (para simplificar, você pode utilizar apenas a informação de o ano é divisível por 4 ou não).

ano = int(input("Informe um ano: "))

if (ano % 4) == 0:
    print(f"O ano {ano} é bissexto!")
else:
    print(f"O ano {ano} não é bissexto!")