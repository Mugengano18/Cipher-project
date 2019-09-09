public class Decrypt {
    private String DecriptText;
    public String getDecriptText(){
        return DecriptText;
    }
    public void setText(String DecriptText){
        this.DecriptText=DecriptText;
    }
    public String cipher(String DecriptText) {
        String inverse = "";
        String inverseAlpha = "zyxwvutsrqponmlkjihgfedcba";
        for (int i = 0; i < DecriptText.length(); i++) {
            String lowerText = DecriptText.toLowerCase().trim();
            int index = inverseAlpha.indexOf(lowerText.charAt(i));
//            System.out.println(index);
            int shift = index + 5;
//            System.out.println(shift);
            if (shift <= 25) {
                char getchar = (inverseAlpha.charAt(shift));
                inverse = inverse + getchar;
            } else if (shift > 25) {
                int shift2 = 5 - (shift - 25);
                char getchar = (inverseAlpha.charAt(shift2));
                inverse = inverse + getchar;
            }
        }
        return inverse;
    }
}
