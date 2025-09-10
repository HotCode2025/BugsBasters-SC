def multiplicar_valores(*args):
    if len(args) == 0:
        raise ValueError("Se requieren al menos un valor numérico")
    producto = 1.0
    all_ints = True
    for i, v in enumerate(args, start=1):
        try:
            num = float(v)
        except (TypeError, ValueError):
            raise TypeError(f"El argumento #{i} ({v!r}) no es numérico ni convertible a número.")
        if not num.is_integer():
            all_ints = False
        producto *= num
    return int(producto) if all_ints else producto

if _name_ == "_main_":
    print("multiplicar_valores(2,3,4) ->", multiplicar_valores(2, 3, 4))
    print("multiplicar_valores(1.5,2) ->", multiplicar_valores(1.5, 2))
    print("multiplicar_valores('3','4') ->", multiplicar_valores("3", "4"))
