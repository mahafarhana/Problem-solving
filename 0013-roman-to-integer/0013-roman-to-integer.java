class Solution {
    public int romanToInt(String s) {
        Map<String,Integer>map=new HashMap<String,Integer>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        int secondValue=0;
        int sum=0;
        char[] a=s.toCharArray();
        for(int i=a.length-1;i>=0;i--){
            int firstValue=Integer.valueOf(map.get(Character.toString(a[i])));
            if(i>0){
              secondValue=Integer.valueOf(map.get(Character.toString(a[i-1])));   
            }
            if(firstValue>secondValue && i!=0){
               sum+= firstValue-secondValue;
                i--;
               
            }else{
                sum+= firstValue;  
            }
        }
        
        return sum;
    }
}