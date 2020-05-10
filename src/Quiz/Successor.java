package Quiz;

public class Successor {

    int[] numbers;

    public Successor(int N){

        numbers = new int[N];
        for ( int i = 0; i < N; i++){
            numbers[i] = i;
        }

    }

    public int remove( int i){
        if( i == numbers[i])
        {numbers[i] = 0; i = numbers[i+1];}
        else
            i = i+1;

        return i;
    }
}
