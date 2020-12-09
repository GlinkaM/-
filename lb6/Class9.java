package lb6;

public class Class9 {

    static void permutatio (char[]arrch) {
        char[] arrchn = new char [arrch.length];

        for (int i=0; i<arrch.length; i++) {
            arrchn[i]=arrch[arrch.length-1-i];
            System.out.print(arrchn[i]+" ");
        }

    }
}

