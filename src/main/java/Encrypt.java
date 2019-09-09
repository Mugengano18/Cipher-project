public class Encrypt {
    private String text;
    public String getPlainText(){
        return text;
    }
    public void setText(String text){
        this.text=text;
    }
    public String Ceaser(String text){
        String encryptedText="";
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        for (int i=0;i < text.length();i++){
            String lowerText=text.toLowerCase().trim();
            int index=alphabet.indexOf(lowerText.charAt(i));
//            System.out.println(index);
            int shift=index+5;
//            System.out.println(shift);
            if (shift<=25){
                char getchar=(alphabet.charAt(shift));
                encryptedText=encryptedText+getchar;
            }
            else if(shift>25){
                int shift2=5-(shift-25);
                char getchar=(alphabet.charAt(shift2));
                encryptedText=encryptedText+getchar;
            }
        }
        return encryptedText ;
    }

}
