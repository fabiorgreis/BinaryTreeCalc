package number;

public class CalcNumber{

    public int calcNumber(int a, int b){
        String astr = a + "";
        String bstr = b + "";
        String cstr = "";
        char[] aarray = astr.toCharArray();
        char[] barray = bstr.toCharArray();
        int idx_max = aarray.length;
        if(idx_max < barray.length){
            idx_max = barray.length;
        }
        for(int i=0; i < idx_max;i++){
            if(i < aarray.length)            
                cstr += aarray[i];
            if(i < barray.length)            
                cstr += barray[i];
        }
        int value = Integer.parseInt(cstr);
        if(value > 1000000){
            value = -1;
        }
        return value;
    }
}