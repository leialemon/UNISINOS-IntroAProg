print("Vamos calcular sua nota final!")
notaTrabalho = float(input("Digite a nota do trabalho: "))
notaProva = float(input("Digite a nota da prova: "))
notaTeste = float(input("Digite a nota do teste: "))

notaFinal = (notaTrabalho * 0.1)+(notaProva * 0.6)+(notaTeste * 0.3) 

print("Sua nota final é", notaFinal)