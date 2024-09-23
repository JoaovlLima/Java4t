import java.util.*;


public class main {

    private char[] rotor1;
        private char[] rotor2;
        private char[] rotor3;
        private char[] reflector;
        private int position1 = 0;
        private int position2 = 0;
        private int position3 = 0;
    
        // Configura os rotores e refletor
        public Enigma() {
            rotor1 = "EKMFLGDQVZNTOWYHXUSPAIBRCJ".toCharArray();  // Rotor I
            rotor2 = "AJDKSIRUXBLHWTMCQGZNPYFVOE".toCharArray();  // Rotor II
            rotor3 = "BDFHJLCPRTXVZNYEIWGAKMUSQO".toCharArray();  // Rotor III
            reflector = "YRUHQSLDPXNGOKMIEBFZCWVJAT".toCharArray(); // Reflector B
        }
    
        // Método para cifrar ou decifrar uma mensagem
        public String encrypt(String input) {
            StringBuilder output = new StringBuilder();
    
            for (char c : input.toUpperCase().toCharArray()) {
                if (Character.isLetter(c)) {
                    // Avança os rotores
                    rotateRotors();
                    
                    // Passa pelas substituições dos rotores
                    int index = c - 'A';
                    index = passThroughRotor(index, rotor1, position1);
                    index = passThroughRotor(index, rotor2, position2);
                    index = passThroughRotor(index, rotor3, position3);
    
                    // Refletor
                    index = reflector[index] - 'A';
    
                    // Volta pelos rotores na ordem inversa
                    index = passThroughRotorReverse(index, rotor3, position3);
                    index = passThroughRotorReverse(index, rotor2, position2);
                    index = passThroughRotorReverse(index, rotor1, position1);
    
                    output.append((char) ('A' + index));
                }
            }
    
            return output.toString();
        }
    
        // Passa por um rotor na ordem normal
        private int passThroughRotor(int index, char[] rotor, int position) {
            int shiftedIndex = (index + position) % 26;
            return (rotor[shiftedIndex] - 'A' - position + 26) % 26;
        }
    
        // Passa por um rotor na ordem reversa
        private int passThroughRotorReverse(int index, char[] rotor, int position) {
            int shiftedIndex = (index + position) % 26;
            for (int i = 0; i < 26; i++) {
                if (rotor[i] == (char) ('A' + shiftedIndex)) {
                    return (i - position + 26) % 26;
                }
            }
            return index;
        }
    
        // Método que avança os rotores
        private void rotateRotors() {
            position1 = (position1 + 1) % 26;
            if (position1 == 0) {
                position2 = (position2 + 1) % 26;
                if (position2 == 0) {
                    position3 = (position3 + 1) % 26;
                }
            }
        }
    
        public static void main(String[] args) {
            Enigma enigma = new Enigma();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite a mensagem: ");
            String message = scanner.nextLine();
    
            String encrypted = enigma.encrypt(message);
            System.out.println("Mensagem cifrada: " + encrypted);
    
            // Decifra usando o mesmo processo (como a Enigma real fazia)
            String decrypted = enigma.encrypt(encrypted);
            System.out.println("Mensagem decifrada: " + decrypted);
        }
}
