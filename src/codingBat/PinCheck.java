package codingBat;

public class PinCheck {
    public static void main(String[] args) {
        PinCheck pin = new PinCheck();
        System.out.println(pin.validatePin("1234",args));
        System.out.println(pin.validatePin("1034",args));
        System.out.println(pin.validatePin("12345",args));
        System.out.println(pin.validatePin("123",args));
        System.out.println(pin.validatePin("0234",args));
    }

    public String validatePin(String correctPin, String[] pin) {
        String wynik="";
        String[] corrPin = correctPin.split("");
        if (pin.length == corrPin.length) {
            for (int i = 0; i < pin.length; i++) {
                if (corrPin[i].equals(pin[i])) {
                    wynik += "pass\n";
                } else {
                    wynik += "fail";
                    break;
                }
            }
        } else {
            wynik = "piny roznia sie dlugoscia";
        }
        return wynik;
    }
}
