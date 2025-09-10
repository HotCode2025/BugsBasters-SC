def calcular_pago_con_impuesto(pago_sin_impuesto, impuesto):
    pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto / 100)
    return pago_total

# Ejemplo de uso
pago = float(input("Proporcione el pago sin impuesto: "))
iva = float(input("Proporcione el monto del impuesto (%): "))

total = calcular_pago_con_impuesto(pago, iva)

print(f"Pago con impuesto: {total}")
