
def calcular_nota_grau_a(atv_pratica, atv_teorica):
    return (atv_pratica * 0.45) + (atv_teorica * 0.55)

def calcular_nota_grau_b(prova, teste, trabalho):
    return (prova * 0.6) + (teste * 0.2) + (trabalho * 0.2)


grauA1 = float(input("Digite a nota da atividade prática: "))
grauA2 = float(input("Digite a nota da atividade teórica: "))
grauB1 = float(input("Digite a nota da Prova em laboratório: "))
grauB2 = float(input("Digite a nota do Teste teórico: "))
grauB3 = float(input("Digite a nota do Trabalho Extraclasse: "))

notaGrauA = calcular_nota_grau_a(grauA1, grauA2)
notaGrauB = calcular_nota_grau_b(grauB1, grauB2, grauB3)
notaFinal = (notaGrauA * 0.33) + (notaGrauB * 0.67)
print("A nota final é:", notaFinal)