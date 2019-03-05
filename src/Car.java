import java.awt.*;

public class Car {

    // Data types;

    double averageMilesPerGallon;
    String licensePlate;
    Color paintColor;
    boolean areTailingWorking;
    double currentSpeed;


    public Car(double inputAverageMilesPerGallon, String inputLicensePlate,
               Color inputPaintColor, boolean inputAreTailingWorking){
        this.averageMilesPerGallon = inputAverageMilesPerGallon;
        this.licensePlate = inputLicensePlate;
        this.paintColor = inputPaintColor;
        this.areTailingWorking = inputAreTailingWorking;
    }

    public void changePaintColor(Color newPaintColor){
        this.paintColor = newPaintColor;
    }

    public double speedingUp(double currentSpeed){
        currentSpeed += 100;
        return currentSpeed;

    }



}
