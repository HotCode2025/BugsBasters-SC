# List comprehension, lista de comprensión
names = ["Paolo", "Rodrigo", "Lupe", "Pepe"]

aLongP = [p for p in names if p[0] == 'P'] # Esto regresa una nueva lista
print(aLongP)

bottleC = [{"name": "Quilmes", "country": "Arg"},
           {"name": "Corona", "country": "Mx"},
           {"name": "Stella Artois", "country": "Belgium"}]

arg = [b for b in bottleC if b["country"] == "Arg"]
print(arg)
print(bottleC)