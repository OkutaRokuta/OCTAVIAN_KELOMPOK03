class method:
    def __init__(self, nama, nim):
        self.nama = nama
        self.nim = nim
    
    def intro(self):
        print(f"Selamat datang di percobaan method! {self.nama} dengan NIM {self.nim}")

    def timer(self, second):
        print("Percobaan akan selesai dalam: ")
        while second > 0:
            print(second)
            second -= 1



