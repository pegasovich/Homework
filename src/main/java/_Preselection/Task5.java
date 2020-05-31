
public class Task5 {


    public static void main(String[] args){
        int[] arr={263,442,324,586,820,273,324,675,786,960};

//searching by using the sequential search technique
        int pos=seqsearch(arr,675, arr.length);
        if(pos!=-1) System.out.println(" The values is found at the position of "+ pos);

    }

    public static int seqsearch(int[] dataset,int target,int n){
        int found=0;
        int i;
        int pos=-1;
        for(i=0;i<n && found!=1;i++)
            if(target==dataset[i]){pos=i;found=1;}

        return pos;
    }

}