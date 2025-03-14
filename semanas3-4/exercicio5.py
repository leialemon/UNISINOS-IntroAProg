# Crie um programa que solicita que o usuário digite uma letra e imprime na tela se a letra é uma vogal ou uma consoante.
letra = input("Por favor, digite uma letra: ")

match letra:
    case "a":
        print(f"A letra {letra} é uma vogal")
    case "A":
        print(f"A letra {letra} é uma vogal")
    case "e":
        print(f"A letra {letra} é uma vogal")
    case "E":
        print(f"A letra {letra} é uma vogal")
    case "i":
        print(f"A letra {letra} é uma vogal")
    case "I":
        print(f"A letra {letra} é uma vogal")
    case "o":
        print(f"A letra {letra} é uma vogal")
    case "O":
        print(f"A letra {letra} é uma vogal")
    case "u":
        print(f"A letra {letra} é uma vogal")
    case "U":
        print(f"A letra {letra} é uma vogal")
    case _ :
        print(f"A letra {letra} é uma consoante")  