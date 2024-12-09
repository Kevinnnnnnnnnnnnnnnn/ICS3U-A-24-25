package day1;

public class Lottery {
    
    private int numberOfNumbers;
    private int range;
    private String generatedNumbers;

    public Lottery(int n, int r) {
        numberOfNumbers = n;
        range = r;
        generatedNumbers = "";
    }

    public void generateNumbers() {
        int nOuN = (int)Math.random() * range + 1;
        while(nOuN != numberOfNumbers) {
            String NoUn = "" + nOuN;
            if (NoUn.indexOf(generatedNumbers) >= 0) {
                continue;
            } else {
                generatedNumbers += NoUn + " ";
            }
            nOuN = (int)Math.random() * range + 1;
        }
    }

    public void displayNumbers(){
        int number = 1;
        String num = "";
        for(int i = 0; i < generatedNumbers.length(); i++){
            if (generatedNumbers.substring(i,i+1).equals(" ")){
                System.out.println("Number" + number);
            }
        }
        // generatedNumbers = generatedNumbers.substring(0, generatedNumbers.length() - 1);
        // int indexSpace1 = 0;
        // int indexSpace2 = 0;
        // int n = 1;
        // for (int i = 0; i < generatedNumbers.length() - 1; i++) {
        //     for (int j = 1; j < generatedNumbers.length(); j++) {
        //         if (!generatedNumbers.substring(i, i + j).equals(" ")) {
        //             System.out.println("Number " + n + generatedNumbers.substring(i, i + j));
        //             n++;
        //         }
        //     }
        // }

    }
}
