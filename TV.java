class TV{
  int polegadas;
  int volume=5;
  string marca;
  int voltagem;
  int canal;
  void ligar() {
}    
  void desligar() {
}    
  void aumentarvolume() {
    if (volume<10) {
      volume++;
    }
    return volume;
}    
  void diminuirvolume() {
     if (volume>1) {
      volume--;
     }
    return volume;
  }
  void mudarcanalcima() {
    if (canal<5) {
      canal++;
    }
    return canal;
  }
  void mudarcanalbaixo() {
 if (canal>1) {
      canal--;
    }
    return canal;
  }
