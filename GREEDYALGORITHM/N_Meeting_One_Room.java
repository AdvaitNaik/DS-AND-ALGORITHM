package GREEDYALGORITHM;

// Vector of three quantities: the starting time, ending time, meeting number
// Sort this data structure in ascending order of end time. 

// Initially, the answer is 1 because the first meeting can always be performed. 
// Make another variable, say limit that keeps track of the ending time of the meeting that was last performed. 
// Initially set limit as the end time of the first meeting.

// Start iterating from the second meeting. At every position we have two possibilities:-

// 1. If the start time of a meeting is  strictly greater than limit we can perform the meeting. 
//    Update the answer.New limit is the ending time of the current meeting since it was last performed.
//    Also update limit.  
// 2. If the start time is less than or equal to limit, skip and move ahead. 
import java.util.*;
class meeting {
    int start;
    int end;
    int pos;
     
    meeting(int start, int end, int pos)
    {
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}

class meetingComparator implements Comparator<meeting>
{
    @Override
    public int compare(meeting o1, meeting o2) 
    {
        if (o1.end < o2.end)
            return -1;
        else if (o1.end > o2.end)
            return 1;
        else if(o1.pos < o2.pos)
            return -1;
        return 1; 
    }
}


public class N_Meeting_One_Room {
    static void maxMeetings(int start[], int end[], int n){
        ArrayList<meeting> meet = new ArrayList<>();
        for (int i = 0; i < start.length; i++)
            meet.add(new meeting(start[i], end[i], i+1));

        meetingComparator mc = new meetingComparator();
        Collections.sort(meet, mc);

        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(meet.get(0).pos);
        int limit = meet.get(0).end;
        for (int i = 1; i < start.length; i++){
            if (meet.get(i).start > limit){
                limit = meet.get(i).end;
                answer.add(meet.get(i).pos);
            }
        }
        System.out.println("The order in which the meetings will be performed is ");
        for(int i = 0;i<answer.size(); i++) {
            System.out.print(answer.get(i) + " ");
        }

    }

    public static void main(String args[])
    {
        int n = 6;
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,5,7,9,9};
        maxMeetings(start,end,n);
        
    }

}