# non return function 
def non_return_function(nama, nim):
  print("Selamat datang di praktikum Pemrograman Dasar 2025 {} dengan NIM {}".format(nama, nim))


# return function 
def return_func(angka):
  print(f"Angka kalian adalah {angka}")
  if angka % 2 == 0:
    return print("Mengembalikan nilai genap dengan angka {}".format(angka))
  else:
    return print("Mengembalikan nilai ganjil dengan angka {}".format(angka))


# arbitrary function 
def arbitrary_func(*penutup):
  for nama in penutup:
    print(f"Terima kasih {nama}")


# anonymous function 
add = lambda x, y: x + y
result = add(5, 8)

# Menjalan fungsi 
non_return_function("Octa", 21120125120012)
return_func(19)
arbitrary_func("octavian", "oktavian", "octa")
print(add(10, 11))