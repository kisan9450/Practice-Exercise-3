public class ArrayPlaces {
    public String[] removeVowels(String[] input)
    {
        for(int i=0;i<input.length;i++)
        {
            if(input[i].contains("a"))
            {
                input[i]=input[i].replace("a","");
            }

            if(input[i].contains("e"))
            {
                input[i]=input[i].replace("e","");
            }

            if(input[i].contains("i"))
            {
                input[i]=input[i].replace("i","");
            }

            if(input[i].contains("o"))
            {
                input[i]=input[i].replace("o","");
            }

            if(input[i].contains("u"))
            {
                input[i]=input[i].replace("u","");
            }
        }
        return input;
    }
}

