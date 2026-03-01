public class UC4OOPSBannerApp {
    public static void main(String[] args) {

        // Store all banner lines in a String array
        String[] bannerLines = new String[7];

        bannerLines[0] = " ********  ********  ********  ******** ";
        bannerLines[1] = " *      *  *      *  *      *  *        ";
        bannerLines[2] = " *      *  *      *  *      *  *        ";
        bannerLines[3] = " *      *  *      *  ********  ******** ";
        bannerLines[4] = " *      *  *      *  *              *  ";
        bannerLines[5] = " *      *  *      *  *              *  ";
        bannerLines[6] = " ********  ********  *          ******** ";

        // Print each line using for-each loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}