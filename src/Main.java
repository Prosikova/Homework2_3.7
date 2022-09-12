public class Main {
    public static void main(String[] args) {
var boxerWeightOne = 78.2;
var boxerWeightTwo = 82.7;
var weightDifferenceFirstVar = boxerWeightTwo - boxerWeightOne;
        System.out.println("Разница в весе боксеров " + weightDifferenceFirstVar + " кг!");
        var weightDifferenceSecondVar = (boxerWeightOne+boxerWeightTwo) % boxerWeightOne;
        System.out.println("Разница в весе боксеров " + weightDifferenceSecondVar + " кг!");
    }
}
