seleccionArgentina = {
    10: {'Nombre': 'Lionel Messi', 'Edad': 36, 'Altura': 1.69, 'Precio': '50 Millones', 'Posicion': 'Extremo movil'},
    11: {'Nombre': 'Julian Alvarez', 'Edad': 25, 'Altura': 1.70, 'Precio': '100 Millones', 'Posicion': 'delantero'},
    24: {'Nombre': 'Marcos Acuña', 'Edad': 33, 'Altura': 1.73, 'Precio': '1.5 Millones', 'Posicion': 'lateral'},
    26: {'Nombre': 'Nahuel Molina', 'Edad': 27, 'Altura': 1.75, 'Precio': '20 Millones', 'Posicion': 'lateral'},
    22: {'Nomnre': 'Lautaro Martinez', 'Edad':28, 'Altura': 1.74, 'Precio':'110 Millones', 'Posicion': 'delantero'},
    20: {'Nombre': 'Alexia Mac Allister', 'Edad': 26, 'Altura': 1.76, 'Precio': '110 Millones', 'Posicion': 'centrocampista'}
}
print(seleccionArgentina)

#Recorremos el Diccionario SaleccionArgentina
for i in seleccionArgentina:
  print(f'{i} -> {seleccionArgentina}[i]')
