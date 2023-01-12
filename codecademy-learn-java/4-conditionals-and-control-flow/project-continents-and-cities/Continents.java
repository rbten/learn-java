public class Continents {
  int continent = 0;

  public Continents(int aNumber) {
    continent = aNumber;
  }

  public Continents() {
  }

  public String printContinentAndCity() {
    String continentAndCity = "Undefined continent!";
    switch (continent) {
      case 1:
        continentAndCity = "Mexico City, Mexico";
        break;
      case 2:
        continentAndCity = "South America: Sao Paulo, Brazil";
        break;
      case 3:
        continentAndCity = "Europe: Moscow, Russia";
        break;
      case 4:
        continentAndCity = "Africa: Lagos, Nigeria";
        break;
      case 5:
        continentAndCity = "Asia: Shanghai, China";
        break;
      case 6:
        continentAndCity = "Australia: Sydney, Australia";
        break;
      case 7:
        continentAndCity = "Antarctica: McMurdo Station, USo";
        break;
    }

    return continentAndCity;
  }

  public static void main(String[] args) {
    Continents aContinent = new Continents(7);
    System.out.println(aContinent.printContinentAndCity());
  }
}