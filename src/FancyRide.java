/**
 * Created by skoded001c on 8/30/16.
 */
public class FancyRide {

    String fancyRide(int l, double[] fares) {

        if(l==0 || fares.length==0)
            return null;

        String[] cars = {"UberX", "UberXL", "UberPlus", "UberBlack", "UberSUV"};
        double[] rates = new double[5];
        for(int i=0; i<fares.length;i++){
            double res = fares[i] * l;
            rates[i] = res;
        }
        double smallestDiff = Math.abs(20 - 0);
        int closest = 0; //index of the current closest number
        double currentDiff = 0;
        for (int i = 0; i < rates.length; i++) {
            currentDiff = 20 - rates[i];
            if (currentDiff >= 0 && currentDiff < smallestDiff) {
                smallestDiff = currentDiff;
                closest = i;
            }
        }
        return cars[closest];
    }

}
