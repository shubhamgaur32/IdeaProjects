public class CalculateSeasonSwitch {
    public static void main(String[] args) {
        int month=11;
        String season;
        switch (month){
            case 1: case 2: case 12:
                season="winter";
                break;
            case 3: case 4: case 5:
                season="Summer";
                break;
            case 6: case 7: case 8:
                season="Spring";
                break;
            case 9: case 10: case 11:
                season="Autumn";
                break;
            default:
                season="Incorrect Month";
        }
        System.out.println("The Season for month:"+month+"is :"+season);
    }
}
