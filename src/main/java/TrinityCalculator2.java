package edu.trinity;

public class TrinityCalculator2 {
    public boolean sumIsEven(int arg1, int arg2){
        int result = arg1 + arg2;
        if (result%2==0) {
            return true;
        }
        else
            return false;
    }
    public boolean productIsEven(int arg1, int arg2){
        int result = arg1 * arg2;
        if (result%2==0) {
            return true;
        }
        else
            return false;
    }
}