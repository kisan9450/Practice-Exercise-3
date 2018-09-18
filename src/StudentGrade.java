public class StudentGrade {
    public boolean check(int []marks)
    {   int flag=0;
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]>0 && marks[i]<100)
            {
                flag=1;
            }
            else
            {   flag=0;
                break;
            }
        }
        if(flag==1)
            return true;
        else
            return false;
    }
}