nome = input("Digite seu nome: ")
print(f" Seu nome é: {nome}")
numchar = len(nome)
print(f"Seu nome possui {numchar} caracteres")

if(numchar > 8):
    print("Seu nome é Grande.")
else:
    print("Seu nome é pequeno.")
