numbers = [1, 2, 3, 4, 5]  # Aún con la lista vacía se va a ejecutar el else

for n in numbers:
    print(n)
    if n == 3:
        break  # Esta es la única manera para que no se ejecute el else
else:
    print('Esto se terminó')