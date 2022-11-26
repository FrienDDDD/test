import java.util.ArrayList;

public class Lab02 {
    public class AirPurifier {
        String model;
        int[] dimensions = new int[3];
        double weight;
        int consumption;
        double cost;
        double[] color = new double[3]; //RGB value in arithmetic notation (from 0. to 1.)
        boolean power = false;


        AirPurifier(String model_, int[] dimensions_, double weight_, int consumption_, double cost_, double[] color_){
            model = model_;
            dimensions = dimensions_;
            weight = weight_;
            consumption = consumption_;
            cost = cost_;
            color = color_;
            count++;
        }

        void toggle(){
            power = (power ? false : true);
        }

        double getDuration(double unit){ // return how much the AirPurifier will work with certian amount of energy (watt/hour)
            return unit/consumption; // return unit is hours
        }

        void disp(){;
            System.out.println("Model : " + model);
            System.out.println("Size : " + dimensions[0] + "*" + dimensions[1] + "*" + dimensions[2] + " mm");
            System.out.println("Weight : " + weight + " kg");
            System.out.println("Electrical consumption : " + consumption + " watts");
            System.out.println("Cost : " + cost + " Baht");
            System.out.println("Color : RGB(" + color[0] + "," + color[1] + "," + color[2] + ")");
            System.out.println("Status : " + (power ? "On" : "Off"));
        }

        void disp(String str){
            switch (str.toLowerCase()) {
                case "model":
                    System.out.println("Model : " + model);
                    break;
                case "size":
                    System.out.println("Size : " + dimensions[0] + "*" + dimensions[1] + "*" + dimensions[2] + " mm");
                    break;
                case "weight":
                    System.out.println("Weight : " + weight + " kg");
                    break;
                case "consumption":
                    System.out.println("Electrical consumption : " + consumption + " watts");
                    break;
                case "cost":
                    System.out.println("Cost : " + cost + " Baht");
                    break;
                case "color":
                    System.out.println("Color : RGB(" + color[0] + "," + color[1] + "," + color[2] + ")");
                    break;
                case "status":
                    System.out.println("Status : " + (power ? "On" : "Off"));
                    break;
                default:
                    this.disp();
            }

        }

        static int count = 0;
        static ArrayList<AirPurifier> AP = new ArrayList<>();
        static void printCount() {
            System.out.println(count);
        }
        static void dispAll() {
            System.out.println("Model\tDimensions (mm_cubed)\tWeight (kg)\tConsumption (watts)\tCost (Baht)\tColor\tStatus");
            for(AirPurifier ap : AP){
                System.out.println(ap.model+"\t"+ap.dimensions[0]+ap.dimensions[1]+ap.dimensions[2]+"\t"+ap.weight+"\t"+ap.consumption+"\t"+ap.cost+"\tR("+ap.color[0]+","+ap.color[1]+","+ap.color[2]+")\t"+ap.power);
            }
        }
    }

    public static void main(String[] args) {
        Lab02.AirPurifier ap1 = new Lab02().new AirPurifier("k", new int[] {100,100,100}, 4.4, 63, 5000, new double[] {1,1,1});
        ap1.disp();
        System.out.println(Lab02.AirPurifier.count);
    }
}
