public class MyAdd <D>{
    public D addTwoThings(D a,D b){
        if(a.equals(b))
            return a;
        else 
            return b;
    }
}