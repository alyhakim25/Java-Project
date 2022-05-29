package count.pkgchar.in.string;


public class CountCharInString {


    public static void ignoreCapital(String kata){
        char[] c = kata.toCharArray();
        char[] charGroup = new char[c.length];
        int[] intGroup = new int[c.length];
        int intChar = 0;
        int intTag = 0;
        boolean check = false;
        
        for(int i = 0; i < c.length; i++)
        {
            if(c[i] != ' ')
            {
                for(int j = 0; j < intChar; j++)
                {

                        if(c[i] == charGroup[j])
                        {
                            check = true;
                            intTag = j;
                            break;
                        }
                        else
                        {
                            check = false;
                        }
                }
                if(check == false)
                {
                    charGroup[intChar] = c[i];
                    
                    intGroup[intChar]++;
                    intChar++;    
                }
                else
                {
                    intGroup[intTag]++;
                }
            }
            
        }
        char[] dataStorechar = new char[intChar];
        int[] dataStoreint = new int[intChar];
        int[] selectedChar = new int[intChar];
        int temp = 0;
        int dataSelected = 0;
        int dataChar = 0;
        boolean same = false;
        for(int i = 0; i< intChar; i++)
        {
            same = false;
            for(int j = i+1; j < intChar; j++)
            {
                if(Character.toLowerCase(charGroup[j]) == Character.toLowerCase(charGroup[i]))
                {
                    same = true;
                    //dataStorechar[dataChar] = charGroup[j];
                    selectedChar[dataSelected] = j;
                    temp = j;
                    dataSelected++;
                    //dataChar++;
                    //System.out.println(charGroup[i] + " = " + charGroup[j]);
                    break;
                }
                else
                {
                    
                }
            }
            if(same == true)
            {
                dataStorechar[dataChar] = charGroup[i];
                dataStoreint[dataChar] = intGroup[i];
                dataChar++;
                dataStorechar[dataChar] = charGroup[temp];
                dataStoreint[dataChar] = intGroup[temp];
                dataChar++;
                continue;
            }
            else
            {
                //System.out.println(Integer.toString(dataChar));
                boolean include = false;
                if(i != 0)
                {
                    for(int j = 0; j < selectedChar.length; j++)
                    {
                        //System.out.println(String.valueOf(i) + " = " + String.valueOf(selectedChar[j]));
                        if(i == selectedChar[j])
                        {
                            include = true;
                            break;
                        }
                        else
                        {
                            include = false;
                        }
                    }
                    if(include == false)
                    {
                        dataStorechar[dataChar] = charGroup[i];
                        dataStoreint[dataChar] = intGroup[i];
                        dataChar++;
                    }
                    //System.out.println(String.valueOf(include));
                }
                else
                {
                    //System.out.println(charGroup[i]);
                    dataStorechar[dataChar] = charGroup[i];
                    dataStoreint[dataChar] = intGroup[i];
                    dataChar++;
                }
                
                //System.out.println(charGroup[i]);
            }
            
            //else
            //{
            //    dataStorechar[data] = charGroup[i];
            //    data++;
            //}
            //Capital word ignored
            //System.out.print(charGroup[i]+Integer.toString(intGroup[i]));
        }
        for(int i = 0; i < dataStorechar.length; i++)
        {
            //System.out.println(Integer.toString(selectedChar[i]));
            System.out.println(dataStorechar[i]+Integer.toString(dataStoreint[i]));
        }
        
        //System.out.print(Integer.toString(dataSelectedChar));
    }
    public static void filterCapital(String kata){
        char[] c = kata.toCharArray();
        char[] charGroup = new char[c.length];
        int[] intGroup = new int[c.length];
        int intChar = 0;
        int intTag = 0;
        boolean check = false;
        
        for(int i = 0; i < c.length; i++)
        {
            if(c[i] != ' ')
            {
                for(int j = 0; j < intChar; j++)
                {

                        if(c[i] == charGroup[j] || Character.toLowerCase(c[i]) == Character.toLowerCase(charGroup[j]))
                        {
                            check = true;
                            intTag = j;
                            break;
                        }
                        else
                        {
                            check = false;
                        }
                }
                if(check == false)
                {
                    charGroup[intChar] = c[i];
                    
                    intGroup[intChar]++;
                    intChar++;    
                }
                else
                {
                    intGroup[intTag]++;
                }
            }
            
        }
        
        for(int i = 0; i< intChar; i++)
        {
            //Capital word ignored
            
            
            System.out.print(charGroup[i]+Integer.toString(intGroup[i]));
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String kata = "xaShimi In tHe spRing";
        ignoreCapital(kata);
        //filterCapital(kata);
        
        //[S,a]
        
        
    }
    
}
