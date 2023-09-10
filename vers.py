idade1 = int(input("Digite uma idade:"))
print(f"Primeira idade é {idade1} anos")

idade2 = int(input("Digite outra idade:"))
print(f"Segunda idade é {idade2}")

if(idade1>idade2):
    diferença = idade1 - idade2
else:
    diferença = idade2 - idade1
print(f"A diferença entre as idades é {diferença} anos")