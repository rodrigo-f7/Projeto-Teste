nome = input("Digite seu nome: ")
print(f" Seu nome é: {nome}")
numchar = len(nome)
print(f"Seu nome possui {numchar} caracteres")

def elevar_ao_quadrado(numchar):
    return numchar**2
def raiz_quadrada(numchar):
    return numchar**(1/2)

if(numchar > 8):
    print("Seu nome é Grande.")
    elevar = elevar_ao_quadrado(numchar)
    print(f"O número de caracteres ao quadrado é {elevar}")
else:
    print("Seu nome é pequeno.")
    raiz = round(raiz_quadrada(numchar), 4)
    print(f"A raiz quadrada do número de caracteres é {raiz}")
