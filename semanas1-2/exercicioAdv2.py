
valorA = int(input("Digite o valor de A: "))
valorB = int(input("Digite o valor de B: "))
valorC = int(input("Digite o valor de C: "))

x1 = (-1 * valorB) + ((valorB * valorB) - (4 * valorA * valorC) ** (1/2))
x1 = x1 / (2 * valorA)

x2 = (-1 * valorB) - ((valorB * valorB) - (4 * valorA * valorC) ** (1/2))
x2 = x2 / (2 * valorA)

print(f"As raízes da equação são {x1} e {x2}")
