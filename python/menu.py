# menu.py

def somar(a, b):
    return a + b

def subtrair(a, b):
    return a - b

def multiplicar(a, b):
    return a * b

def dividir(a, b):
    if b == 0:
        return "Erro! Divisão por zero."
    return a / b

def menu():
    while True:
        print("\nEscolha uma operação:")
        print("1. Somar")
        print("2. Subtrair")
        print("3. Multiplicar")
        print("4. Dividir")
        print("0. Sair")
        
        opcao = input("Digite o número da opção desejada: ")
        
        if opcao == "0":
            print("Saindo...")
            break
        
        if opcao not in ["1", "2", "3", "4"]:
            print("Opção inválida. Tente novamente.")
            continue
        
        try:
            num1 = float(input("Digite o primeiro número: "))
            num2 = float(input("Digite o segundo número: "))
        except ValueError:
            print("Por favor, insira números válidos.")
            continue
        
        if opcao == "1":
            print(f"O resultado da soma é: {somar(num1, num2)}")
        elif opcao == "2":
            print(f"O resultado da subtração é: {subtrair(num1, num2)}")
        elif opcao == "3":
            print(f"O resultado da multiplicação é: {multiplicar(num1, num2)}")
        elif opcao == "4":
            print(f"O resultado da divisão é: {dividir(num1, num2)}")

if __name__ == "__main__":
    menu()
