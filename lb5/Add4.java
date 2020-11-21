package lb5;

public class Add4 {

    int x;
    char ch;

    Add4 (int nx, char nch) {
        x=nx;
        ch=nch;
        System.out.println("Селочисленное поле было "+x);
        System.out.println("Символьное поле было "+ch);
    }


    Add4(double d) {
        String strd = String.valueOf(d);
        String [] p = strd.split("\\.");
        x= Integer.parseInt(p[0]);
        ch=(char)x;
        x= Integer.parseInt(p[1]);
        x=x/100;
        p = strd.split("\\.");
        System.out.println("Целочисленное поле стало "+x);
        System.out.println("Символьное поле стало "+ch);






    }





}



