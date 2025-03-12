a = int(input("Digite um número inteiro: "))
b = int(input("Digite um número inteiro: "))
c = int(input("Digite um número inteiro: "))
d = int(input("Digite um número inteiro: "))
e = int(input("Digite um número inteiro: "))

def area_do_triangulo(base,altura):
    return ((base * altura) / 2)

def area_do_retangulo(ponto_a,ponto_b,ponto_c,ponto_d):
    return (ponto_a + ponto_b + ponto_c + ponto_d)

def area_do_circulo(raio_e):
    return (3.14 * (raio_e * raio_e))

print(area_do_triangulo(b,c))
print(area_do_retangulo(a,b,c,d))
print(area_do_circulo(e))