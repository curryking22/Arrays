public class arrays_test {

public static void main(String[] args) {


int[] array = {4,8,4,2,9,6,8,3,1,2};
int arraylenght = array.length;
int summe = 0;
System.out.println(arraylenght);


for (int i = 0; i < array.length; i++) {
    
    summe += i;

}

double Durchschnitt = summe/arraylenght;
System.out.println(Durchschnitt);
    }
        }

    